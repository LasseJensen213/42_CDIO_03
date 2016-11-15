package player;

public class Account {
	private int balance;
	
	
	public Account(int balance)
	{
		this.balance = balance;
	}
	
	
	
	public boolean deposit(int amount)
	{
		this.balance += amount;
		return true;
	}

}
