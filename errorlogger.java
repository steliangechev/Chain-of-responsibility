package chainofresponsibility;





public class ErrorLogger extends Logger {





	public ErrorLogger() {


		this.level = Logger.ERROR;


	}





	@Override


	protected void writeMessage(String message) {


		System.out.println("Error message: " + message);


	}





}