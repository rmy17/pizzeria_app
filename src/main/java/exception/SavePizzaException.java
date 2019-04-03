package exception;

public class SavePizzaException extends StockageException {
	
	public static int u;
	
	public SavePizzaException(String msg) {
		super(msg);
	}
}
