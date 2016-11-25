package gui;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import desktop_resources.GUI;
import player.Player;
import player.PlayerManager;
import stringbanks.PlayerCreation_Stringbank;

public class PlayerCreationGUI {

	private ArrayList<String> availableColors;
	private Map<String,Color>colorMap;//"String comes in, color comes out. You can't explain that!" - Bill O'Reilly
	private Color[] colors = {Color.blue,Color.green, Color.red, Color.yellow, Color.white, Color.pink};
	
	
	public PlayerCreationGUI()
	{
		availableColors = new ArrayList<String>();
		colorMap = new HashMap<String,Color>();
		for(int i = 0; i<colors.length;i++)
		{
			availableColors.add(PlayerCreation_Stringbank.getColor(i));
			colorMap.put(PlayerCreation_Stringbank.getColor(i), colors[i]);
		}
		
		
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
				name = PlayerCreation_Stringbank.getPlayerName()+" "+(nPlayersInList+1);
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
		String[] colorArr = availableColors.toArray(new String[]{});
		String color = GUI.getUserSelection(PlayerCreation_Stringbank.getMsg(4),colorArr);
		
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

	public Color getColor(String color)
	{
		return colorMap.get(color);
	}
}
