package card.base;


//You CAN modify the first line
public abstract class Card {	
	String name;
	String description;
	public Card(String name, String description) {
		this.name=name;
		this.description=description;
	}
	
	
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
}
