package test.student;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import card.base.ItemCard;
import card.cards.BasicCharacterCard;
import card.cards.BasicItemCard;
import card.cards.ExodiaCharacterCard;
import card.cards.ExodiaPartCard;
import card.cards.MainCharacterCard;
import player.Player;

public class TestExodiaCharacterCard
{
	Player player;
	ExodiaCharacterCard testExodia;
	BasicItemCard item1 = new BasicItemCard("Item1", "item1", 10, 0, 0);
	ExodiaPartCard exodiaItem = new ExodiaPartCard("exodiaItem", 10);
	ItemCard[] inventory1 =
	{ item1, item1, item1, item1 };
	ItemCard[] inventory2 =
	{ item1, item1, exodiaItem, exodiaItem };
	ItemCard[] inventory3 =
	{ exodiaItem, exodiaItem, exodiaItem, exodiaItem };
	BasicCharacterCard testChar;

	@Before
	public void setUp()
	{
		player = new Player("testPlayer", 400, 50, 30);
		testExodia = new ExodiaCharacterCard();
		testChar = new BasicCharacterCard("Test Character", "test character", 150, 80, 60);
	}

	@Test
	public void testConstructor()
	{

		assertEquals("Exodia the Forbidden One", testExodia.getName());
		assertEquals("With 4 or more Exodia Part Card equiped, you win the game", testExodia.getDescription());

	}

	// Fill Code Here!!!
	// 1.testSwitchCharacter
	// 2.testSacrifice
	// 3.testWinConditionCheck
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
	public void testSacrifice()
	{
		player.setCurrentLifePoint(60);
		testChar.sacrifice(player);
		assertEquals(126, player.getCurrentLifePoint());

		BasicCharacterCard testChar3 = new BasicCharacterCard("Test Character 3", "test character 3", 150, 40, 20);
		player.setCurrentLifePoint(50);
		testChar3.sacrifice(player);
		assertEquals(116, player.getCurrentLifePoint());
	}

	@Test
	public void testWinConditionCheck()
	{
		assertFalse(testExodia.winConditionCheck(inventory1));
		assertFalse(testExodia.winConditionCheck(inventory2));
		assertTrue(testExodia.winConditionCheck(inventory3));
	}
}