package deck;

//you CAN modify the first line
public class InsertCardFailedException extends Throwable {
	// you CAN add SerialVersionID if eclipse gives you warning
	public InsertCardFailedException() {
		System.out.println("You can only put 4 of the same cards into the deck");
	}
}
