package game;
import dice.DiceManager;
import gui.BoardGameGUI;
import player.PlayerManager;
import board.Board;
import board.FieldGenerator;
import desktop_resources.GUI;

public class GameController {
	
	private PlayerManager playerManager;
	private DiceManager diceCup;
	private Board gameBoard;
	private BoardGameGUI gameGUI;
	private int nFieldsInUse;
	private int dice1, dice2; //De to resultater bruges til GUI'en
	private int pNr; //Hvis tur det er.
	
	public GameController()
	{
		nFieldsInUse = 22;
		playerManager = new PlayerManager();
		diceCup = new DiceManager(2,6);
		gameBoard = new Board();
		gameGUI = new BoardGameGUI();
		
	}
	
	public void gameControl()
	{
		
		playerManager.initPlayers(); //Laver alle spillerne	
		pNr = 0;
		
		
	}
	
	
	public void playerIsBroke(int pNr)
	{
		playerManager.get(pNr).setBroke(true);
		playerManager.get(pNr).setFleetsOwned(0);
		playerManager.get(pNr).setLaborOwned(0);
		playerManager.get(pNr).getAccount().setBalance(0);
		//TODO: All the fields he owned will now be freed

	}
	
	
	
	
	
	
	
}
