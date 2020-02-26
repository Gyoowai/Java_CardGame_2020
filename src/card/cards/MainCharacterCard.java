package card.cards;

import card.base.CharacterCard;
import player.Player;

//You CAN modify the first line
public class MainCharacterCard{
	
	
	public MainCharacterCard(String name, String description, int lifePoint, int attackPoint, int defensePoint,float levelUpBonus) {
		this.levelUpBonus = levelUpBonus;
	}
	
	
	public  float levelUp(Player player) {
	
	};
	
	@Override
	public String getName() {
		return super.getName() + " [level " + this.getLevel() + "]";
	}


	
}
