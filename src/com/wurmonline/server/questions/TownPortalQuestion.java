// 
// Decompiled by Procyon v0.5.30
// 

package com.wurmonline.server.questions;

import com.wurmonline.server.NoSuchItemException;
import com.wurmonline.server.creatures.Creature;
import com.wurmonline.server.items.Item;

import java.util.Properties;
import java.util.logging.Logger;

public class TownPortalQuestion extends Question
{
    private static final Logger logger;
    
    public TownPortalQuestion(final Creature aResponder, final Item target) {
        super(aResponder, "Teleport Home", "Do you really want to teleport home?", 200, aResponder.getWurmId());
    }
    
    public void answer(final Properties answers) {
        final String key = "port";
        final String val = answers.getProperty("port");
        if (val != null) {
            if (val.equals("townportal")) {
                try {
                    short[] tokenCoords;
                    try {
                        tokenCoords = this.getResponder().getCitizenVillage().getTokenCoords();
                    }
                    catch (NoSuchItemException nsi) {
                        tokenCoords = this.getResponder().getCitizenVillage().getSpawnPoint();
                    }
                    this.getResponder().setTeleportPoints(tokenCoords[0], tokenCoords[1], 0, 0);
                    if (this.getResponder().startTeleporting()) {
                        this.getResponder().getCommunicator().sendNormalServerMessage("You feel a slight tingle in your spine and your hair stands on end.");
                        this.getResponder().getCommunicator().sendTeleport(false);
                    }
                }
                catch (Exception ex2) {
                    this.getResponder().getCommunicator().sendNormalServerMessage("You hold up the scroll and read the inscriptions... Nothing happens.");
                }
            }
            else {
                this.getResponder().getCommunicator().sendNormalServerMessage("You decide not to teleport home and try walking instead.");
            }
        }
    }
    
    public void sendQuestion() {
        final StringBuilder buf = new StringBuilder();
        buf.append(this.getBmlHeader());
        buf.append("text{text=''}");
        buf.append("radio{ group='port'; id='townportal';text='Town Portal'}");
        buf.append("radio{ group='port'; id='false';text='Do nothing';selected='true'}");
        buf.append(this.createAnswerButton2());
        this.getResponder().getCommunicator().sendBml(150, 230, true, true, buf.toString(), 150, 150, 200, this.title);
    }
    
    static {
        logger = Logger.getLogger(Question.class.getName());
    }
}
