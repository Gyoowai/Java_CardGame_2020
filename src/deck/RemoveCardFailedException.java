package deck;

public class RemoveCardFailedException extends Exception {
	// you CAN add SerialVersionID if eclipse gives you warning
	public RemoveCardFailedException(String s) {
		System.out.println(s);
	}
}
