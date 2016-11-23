package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import field.Fleet;
import player.Player;

public class FleetTest {

private Player p1, p2;
private Fleet FleetNotOwned, FleetOwned1, FleetOwned2, FleetOwned3, FleetOwned4;

@Before
public void setUp() throws Exception {
	this.p1 = new Player("kim");
	this.p2 = new Player("Lasse");
	this.FleetNotOwned = new Fleet("","","", 4000);
	this.FleetOwned1 = new Fleet("","","", 4000);
	this.FleetOwned2 = new Fleet("","","",4000);
	this.FleetOwned3 = new Fleet("","","",4000);
	this.FleetOwned4 = new Fleet("","","",4000);
}

@After
public void tearDown() throws Exception {  
	this.p1 = new Player("kim");
	this.p2 = new Player("Lasse");
}

@Test
public void IngenEjer() {
	assertNull(FleetNotOwned.getOwner());
}

@Test
public void EjerenEjerEtFelt() {
	FleetOwned1.setOwner(p2);
	FleetOwned1.landOnField(p1);
	int expected = 29500;
	int actual = p1.getAccount().getBalance();
	assertEquals(expected, actual);
	
}

@Test
public void EjerenEjerToFelt() {
	FleetOwned1.setOwner(p2);
	FleetOwned2.setOwner(p2);
	
	FleetOwned2.landOnField(p1);
	int expected = 29000;
	int actual = p1.getAccount().getBalance();
	assertEquals(expected, actual);
	
}

@Test
public void EjerenEjerTreFelt() {
	FleetOwned1.setOwner(p2);
	FleetOwned2.setOwner(p2);
	FleetOwned3.setOwner(p2);
	
	FleetOwned1.landOnField(p1);
	int expected = 28000;
	int actual = p1.getAccount().getBalance();
	assertEquals(expected, actual);
	
}

@Test
public void EjerenEjerFireFelt() {
	FleetOwned1.setOwner(p2);
	FleetOwned2.setOwner(p2);
	FleetOwned3.setOwner(p2);
	FleetOwned4.setOwner(p2);
	
	FleetOwned1.landOnField(p1);
	int expected = 26000;
	int actual = p1.getAccount().getBalance();
	assertEquals(expected, actual);
	
}



}
