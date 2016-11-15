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
		this.playerPos = 1;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public boolean isSkipTurn() {
		return skipTurn;
	}

	public void setSkipTurn(boolean skipTurn) {
		this.skipTurn = skipTurn;
	}

	public int getPlayerPos() {
		return playerPos;
	}

	public void setPlayerPos(int playerPos) {
		this.playerPos = playerPos;
	}
	
	
	
}
