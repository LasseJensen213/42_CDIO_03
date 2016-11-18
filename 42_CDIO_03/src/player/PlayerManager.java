package player;

import java.util.ArrayList;
import stringbanks.PlayerManager_Stringbank;

import desktop_resources.GUI;

public class PlayerManager {

	private ArrayList<Player>playerList;
	private int nPlayers;
	private int winningPlayer;
	
	public PlayerManager() 
	{
		this.playerList = new ArrayList<Player>();
	}

	public void setNPlayers(int nPlayers)
	{
		this.nPlayers = nPlayers;
	}
	
	public void addPlayer(String name)
	{
		playerList.add(new Player(name));
	}
	
	public int getNPlayers()
	{
		return nPlayers;
	}
	
	public Player get(int index)
	{
		if(playerList.size()==0)
			return null;
		
		return playerList.get(index);
	}
	
	public void initPlayers()
	{
		//First choose number of players
		nPlayers = Integer.parseInt(GUI.getUserSelection(PlayerManager_Stringbank.getMsg(0), new String[]{"2","3","4","5","6"}));
		
		for(int i = 0; i<nPlayers;i++)
		{
			String name = chooseName();
			addPlayer(name);
		}
		
	}
	
	public String chooseName()
	{
		int nPlayersInList = playerList.size(); 
		while(true)
		{
			String name = GUI.getUserString(String.format(PlayerManager_Stringbank.getMsg(1), nPlayersInList+1));
			if(name.length()>16)
			{
				GUI.showMessage(PlayerManager_Stringbank.getMsg(2));
				continue;
			}
			else if(name.length()==0)
			{
				name = "Player "+(nPlayersInList+1);
			}
			
			if(nameTaken(name))
			{
				GUI.showMessage(PlayerManager_Stringbank.getMsg(3));
			}
			else 
				return name;
		}
	}
	
	public boolean nameTaken(String name)
	{
		
		for(int i = 0; i<playerList.size() ;i++)
		{
			if(playerList.get(i).getName().equals(name))
				return true;
		}
		return false;
	}
	
	/**
	 * Pass the turn to the next valid player
	 */
	public int nextPlayer(int index)
	{
		boolean turnSwitched = false;
		while(!turnSwitched)
		{
			index = ++index%nPlayers;
			//Hvis den næste spiller ikke er gået fallit, så er det hans tur
			if(!playerList.get(index).isBroke())
			{
				turnSwitched = true;
			}
		}
		return index;
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
		for(int i = 0; i<nPlayers;i++)
		{
			if(activePlayers>1)
				return false;
			if(!playerList.get(i).isBroke())
				lastActivePlayer = i;
				activePlayers++;
		}
		winningPlayer = lastActivePlayer;
		return true;
	}
	
	public boolean checkIfBroke(int index)
	{
		if(playerList.get(index).getAccount().getBalance()<=0)
		{
			return true;
		}
		return false;
	}
	
	
	
	
}
