package card.cards;

import card.base.CharacterCard;
import player.Player;

//You CAN modify the first line
public class MainCharacterCard extends CharacterCard{
	private float levelUpBonus;
	private int level;
	public MainCharacterCard(String name, String description, int lifePoint, int attackPoint, int defensePoint,float levelUpBonus) {
		super(name,description,lifePoint,attackPoint,defensePoint);
		this.levelUpBonus = levelUpBonus;
	}
	public int sacrifice(Player player) {
		int riseLP = player.getMaxLifePoint()/8;
		player.healPlayer(riseLP);
		return player.getCurrentLifePoint();
	}
	public float levelUp (Player player) {
		player.setCurrentLifePoint((int)(player.getCurrentLifePoint()*(1+this.levelUpBonus)));
		player.setAttack((int)(player.getAttack()*(1+this.levelUpBonus)));
		player.setDefense((int)(player.getDefense()*(1+this.levelUpBonus)));
		level++;
		return levelUpBonus;
	}
	
	public int getLevel()
	{
		return level;
	}


	public void setLevel(int level)
	{
		this.level = level;
	}


	
	@Override
	public String getName() {
		return super.getName() + " [level " + this.getLevel() + "]";
	}


	
}
