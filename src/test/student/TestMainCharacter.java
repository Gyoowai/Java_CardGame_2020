package test.student;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import card.cards.BasicCharacterCard;
import card.cards.MainCharacterCard;
import player.Player;

public class TestMainCharacter
{

	Player player;
	MainCharacterCard testMainChar;
	BasicCharacterCard testChar;

	@Before
	public void setUp()
	{
		player = new Player("testPlayer", 300, 50, 30);
		testMainChar = new MainCharacterCard("Test Main Character", "test maincharacter", 250, 100, 80, 0.2f);
		testChar = new BasicCharacterCard("Test Character", "test character", 150, 80, 60);
	}

	@Test
	public void testConstructor()
	{

		assertEquals("Test Main Character [level 0]", testMainChar.getName());
		assertEquals("test maincharacter", testMainChar.getDescription());
		assertEquals(0, testMainChar.getLevel());
	}

	// Fill Code Here!!!
	// 1.testSwitchCharacter
	// 2.testSacrifice

	@Test
	public void testLevelUp()
	{
		testMainChar.switchCharacter(player);
		assertEquals("Test Main Character [level 0]", testMainChar.getName());
		testMainChar.levelUp(player);
		assertEquals("Test Main Character [level 1]", testMainChar.getName());
		assertEquals(300, player.getMaxLifePoint());
		assertEquals(120, player.getAttack());
		assertEquals(96, player.getDefense());
		// Fill Code Here!!!
		// Add Level 2 case
		testMainChar.levelUp(player);
		assertEquals("Test Main Character [level 2]", testMainChar.getName());
		assertEquals(360, player.getMaxLifePoint());
		assertEquals(144, player.getAttack());
		assertEquals(115, player.getDefense());
	}

	
	@Test
	public void testSwitchCharacter()
	{
		testChar.switchCharacter(player);
		assertEquals(150, player.getMaxLifePoint());
		assertEquals(80, player.getAttack());
		assertEquals(60, player.getDefense());

		player.setCurrentLifePoint(120);
		BasicCharacterCard testChar2 = new BasicCharacterCard("Test Character 2", "test character 2", 200, 100, 80);
		testChar2.switchCharacter(player);

		assertEquals(200, player.getMaxLifePoint());
		assertEquals(160, player.getCurrentLifePoint());
		assertEquals(100, player.getAttack());
		assertEquals(80, player.getDefense());
	}
	
	@Test
	public void testSacrifice() {
		player.setCurrentLifePoint(60);
		testChar.sacrifice(player);
		assertEquals(110, player.getCurrentLifePoint());
		
		BasicCharacterCard testChar3 
		= new BasicCharacterCard("Test Character 3", "test character 3", 150, 40, 20);
		player.setCurrentLifePoint(50);
		testChar3.sacrifice(player);
		assertEquals(100, player.getCurrentLifePoint());
	}
}
