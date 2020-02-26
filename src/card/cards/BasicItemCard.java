package card.cards;

import player.Player;
import card.base.ItemCard;

//You CAN modify the first line
public class BasicItemCard extends ItemCard
{

	public BasicItemCard(String name, String description, int lpBonus, int attackBonus, int defenseBonus)
	{
		super(name, description, lpBonus, attackBonus, defenseBonus);
	}

	public void equipItem(Player player)
	{
		player.addInventory(this);
		player.setCurrentLifePoint(player.getCurrentLifePoint() + this.lpBonus);
		player.setMaxLifePoint(player.getMaxLifePoint() + this.lpBonus);
		player.setAttack(player.getAttack() + this.attackBonus);
		player.setDefense(player.getDefense() + this.defenseBonus);
	}

}