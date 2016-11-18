package player;



public class Player 
{
	private String name;
	private Account account;
	private boolean broke;
	private int playerPos;
	private int nFleetsOwned;
	private int nLaborOwned;
	private int lastDiceResult; // Bruges til labor camp

	public Player(String name)
	{
		this.name = name;
		this.broke = false;
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

	public boolean isBroke() {
		return broke;
	}

	public void setSkipTurn(boolean broke) {
		this.broke = broke;
	}

	public int getPlayerPos() {
		return playerPos;
	}

	public void setPlayerPos(int playerPos) {
		this.playerPos = playerPos;
	}
	
	public int getFleetsOwned()
	{
		return nFleetsOwned;
	}
	
	public int getLaborOwned()
	{
		return nLaborOwned;
	}
	
	public void setFleetsOwned(int nFleetsOwned)
	{
		this.nFleetsOwned = nFleetsOwned;
	}
	
	public void setLaborOwned(int nLaborOwned)
	{
		this.nLaborOwned = nLaborOwned;
	}
	
	public int getDiceResult()
	{
		return this.lastDiceResult;
	}
	
	public void setDiceResult(int diceResult)
	{
		this.lastDiceResult = diceResult;
	}
	
	
	
}
