package game;
import dice.DiceManager;
import player.PlayerManager;
import board.Board;

public class GameController {
	
	private PlayerManager playerManager;
	private DiceManager diceCup;
	private Board gameBoard;
	private int pNr; //Hvis tur det er.
	
	public GameController()
	{
		playerManager = new PlayerManager();
		diceCup = new DiceManager(2,6);
		gameBoard = new Board();
		pNr = 0;
		
	}
	
	public void controller()
	{
		playerManager.initPlayers(); //Laver alle spillerne
		
		
	}
	
}
