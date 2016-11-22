package gui;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import stringbanks.Game_Stringbank;
import board.FieldGenerator;
import desktop_resources.GUI;
import player.Player;

public class BoardGameGUI {
	private int sleep = 0; //Number of ms the system sleeps 400 ms is normal.
	private int rotateNr = 1; //Determines the number of times the dice rotates. 30 is normal.

	/**
	 * Start menu
	 * @return
	 */
	public String menu()
	{
		String[] options = {Game_Stringbank.getMainMenuMsg(1),Game_Stringbank.getMainMenuMsg(3),
							Game_Stringbank.getMainMenuMsg(2)};
		
		return GUI.getUserSelection(Game_Stringbank.getMainMenuMsg(0), options);
	}

	/**
	 * The menu that shows at the start of a players turn
	 * @return
	 */
	public String preRollMenu(String name)
	{
		String[] options = {Game_Stringbank.getPreRollMsg(1),Game_Stringbank.getPreRollMsg(2)};
		return GUI.getUserSelection(String.format(Game_Stringbank.getPreRollMsg(0), name), options);
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
		for(int i = 0; i<4;i++)
		{
			faceValue1 = rand.nextInt(6)+1;
			faceValue2 = rand.nextInt(6)+1;
			for(int k = 0; k<rotateNr;k++)
			{
				GUI.setDice(faceValue1, rotation1, x1, y1, faceValue2, rotation2, x2, y2);
				rotation1 = (rotation1+10)%360;
				rotation2 = (rotation2+10)%360;
				try {
					TimeUnit.MILLISECONDS.sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
					System.out.println("Roll dice InterruptedException");
				}
			}
		}
		//Shows the real result
		GUI.setDice(diceResult1, rotation1, x1, y1, diceResult2, rotation2, x2, y2);

	}

	/**
	 * Moves the player model around on the board and skips the start field
	 * This does not update the player's actual position in the game
	 * 
	 * @param name
	 * @param playerPos the players starting position
	 * @param diceResult how many fields the player moves forward
	 */
	
	public void movePlayerModel(String name, int playerPos, int diceResult)
	{
		//only moves the player on the board. Doesn't actually update their position
		for(int i = 0; i<diceResult; i++)
		{
			GUI.removeCar(FieldGenerator.getFieldsInUse(playerPos)+1, name);
			playerPos = playerPos==21?1:(playerPos+1)%22;
			GUI.setCar(FieldGenerator.getFieldsInUse(playerPos)+1, name);
			try {
				TimeUnit.MILLISECONDS.sleep(sleep);

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public boolean confirmInput()
	{
		return GUI.getUserLeftButtonPressed(Game_Stringbank.getConfirmMsg(0), Game_Stringbank.getConfirmMsg(1), 
											Game_Stringbank.getConfirmMsg(2));
	}

	public void showRules()
	{
		GUI.showMessage(Game_Stringbank.getMainMenuMsg(4));
	}


/**
 * Updates all the players' balances 
 * Is normally used after each player's turn.
 * @param playerList
 */
	public void updatePlayerBalance(ArrayList<Player> playerList)
	{
		for(int i = 0; i<playerList.size();i++)
		{
			GUI.setBalance(playerList.get(i).getName(), playerList.get(i).getAccount().getBalance());
		}

	}

	public void setSleep(int sleep) {
		this.sleep = sleep;
	}

	public void setRotateNr(int rotateNr) {
		this.rotateNr = rotateNr;
	}


	public void setOwner(int fieldNumber, String name)
	{
		int translate = FieldGenerator.getFieldsInUse(fieldNumber)+1;
		String newDescr = "Rent: "+FieldGenerator.getFields(translate-1).getRent();
		
		GUI.setOwner(translate, name);
		GUI.setSubText(translate, newDescr);
	}

	public void removeOwner(int fieldNumber)
	{
		GUI.removeOwner(FieldGenerator.getFieldsInUse(fieldNumber)+1);
	}



	public String buyMenu(String fieldType, int price, int rent)
	{
		String[] options = {Game_Stringbank.getFieldMsg(0),Game_Stringbank.getFieldMsg(1)};
		return GUI.getUserSelection(String.format(Game_Stringbank.getFieldMsg(2), fieldType,price,rent),options);
	}
	
	public void showYourFieldMsg(String fieldType)
	{
		GUI.showMessage(String.format(Game_Stringbank.getFieldMsg(3), fieldType));
	}
	
	public void showOpponentFieldMsg(String name1,String name2, int rent)
	{
		GUI.showMessage(String.format(Game_Stringbank.getFieldMsg(4), name2,name1,rent));
	}
	
	public void showRefugeMsg(int bonus)
	{
		GUI.showMessage(String.format(Game_Stringbank.getFieldMsg(5), bonus));
	}
	
	public void showSimpleTax(int taxAmount)
	{
		GUI.showMessage(String.format(Game_Stringbank.getFieldMsg(6), taxAmount));
	}
	/**
	 * Gives
	 * @param taxAmount
	 * @param percentage
	 * @return
	 */
	public String showComplexTax(int taxAmount , int percentage)
	{
		String[] options = {String.format(Game_Stringbank.getFieldMsg(8), taxAmount),
							String.format(Game_Stringbank.getFieldMsg(9), percentage)};
		
		return GUI.getUserSelection(String.format(Game_Stringbank.getFieldMsg(7), taxAmount), options);
	}
	/**
	 * Shows this message when someone has won
	 * @param name
	 */
	public void showWinnerMsg(String name)
	{
		GUI.showMessage(String.format(Game_Stringbank.getWinnerMsg(), name));
	}
	
	public void showBrokeMsg(String name)
	{
		GUI.showMessage(String.format(Game_Stringbank.getBrokeMsg(), name));
	}
}
