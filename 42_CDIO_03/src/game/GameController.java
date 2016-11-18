package game;
import dice.DiceManager;
import player.PlayerManager;
import board.Board;

public class GameController {
	
	private PlayerManager playerManager;
	private DiceManager diceCup;
	private Board gameBoard;
	private int dice1, dice2;
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
	
	
	public void checkIfBroke(int pNr)
	{
		if(playerManager.get(pNr).getAccount().getBalance()<=0)
		{
			playerIsBroke(pNr);
		}
	}
	
	public void playerIsBroke(int pNr)
	{
		playerManager.get(pNr).setBroke(true);
		playerManager.get(pNr).setFleetsOwned(0);
		playerManager.get(pNr).setLaborOwned(0);
		playerManager.get(pNr).getAccount().setBalance(0);
		//TODO: All the fields he owned will now be free

	}
	/**
	 * 
	 * @return true if there is a winner<br>
	 * false if there is none<br>
	 * Changes pNr to the winners
	 */
	public boolean checkForWinner()
	{
		int activePlayers = 0;
		int lastActivePlayer= 0;
		for(int i = 0; i<playerManager.getNPlayers();i++)
		{
			if(activePlayers>1)
				return false;
			if(!playerManager.get(i).isBroke())
				lastActivePlayer = i;
				activePlayers++;
		}
		this.pNr = lastActivePlayer;
		return true;
	}
	
	
	/**
	 * Pass the turn to the next valid player
	 */
	public void nextPlayer()
	{
		int nPlayers = playerManager.getNPlayers();
		boolean turnSwitched = false;
		while(!turnSwitched)
		{
			this.pNr = ++this.pNr%nPlayers;
			//Hvis den næste spiller ikke er gået fallit, så er det hans tur
			if(!playerManager.get(pNr).isBroke())
			{
				turnSwitched = true;
			}
		}
	}
	
	
}
