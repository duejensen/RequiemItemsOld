// 
// Decompiled by Procyon v0.5.30
// 

package org.requiem.mods.requiemitemsold.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TweakApiPerms
{
    private static final Logger logger;
    private static final ClassMap classmap;
    
    public static Class getClass(final String name) {
        return TweakApiPerms.classmap.getClass(name);
    }
    
    public static boolean setItemField(final Object item, final String fieldName, final Object valu) {
        Field field = null;
        final Class clas = item.getClass();
        try {
            field = clas.getDeclaredField(fieldName);
        }
        catch (NoSuchFieldException e) {
            TweakApiPerms.logger.log(Level.SEVERE, String.format("No Such Field: %s on %s", fieldName, clas.getName()));
            return false;
        }
        field.setAccessible(true);
        try {
            field.set(item, valu);
        }
        catch (IllegalAccessException e2) {
            TweakApiPerms.logger.log(Level.SEVERE, "setItemField Illegal: " + fieldName);
            return false;
        }
        return true;
    }
    
    public static Method getClassMeth(final String cname, final String mname, final String... params) {
        Method meth = null;
        final Class[] ptypes = TweakApiPerms.classmap.getClassArray(params);
        if (ptypes == null) {
            return null;
        }
        final Class clas = TweakApiPerms.classmap.getClass(cname);
        if (clas == null) {
            return null;
        }
        try {
            meth = clas.getDeclaredMethod(mname, (Class[])ptypes);
        }
        catch (NoSuchMethodException e) {
            TweakApiPerms.logger.log(Level.SEVERE, "Method Not Found: " + mname);
            return null;
        }
        meth.setAccessible(true);
        return meth;
    }
    
    static {
        logger = Logger.getLogger("TweakApiPerms");
        classmap = new ClassMap();
    }
}
