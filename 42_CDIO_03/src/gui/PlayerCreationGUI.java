package gui;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import desktop_resources.GUI;
import player.Player;
import player.PlayerManager;
import stringbanks.PlayerCreation_Stringbank;

public class PlayerCreationGUI {

	private ArrayList<String>availableColors;
	
	public PlayerCreationGUI()
	{
		this.availableColors = new ArrayList<String>(
				Arrays.asList("Black","Blue", "Green","Red", "Yellow","White","Pink"));
		
		
	}

	public String chooseName(PlayerManager playerManager)
	{ 
		int nPlayersInList = playerManager.getPlayerList().size();
		while(true)
		{
			String name = GUI.getUserString(String.format(PlayerCreation_Stringbank.getMsg(1), nPlayersInList+1));
			if(name.length()>16)
			{
				GUI.showMessage(PlayerCreation_Stringbank.getMsg(2));
				continue;
			}
			else if(name.length()==0)
			{
				name = "Player "+(nPlayersInList+1);
			}
			if(playerManager.nameTaken(name))
			{
				GUI.showMessage(PlayerCreation_Stringbank.getMsg(3));
			}
			else 
				return name;
		}
	}
	
	public String chooseColor()
	{
		String color = GUI.getUserSelection("PICK COLOR", availableColors.toArray(new String[availableColors.size()]));
		availableColors.remove(color); //removes the color as an option, so everyone gets a unique color
		return color;
	}
	
	public void addPlayerToBoard(Player player)
	{
		String name = player.getName();
		int balance = player.getAccount().getBalance();
		GUI.addPlayer(name, balance, player.getCar() );
		GUI.setCar(1, name);
	}
	
	public int chooseNPlayers()
	{
		return Integer.parseInt(GUI.getUserSelection(PlayerCreation_Stringbank.getMsg(0), new String[]{"2","3","4","5","6"}));
	}

}
