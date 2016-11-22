package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import field.LaborCamp;
import player.Player;

public class LaborCampTest {

	private Player p1, p2;
	private LaborCamp LaborCampNotOwned, LaborCamp1, LaborCamp2;
	
	
	@Before
	public void setUp() throws Exception {
		this.p1 = new Player("kim");
		this.p2 = new Player("Lasse");

		this.LaborCampNotOwned = new LaborCamp("","","", 2500, 100);
		this.LaborCamp1 = new LaborCamp("","","", 2500, 100);
		this.LaborCamp2 = new LaborCamp("","","",2500, 100);
	}

	@After
	public void tearDown() throws Exception {  
		this.p1 = new Player("kim");
		this.p2 = new Player("Lasse");
	}

	@Test
	public void NoOwner() {
		assertNull(LaborCampNotOwned.getOwner());
	}
	
	@Test
	public void LandOnAOwnedLaborCampField() {
		p1.setDiceResult(10);
		LaborCamp1.setOwner(p1);
		LaborCamp1.landOnField(p2);
		p2.setDiceResult(7);
		int expected = 29000;
		int actual = p1.getAccount().getBalance();
		assertEquals(expected, actual);
	}
	
	
}
