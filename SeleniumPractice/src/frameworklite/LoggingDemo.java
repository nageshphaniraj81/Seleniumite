package frameworklite;
import java.util.*;
import org.apache.log4j.*;

public class LoggingDemo {

	static Logger log = Logger.getLogger(LoggingDemo.class);
	static Appender append;
//	Debug
//	Info
//	Warn
//	Error
//	Fatal
//	@param args
	
	
	public static void main(String[] args) {
		//BasicConfigurator.configure();
//		Properties log4jprop = new Properties();
//		log4jprop.setProperty("log4j.rootlogger", "DEBUG, CA");
//		log4jprop.setProperty("log4j.appender.CA", "org.apache.log4j.ConsoleAppender");
//		log4jprop.setProperty("log4j.appender.CA.layout", "org.apache.log4j.PatternLayout");
//		log4jprop.setProperty("log4j.appender.CA.layout.CoversionPattern", "%d{yyyy-MM-dd} -- %-10p %c - %m%n");
		PropertyConfigurator.configure("Log4j-Properties");
		
		log.info("This message is a info");
		runMethod();
		log.debug("This message is a info");

	}
	
	public static void runMethod(){
		log.info("This is from runMEthod");
	}

}
