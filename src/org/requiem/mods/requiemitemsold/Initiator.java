
package org.requiem.mods.requiemitemsold;

import com.wurmonline.server.items.NoSuchTemplateException;
import org.gotti.wurmunlimited.modloader.classhooks.HookException;
import org.gotti.wurmunlimited.modloader.interfaces.*;
import org.gotti.wurmunlimited.modsupport.actions.ModActions;
import org.requiem.mods.requiemitemsold.items.SpecialItems;
import org.requiem.mods.requiemitemsold.items.actions.ReceiveMailAction;
import org.requiem.mods.requiemitemsold.items.actions.UnequipAllAction;
import org.requiem.mods.requiemitemsold.items.bulk.RequiemCreationEntries;
import org.requiem.mods.requiemitemsold.mastercraft.Mastercraft;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Properties;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Initiator implements WurmServerMod, ServerStartedListener, ItemTemplatesCreatedListener, Configurable, PreInitable
{
    private static Logger logger = Logger.getLogger(Initiator.class.getName());
    boolean bDebug = false;

    public void preInit() {
        logger.info("Pre-Initializing.");
        try {
            ModActions.init();
            Mastercraft.addNewTitles();
        } catch (IllegalArgumentException | ClassCastException e) {
            throw new HookException(e);
        }
    }
    
    public void init() {
        Mastercraft.changeExistingTitles();
    }
    
    public void onItemTemplatesCreated() {
        logger.info("Creating Item Mod items.");
            ItemMod.createItems();
            SpecialItems.addHolyBook();
            SpecialItems.addTownPortal();
        try {
            logger.info("Editing existing item templates.");
            ItemMod.modifyItems();
        } catch (NoSuchTemplateException | IllegalAccessException | NoSuchFieldException e) {
            e.printStackTrace();
        }
        logger.info("Registering permissions hook for custom items.");
            ItemMod.registerPermissionsHook();
            logger.info("Registering Custom actions.");
            ModActions.registerAction(new UnequipAllAction());
            ModActions.registerAction(new ReceiveMailAction());
    }
    
    public void onServerStarted() {
        try {
            new RequiemCreationEntries();
            SpecialItems.initCreationEntry();
            logger.info("Registering Item Mod creation entries.");
            ItemMod.initCreationEntries();
            logger.info("Registering Item Mod actions.");
            ItemMod.registerActions();
        }
        catch (Throwable e) {
            logger.log(Level.SEVERE, "Error in onServerStarted()", e);
        }
    }
    
    public void configure(Properties properties) {
        this.bDebug = Boolean.parseBoolean(properties.getProperty("debug", Boolean.toString(this.bDebug)));
        try {
            String logsPath = Paths.get("mods") + "/logs/";
            File newDirectory = new File(logsPath);
            if (!newDirectory.exists()) {
                newDirectory.mkdirs();
            }
            FileHandler fh = new FileHandler(String.valueOf(String.valueOf(logsPath)) + this.getClass().getSimpleName() + ".log", 10240000, 200, true);
            if (this.bDebug) {
                fh.setLevel(Level.INFO);
            } else {
                fh.setLevel(Level.WARNING);
            }
            fh.setFormatter(new SimpleFormatter());
            logger.addHandler(fh);
        }
        catch (IOException ie) {
            System.err.println(String.valueOf(this.getClass().getName()) + ": Unable to add file handler to logger");
        }
        //this.logger.log(Level.INFO, "Property: " + this.somevalue);
        this.Debug("Debugging messages are enabled.");
    }

    private void Debug(String x) {
        if (this.bDebug) {
            System.out.println(String.valueOf(this.getClass().getSimpleName()) + ": " + x);
            System.out.flush();
            logger.log(Level.INFO, x);
        }
    }
}
