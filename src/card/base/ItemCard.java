package card.base;

import player.Player;

//You CAN modify the first line
public abstract class ItemCard extends Card {

	
	public ItemCard(String name, String description, int lpBonus , int attackBonus, int defenseBonus) {

	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName() + " \t [Item][HP : " + this.lpBonus + " ATK : " + this.attackBonus + " DEF : " + this.defenseBonus + "]";
	}
}
