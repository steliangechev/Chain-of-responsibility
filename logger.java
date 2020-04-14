package chainofresponsibility;





public abstract class Logger {





	public static int INFO = 1;


	public static int WARNING = 2;


	public static int ERROR = 3;





	protected int level;





	protected Logger nextLogger;





	public void setNextLogger(Logger nextLogger) {


		this.nextLogger = nextLogger;


	}





	public void logMessage(int level, String message) {





		if(this.level <= level) {


			// Method to consume the data passed


			this.writeMessage(message);


		}





		if(this.nextLogger != null) {


			this.nextLogger.logMessage(level, message);


		}





	}





	abstract protected void writeMessage(String message);





}