package Test;

import org.junit.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import field.Field;
import field.Refuge;
import player.Player;

public class RefugeTest {
	private Player player;
	private Field refuge200;
	private Field refuge0;
	private Field refugeNeg200;

	@Before
	public void setUp() throws Exception {
		this.player = new Player("Kim");
		this.refuge200 = new Refuge("", "", "", 200);
		this.refuge0 = new Refuge("", "", "", 0);
		this.refugeNeg200 = new Refuge("", "", "", -200);
	}

	@After
	public void tearDown() throws Exception {  
		this.player = new Player("Kim");
		//The fields are unaltered  }
	}

	@Test
	public void testEntities() { 
		Assert.assertNotNull(this.player);
		Assert.assertNotNull(this.refuge200);
		Assert.assertNotNull(this.refuge0);
		Assert.assertNotNull(this.refugeNeg200);

		Assert.assertTrue(this.refuge200 instanceof Refuge);
		Assert.assertTrue(this.refuge0 instanceof Refuge);
		Assert.assertTrue(this.refugeNeg200 instanceof Refuge);
	} 

	@Test
	public void testLandOnField200() {  
		int expected = 30000;
		int actual = this.player.getAccount().getBalance();
		Assert.assertEquals(expected, actual);

		//Perform the action to be tested
		this.refuge200.landOnField(this.player);
		expected = 30000 + 200;
		actual = this.player.getAccount().getBalance();
		Assert.assertEquals(expected, actual); 
	}


	@Test
	public void testLandOnField200Twice() {  
		int expected = 30000;
		int actual = this.player.getAccount().getBalance();
		Assert.assertEquals(expected, actual);

		//Perform the action to be tested
		this.refuge200.landOnField(this.player);
		this.refuge200.landOnField(this.player);

		expected = 30000 + 200 + 200;
		actual = this.player.getAccount().getBalance();
		Assert.assertEquals(expected, actual); 
	}

	@Test
	public void testLandOnField0() {  
		int expected = 30000;
		int actual = this.player.getAccount().getBalance();
		Assert.assertEquals(expected, actual); 

		//Perform the action to be tested
		this.refuge0.landOnField(this.player);
		expected = 30000;
		actual = this.player.getAccount().getBalance();
		Assert.assertEquals(expected, actual); 
	}

	@Test  public void testLandOnField0Twice() {  
		int expected = 30000;
		int actual = this.player.getAccount().getBalance();
		Assert.assertEquals(expected, actual);

		//Perform the action to be tested
		this.refuge0.landOnField(this.player);
		this.refuge0.landOnField(this.player);
		expected = 30000; 
		actual = this.player.getAccount().getBalance();
		Assert.assertEquals(expected, actual);
	}   

	@Test  
	public void testLandOnFieldNeg200() {  
		int expected = 30000;
		int actual = this.player.getAccount().getBalance();
		Assert.assertEquals(expected, actual);

		//Perform the action to be tested
		this.refugeNeg200.landOnField(this.player);

		//It is not possible to deposit a negative amount
		expected = 30000-200;
		actual = this.player.getAccount().getBalance();
		Assert.assertEquals(expected, actual);
		} 
}



