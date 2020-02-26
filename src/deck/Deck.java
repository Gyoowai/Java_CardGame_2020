package deck;


import java.util.Arrays;

import card.base.Card;


public class Deck {
	// TODO: constructor
	private String name;
	private Card[] deckList;
	private int deckSize;
	public Deck(String name, Card[] deckList) {
		deckSize = deckList.length;
		this.deckList = new Card[deckSize];
		this.name=name;
		this.deckList=deckList;
		
	}



	//You CAN modify the first line
	public int insertCard(Card card) throws InsertCardFailedException {
		//FILL CODE HERE
		deckSize++;
		Card[] deckList2 = new Card[deckSize];
		deckList2 = Arrays.copyOf(deckList, deckSize);
		deckList2[deckSize-1]=card;
		deckList=deckList2;
		int checker=0;
		for (Card i:deckList) {
			if (i.equals(card)) {
				checker++;
			}
		}
		if(checker==5) {throw new InsertCardFailedException("You can only put 4 of the same cards into the deck");}
		return deckSize;
		//You can used Arrays.copyOf(Original Array, New Length) to create new arrays with bigger size
		//Must return new deckSize
		
	}

	//You CAN modify the first line
	public Card removeCard(int slotNumber) throws RemoveCardFailedException{
		//FILL CODE HERE
		Card removed=deckList[slotNumber];
		deckSize--;
		Card[] deckList2 = new Card[deckSize];
		for (int i=0;i<deckSize+1;i++) {
			if(i!=slotNumber) {
				deckList2[i]=deckList[i];
			}
		}
		if (slotNumber >= deckSize) {
			throw new RemoveCardFailedException("Number you insert exceed deck size");
			
		}
		if (deckSize <= 0) {
			throw new RemoveCardFailedException("There is no card in that slot");
			
		}
		return removed;
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



	public String getName()
	{
		return name;
	}



	public int getDeckSize()
	{
		return deckSize;
	}



	public Card[] getDeckList()
	{
		return deckList;
	}



	public void setDeckSize(int deckSize)
	{
		this.deckSize = deckSize;
	}
	
	/* GETTERS & SETTERS */

	
}
