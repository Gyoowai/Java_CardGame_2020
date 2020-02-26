package card.cards;

import card.base.CharacterCard;
import card.base.ItemCard;
import player.Player;

//You CAN modify the first line
public class ExodiaCharacterCard extends CharacterCard{
	static String name = "Exodia the Forbidden One";
	static String description = "With 4 or more Exodia Part Card equiped, you win the game";
	static int lifePoint = 800;
	static int attackPoint = 0;
	static int defensePoint = 25;
	
	public ExodiaCharacterCard() {
		super(name,description,lifePoint,attackPoint,defensePoint);
		
		
	}
	
	//Fill Code Here
	public int sacrifice(Player player) {
		int riseLP = player.getMaxLifePoint()/10;
		player.healPlayer(riseLP);
		return player.getCurrentLifePoint();
	}
	public boolean winConditionCheck(ItemCard[] inventory) {
		int count=0;
		for(ItemCard i:inventory) {
			if(i instanceof ExodiaPartCard) {
				count++;
			}
			if(count==4) {return true;}
		}
		return false;
	}
}