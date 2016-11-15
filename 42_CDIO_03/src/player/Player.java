package player;

import player.GenericPlayer;

public class Player extends GenericPlayer 
{

	private boolean skipTurn = false;

	public Player(String name)
	{
		super(name);
		super.accessAccount().deposit(30000);
	}
}
