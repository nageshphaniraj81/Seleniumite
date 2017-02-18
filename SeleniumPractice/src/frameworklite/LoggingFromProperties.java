package frameworklite;

import org.apache.log4j.*;

/**
 * Trace
 * Debug
 * Info
 * Warn
 * Error
 * Fatal
 * VM Argument: -Dlog4j.debug=true
 */
public class LoggingFromProperties {
	static Logger log = Logger.getLogger(LoggingFromProperties.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure("Log4j.properties");
		log.info("This message is a info");
		runMethod();
		log.debug("This message is a debug");
	}

	public static void runMethod() {
		log.info("This info message is from runMethod");
	}
}
