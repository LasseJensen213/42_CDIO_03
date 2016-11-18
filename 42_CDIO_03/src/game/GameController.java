package game;
import dice.DiceManager;
import gui.BoardGameGUI;
import player.PlayerManager;
import board.Board;

public class GameController {
	
	private PlayerManager playerManager;
	private DiceManager diceCup;
	private Board gameBoard;
	private BoardGameGUI gameGUI;
	private int dice1, dice2;
	private int pNr; //Hvis tur det er.
	
	public GameController()
	{
		playerManager = new PlayerManager();
		diceCup = new DiceManager(2,6);
		gameBoard = new Board();
		gameGUI = new BoardGameGUI();
		pNr = 0;
		
	}
	
	public void gameControl()
	{
		
		playerManager.initPlayers(); //Laver alle spillerne	
		
		
	}
	
	
	public void playerIsBroke(int pNr)
	{
		playerManager.get(pNr).setBroke(true);
		playerManager.get(pNr).setFleetsOwned(0);
		playerManager.get(pNr).setLaborOwned(0);
		playerManager.get(pNr).getAccount().setBalance(0);
		//TODO: All the fields he owned will now be free

	}
	
	
	
	
	
	
	
}
