package deck;

//you CAN modify the first line
public class InsertCardFailedException extends Throwable {
	// you CAN add SerialVersionID if eclipse gives you warning
	public String message;
	public InsertCardFailedException(String message) {
		this.message=message;
	}
}
