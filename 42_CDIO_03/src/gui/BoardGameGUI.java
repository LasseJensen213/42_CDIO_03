package gui;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import desktop_resources.GUI;
import player.Player;

public class BoardGameGUI {

	/**
	 * Start menu
	 * @return
	 */
	public String menu()
	{
		String[] options = {"New game","Rules of the game","Close"};
		return GUI.getUserSelection("MENU MSG", options);
	}
	
	/**
	 * The menu that shows at the start of a players turn
	 * @return
	 */
	public String preRollMenu()
	{
		String[] options = {"Roll dice","Back to menu"};
		return GUI.getUserButtonPressed("MENU MSG", options);
	}
	
	public void showDiceRolling(int diceResult1, int diceResult2)
	{
		Random rand = new Random();
		int faceValue1, faceValue2;
		
		int x1 = rand.nextInt(4)+4;
		int y1 = rand.nextInt(4)+4;
		//Second dice's position is relative to the first
		int x2 = x1+rand.nextInt(5)-2;
		int y2 = y1+rand.nextInt(5)-2;
		
		if(x1==x2 && y1 == y2)
		{
			x1++;
		}
		
		int rotation1 =rand.nextInt(360);
		int rotation2 =rand.nextInt(360);
		//Simulates The dice rolling
		for(int i = 0; i<5;i++)
		{
			faceValue1 = rand.nextInt(6)+1;
			faceValue2 = rand.nextInt(6)+1;
			for(int k = 0; k<30;k++)
			{
				GUI.setDice(faceValue1, rotation1, x1, y1, faceValue2, rotation2, x2, y2);
				rotation1 += 10;
				rotation2 += 10;
				try {
					TimeUnit.MILLISECONDS.sleep(70);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		//Shows the real result
		GUI.setDice(diceResult1, rotation1, x1, y1, diceResult2, rotation2, x2, y2);
		
	}
	
	public void movePlayerModel(String name, int playerPos, int diceResult)
	{
		//only moves the player on the board. Doesn't actually update their position
		
	}
	
	public boolean confirmInput()
	{
		return GUI.getUserLeftButtonPressed("CONFIRM INPUT MSG", "Yes", "No");
	}
	
	public void showRules()
	{
		GUI.showMessage("GAME RULES");
	}
	
	
	
	public void updatePlayerBalance(String name, int newBalance)
	{
		GUI.setBalance(name, newBalance);
	}
	
	
	

}