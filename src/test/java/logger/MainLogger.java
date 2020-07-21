package logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class MainLogger {


    private Logger log;

    public Logger getLogger() {
        return log;
    }

    public static Logger logger() {
        Logger log = LogManager.getLogger();
        return log;
    }

}
