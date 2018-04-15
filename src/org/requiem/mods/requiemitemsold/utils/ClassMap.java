// 
// Decompiled by Procyon v0.5.30
// 

package org.requiem.mods.requiemitemsold.utils;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClassMap
{
    private HashMap<String, Class> basemap;
    private static final Logger logger;
    
    public ClassMap() {
        (this.basemap = new HashMap<String, Class>()).put("int", Integer.TYPE);
        this.basemap.put("float", Float.TYPE);
    }
    
    public Class getClass(final String name) {
        final Class retval = this.basemap.get(name);
        if (retval != null) {
            return retval;
        }
        try {
            return Class.forName(name);
        }
        catch (ClassNotFoundException e) {
            ClassMap.logger.log(Level.SEVERE, "ClassMap Couldn't Find: " + name);
            return null;
        }
    }
    
    public Class[] getClassArray(final String... names) {
        final LinkedList<Class> clss = new LinkedList<Class>();
        for (final String name : names) {
            final Class pcls = this.getClass(name);
            if (pcls == null) {
                return null;
            }
            clss.add(pcls);
        }
        return clss.toArray(new Class[0]);
    }
    
    static {
        logger = Logger.getLogger("ClassMap");
    }
}
