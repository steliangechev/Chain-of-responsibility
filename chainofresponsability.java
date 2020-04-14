package chainofresponsibility;





public class ChainOfResponsibilityMain {





	private static Logger getChain() {


		Logger infoLogger = new InfoLogger();


		Logger warningLogger = new WarningLogger();


		Logger errorLogger = new ErrorLogger();





		errorLogger.setNextLogger(warningLogger);


		warningLogger.setNextLogger(infoLogger);


		return errorLogger;


	}





	public static void main(String[] args) {





		Logger chain = getChain();


		chain.logMessage(2, "Deprecated method");


		chain.logMessage(1, "Another message received");





	}





}