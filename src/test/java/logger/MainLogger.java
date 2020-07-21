package logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MainLogger {

    private static Logger fileLogger;

    public static void log(String logMsg, Class c) {
        logFile(logMsg, c);
    }

    private static void logFile(String logMsg, Class c){
        if(fileLogger == null) {
            fileLogger = LogManager.getLogger(c);
        }
        fileLogger.info(logMsg);
    }
}
