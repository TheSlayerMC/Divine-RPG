package net.divinerpg.helper;

import java.util.logging.Level;
import java.util.logging.Logger;

import net.divinerpg.lib.Reference;
import cpw.mods.fml.common.FMLLog;

public class LogHelper {

    private static Logger DivineLogger = Logger.getLogger(Reference.MOD_ID);

    public static void init() {

        DivineLogger.setParent(FMLLog.getLogger());
    }

    public static void log(Level logLevel, String message) {

        DivineLogger.log(logLevel, message);
    }

    public static void severe(String message)
    {
        DivineLogger.log(Level.SEVERE, message);
    }


    public static void warning(String message)
    {
        DivineLogger.log(Level.WARNING, message);
    }


    public static void info(String message)
    {
        DivineLogger.log(Level.INFO, message);
    }

}
