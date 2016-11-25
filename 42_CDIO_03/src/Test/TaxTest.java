package Test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import field.Tax;
import player.Player;

public class TaxTest {

	private Player p1;
	private Tax  Tax2000, Tax4000, Tax10Procent;

	@Before
	public void setUp() throws Exception {
		this.p1 = new Player ("Kim");


		this.Tax2000 = new Tax("","","", 2000, 0);
		this.Tax4000 = new Tax("","","", 4000, 10);
		this.Tax10Procent = new Tax("","","", 4000, 10);
	}
	@After
	public void tearDown() throws Exception {  
		this.p1 = new Player("kim");
	}

	@Test
	public void Tax2000() {
		Tax2000.landOnField(p1);
		int expected = 28000;
		int actual = p1.getAccount().getBalance();
		assertEquals(expected, actual);


	}


	@Test
	public void Tax4000() {
		//Choose to pay with 4000
		Tax4000.landOnField(p1);
		int expected = 26000;
		int actual = p1.getAccount().getBalance();
		assertEquals(expected, actual);
	}
	
	@Test
	public void Tax10Procent() {
		//Choose to pay with 10% of account balance
		Tax10Procent.landOnField(p1);
		int expected = 27000;
		int actual = p1.getAccount().getBalance();
		assertEquals(expected, actual);
	}

}