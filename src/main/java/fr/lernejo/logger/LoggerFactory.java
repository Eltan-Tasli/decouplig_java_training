package fr.lernejo.logger;

public class LoggerFactory {

    public static Logger getLogger(String name) {
        Logger log = new ConsoleLogger();
        return log;

    }
}
