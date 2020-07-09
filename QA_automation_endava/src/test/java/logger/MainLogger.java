package logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// TODO: Auto-generated Javadoc

public class MainLogger {


    private Logger log;

// Instantiates a new main logger.

    public MainLogger(@SuppressWarnings("rawtypes") Class claz) {
        log = LogManager.getLogger(claz);
    }


     // Gets the logger.

    public Logger getLogger() {
        return log;
    }


    public static Logger logger() {
        Logger log = LogManager.getLogger("console");
        return log;
    }

}
