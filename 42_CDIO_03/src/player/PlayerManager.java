package player;

import java.util.ArrayList;

import desktop_resources.GUI;

public class PlayerManager {

	private ArrayList<Player>playerList;
	private int nPlayers;
	
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
		nPlayers = Integer.parseInt(GUI.getUserSelection("Choose NUMPLAYERS", new String[]{"2","3","4","5","6"}));
		
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
			String name = GUI.getUserString("Player "+(nPlayersInList+1)+" Please choose a name (Max 16 characters long)");
			if(name.length()>16)
			{
				GUI.showMessage("Name too long");
				continue;
			}
			else if(name.length()==0)
			{
				name = "Player "+(nPlayersInList+1);
			}
			
			if(nameTaken(name))
			{
				GUI.showMessage("That name has already been taken");
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
	
	
	
	
}
