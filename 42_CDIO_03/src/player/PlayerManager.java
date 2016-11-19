package player;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import stringbanks.PlayerCreation_Stringbank;

import desktop_resources.GUI;
import gui.PlayerCreationGUI;

public class PlayerManager {

	private ArrayList<Player>playerList;
	private PlayerCreationGUI playerCreateGUI;
	private Map<String,Color>colorMap;
	
	private int nPlayers;
	private int winningPlayer;
	
	public PlayerManager() 
	{
		this.playerList = new ArrayList<Player>();
		this.playerCreateGUI = new PlayerCreationGUI();	
		
		//"String comes in, color comes out. You can't explain that!" - Bill O'Reilly
				colorMap.put("Black", Color.black);
				colorMap.put("Blue", Color.blue);
				colorMap.put("Green", Color.green);
				colorMap.put("Red", Color.red);
				colorMap.put("Yellow", Color.yellow);
				colorMap.put("White",Color.white);
				colorMap.put("Pink", Color.pink);
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
	
	public ArrayList<Player> getPlayerList()
	{
		return playerList;
	}
	
	public void initPlayers()
	{
		//First choose number of players
		nPlayers = playerCreateGUI.chooseNPlayers();
		
		for(int i = 0; i<nPlayers;i++)
		{
			String name = playerCreateGUI.chooseName(this);
			String color = playerCreateGUI.chooseColor();//Chooses the color for the car
			addPlayer(name);
			playerList.get(i).setCar(colorMap.get(color));
			playerCreateGUI.addPlayerToBoard(playerList.get(i));
			
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
	 * Updates winningPlayer if a winner is found
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
	/**
	 * Checks if the player with the index in the ArrayList is broke
	 * @param index
	 * @return
	 */
	public boolean checkIfBroke(int index)
	{
		if(playerList.get(index).getAccount().getBalance()<=0)
		{
			return true;
		}
		return false;
	}
	
	
	
	
	
	
}
