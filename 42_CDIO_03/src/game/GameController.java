package game;
import dice.DiceManager;
import gui.BoardGameGUI;
import gui.GUI_Controller;
import player.PlayerManager;
import board.Board;
import board.FieldGenerator;
import desktop_resources.GUI;
import board.FieldGenerator;

public class GameController {

	private PlayerManager playerManager;
	private DiceManager diceCup;
	private Board gameBoard;
	private BoardGameGUI gameGUI;
	private GUI_Controller gCtrl;
	private int nFieldsInUse;
	private int dice1, dice2; //De to resultater bruges til GUI'en
	private int diceResult;
	private int pNr; //Hvis tur det er.

	public GameController()
	{
		nFieldsInUse = 22;
		playerManager = new PlayerManager();
		diceCup = new DiceManager(2,6);
		gameBoard = new Board();
		gameGUI = new BoardGameGUI();
		gCtrl = new GUI_Controller();

	}

	public void gameControl()
	{

		playerManager.initPlayers(); //Laver alle spillerne	
		pNr = 0;

		//tjekker om spilleren vil fortsætte spillet eller gå tilbage til menuen
		while(gCtrl.preRollMenuController())
		{

			diceCup.rollDice();
			diceResult = diceCup.getDiceTotal();
			dice1 = diceCup.getDiceValue(0);
			dice2 = diceCup.getDiceValue(1);
			gameGUI.showDiceRolling(dice1, dice2);
			gameGUI.movePlayerModel(playerManager.get(pNr).getName(), playerManager.get(pNr).getPlayerPos(), diceResult);
			updatePlayerPos(pNr,diceResult);
			playerManager.get(pNr).setDiceResult(diceResult);
			FieldGenerator.getFields(FieldGenerator.getFieldsInUse(
					playerManager.get(pNr).getPlayerPos())).landOnField(playerManager.get(pNr));
			if(playerManager.checkIfBroke(pNr))
			{
				playerIsBroke(pNr);
			}
			gameGUI.updatePlayerBalance(playerManager.getPlayerList());
			pNr = playerManager.nextPlayer(pNr);
			if(playerManager.checkForWinner())
			{
				//TODO: Vinder besked?
				String besked = playerManager.get(pNr).getName() + " har vundet!";
				GUI.showMessage(besked);
				break;
			}

		}



	}


	public void playerIsBroke(int pNr)
	{
		//Spilleren med spiller nummeret har tabt og alle de felter han ejede bliver frisat.
		playerManager.get(pNr).setBroke(true);
		playerManager.get(pNr).setFleetsOwned(0);
		playerManager.get(pNr).setLaborOwned(0);
		playerManager.get(pNr).getAccount().setBalance(0);
		for(int i = 1 ; i<nFieldsInUse; i++)
		{
			FieldGenerator.getFields(FieldGenerator.getFieldsInUse(i)).freeOwner(playerManager.get(pNr));
		}

		GUI.removeCar(FieldGenerator.getFieldsInUse(playerManager.get(pNr).getPlayerPos())+1, playerManager.get(pNr).getName());
	}

	public void updatePlayerPos(int pNr, int diceResult)
	{
		for(int i = 0; i<diceResult; i++)
		{
			
			playerManager.get(pNr).setPlayerPos((playerManager.get(pNr).getPlayerPos()+1)%nFieldsInUse);
			if(playerManager.get(pNr).getPlayerPos()==0)
				i--;
		}
	}
	
	public void testmode(boolean statement)
	{
		if(statement==true)
		{
			GUI.showMessage("TESTMODE ON");
			gameGUI.setRotateNr(1);
			gameGUI.setSleep(0);
			gCtrl.setTestmode(true);
		}
		else if (statement==false)
		{
			System.out.println("TESTMODE OFF");
			gameGUI.setRotateNr(30);
			gameGUI.setSleep(400);
			gCtrl.setTestmode(false);
		}
		
	}







}
