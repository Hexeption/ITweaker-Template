package uk.co.hexeption.client.utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import uk.co.hexeption.client.Client;

/**
 * Created by Hexeption on 29/12/2016.
 */
public class LogHelper {

    private static final String RESET = "\u001B[0m";

    private static final String CYAN = "\u001B[36m";

    private static void log(Level level, Object message) {

        Logger logger = LogManager.getLogger("Client");

        logger.log(level, "[" + CYAN + Client.INSTANCE.clientName + RESET + "] " + String.valueOf(message));
    }

    /**
     * No events will be logged.
     *
     * @param message
     */
    public static void off(Object message) {

        log(Level.OFF, message);
    }

    /**
     * A severe error that will prevent the application from continuing.
     *
     * @param message
     */
    public static void fatal(Object message) {

        log(Level.FATAL, message);
    }

    /**
     * An error in the application, possibly recoverable.
     *
     * @param message
     */
    public static void error(Object message) {

        log(Level.ERROR, message);
    }

    /**
     * An event that might possible lead to an error.
     *
     * @param message
     */
    public static void warn(Object message) {

        log(Level.WARN, message);
    }

    /**
     * An event for informational purposes.
     *
     * @param message
     */
    public static void info(Object message) {

        log(Level.INFO, message);
    }

    /**
     * A general debugging event.
     *
     * @param message
     */
    public static void debug(Object message) {

        log(Level.DEBUG, message);
    }

    /**
     * A fine-grained debug message, typically capturing the flow through the application.
     *
     * @param message
     */
    public static void tace(Object message) {

        log(Level.TRACE, message);
    }

    /**
     * All events should be logged.
     *
     * @param message
     */
    public static void all(Object message) {

        log(Level.ALL, message);
    }

    public static void section(String message) {

        info(StringUtils.center(" " + message + " ", 70, '='));
    }
}