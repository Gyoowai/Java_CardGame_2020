package deck;

public class RemoveCardFailedException extends Exception {
	// you CAN add SerialVersionID if eclipse gives you warning
	public String message;
	public RemoveCardFailedException(String message) {
		this.message=message;
	
	}
}
