package card.base;


import player.Player;

//You CAN modify the first line
public class CharacterCard extends Card {
	

	
	public CharacterCard(String name, String description, int lifePoint, int attackPoint, int defensePoint) {

	}
	
	public void switchCharacter(Player player){
		/*
		 Hint:
			Use setNewCharacterLifePoint(int)
			, setAttack(int)
			, setDefense (int)
			, setAssignedCharacter (CharacterCard)
			from Player class
		 */
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName() + " \t [Char][HP : " + this.lifePoint + " ATK : " + this.attackPoint + " DEF : " + this.defensePoint + "]";
	}
}
