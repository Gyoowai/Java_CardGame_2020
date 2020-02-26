package card.cards;

import card.base.ItemCard;
import player.Player;

//You CAN modify the first line
public class ExodiaPartCard extends ItemCard{
	
	protected static String description = "Assemble 4 of Exodia part card to win the game";
	protected static int lpBonus = 0;
	protected static int attackBonus = 0;
	public ExodiaPartCard(String name, int defense) {
		super(name,description,lpBonus,attackBonus,defense);
	}
	public void equipItem(Player player) {
		player.addInventory(this);
		player.setMaxLifePoint(player.getMaxLifePoint()+this.lpBonus);
		player.setDefense(player.getDefense()+this.defenseBonus);
		if(player.getAssignedCharacter() instanceof ExodiaCharacterCard) {
			player.setMaxLifePoint(player.getMaxLifePoint()+this.lpBonus);
			player.setDefense(player.getDefense()+this.defenseBonus);
		}
	}


}