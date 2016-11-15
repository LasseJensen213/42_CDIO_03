package player;



public class Player 
{
	private String name;
	private Account account;
	private boolean skipTurn = false;
	private int playerPos;

	public Player(String name)
	{
		this.name = name;
		Account account = new Account(30000);
	}
}
