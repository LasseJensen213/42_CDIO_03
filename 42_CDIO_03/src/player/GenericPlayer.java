package player;

public class GenericPlayer {
	
	private String name;
	private Account account;
	
	public GenericPlayer(String name)
	{
		this.name = name;
		account = new Account(0);
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	public Account accessAccount()
	{
		if(account==null){
			account = new Account(0);
		}
		return this.account;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + "]";
	}
	
	

}