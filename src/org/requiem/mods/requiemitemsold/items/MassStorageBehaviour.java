// 
// Decompiled by Procyon v0.5.30
// 

package org.requiem.mods.requiemitemsold.items;

import com.wurmonline.server.behaviours.Seat;
import com.wurmonline.server.behaviours.Vehicle;
import com.wurmonline.server.creatures.Creature;
import com.wurmonline.server.items.Item;
import org.gotti.wurmunlimited.modsupport.vehicles.ModVehicleBehaviour;
import org.gotti.wurmunlimited.modsupport.vehicles.VehicleFacade;

import java.util.logging.Logger;

public class MassStorageBehaviour extends ModVehicleBehaviour
{
    public static Logger logger;
    
    public void setSettingsForVehicle(final Creature creature, final Vehicle vehicle) {
    }
    
    public void setSettingsForVehicle(final Item item, final Vehicle v) {
        MassStorageBehaviour.logger.info("Setting vehicle behaviour for item " + item.getTemplate().getTemplateId());
        final VehicleFacade vehicle = this.wrap(v);
        vehicle.createPassengerSeats(0);
        vehicle.setSeatFightMod(0, 0.7f, 0.4f);
        vehicle.setSeatOffset(0, 0.0f, 1.5f, -0.2f);
        vehicle.setCreature(false);
        vehicle.setEmbarkString("enter");
        vehicle.setName(item.getName());
        vehicle.setMaxDepth(9000.0f);
        vehicle.setMaxHeightDiff(0.0f);
        vehicle.setCommandType((byte)2);
        final Seat[] hitches = { this.createSeat((byte)2) };
        hitches[0].offx = 3.0f;
        hitches[0].offy = 0.0f;
        vehicle.addHitchSeats(hitches);
    }
    
    static {
        MassStorageBehaviour.logger = Logger.getLogger(MassStorageBehaviour.class.getName());
    }
}
