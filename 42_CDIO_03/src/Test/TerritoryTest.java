package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import field.Territory;
import player.Player;

public class TerritoryTest {

	private Player p1, p2;
	private Territory TerritoryNotOwned, Territory1, Territory2;
	
	@Before
	public void setUp() throws Exception {
		this.p1 = new Player ("Kim");
		this.p2 = new Player("Lasse");
		this.TerritoryNotOwned = new Territory("","","", 1000, 100);
		this.Territory1 = new Territory("","","", 1000, 100);
		this.Territory2 = new Territory("","","", 2600, 5500);
	}
	
	@After
	public void tearDown() throws Exception {  
		this.p1 = new Player("kim");
		this.p2 = new Player("Lasse");
	}
	
	@Test
	public void NoOwner() {
		assertNull(TerritoryNotOwned.getOwner());
		int expected = 30000;
		int actual = p1.getAccount().getBalance();
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void LandOnOwnedTerritory1() {
		Territory1.setOwner(p2);
		Territory1.landOnField(p1);
		int expected = 29900;
		int actual = p1.getAccount().getBalance();
		assertEquals(expected, actual);
	}
	
	@Test
	public void LandOnOwnedTerritory2() {
		Territory2.setOwner(p2);
		Territory2.landOnField(p1);
		int expected = 24500;
		int actual = p1.getAccount().getBalance();
		assertEquals(expected, actual);
	}
	
	@Test
	public void LandTwiceOnOwnedTerritory2() {
		Territory2.setOwner(p2);
		Territory2.landOnField(p1);
		Territory2.landOnField(p1);
		int expected =19000;
		int actual = p1.getAccount().getBalance();
		assertEquals(expected, actual);
	}
}
