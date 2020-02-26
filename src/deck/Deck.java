package deck;


import java.util.Arrays;

import card.base.Card;


public class Deck {
	// TODO: constructor

	public Deck(String name, Card[] deckList) {
	}



	//You CAN modify the first line
	public int insertCard(Card card) {
		//FILL CODE HERE
		//You can used Arrays.copyOf(Original Array, New Length) to create new arrays with bigger size
		//Must return new deckSize

	}

	//You CAN modify the first line
	public Card removeCard(int slotNumber)  {
		//FILL CODE HERE
		//You can used Arrays.copyOf(Original Array, New Length) to create new arrays with bigger size
		//Once card is removed, other card down the list must rearrange to the empty slot
		//Must return card that was removed
	}

	@Override
	public String toString() {
		return new StringBuilder()
				.append("{").append(this.getName()).append("}")
				.append("(").append(this.getDeckSize()).append(" deck size)")
				.toString();
	}

	/* GETTERS & SETTERS */

	
}
