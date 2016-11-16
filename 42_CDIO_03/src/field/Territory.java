package field;

public class Territory extends Ownable {

	private int rent;
	
	public Territory(int price, int rent)
	{
		super(price);
		this.rent = rent;
	}
	
	public int getRent()
	{
		return rent;
	}
	
	public  void landOnField(Player p)
	{
		Player owner = this.getOwner();
		if(owner==null)
		{
			//Hvis feltet ingen ejer har
			//Skal have mulighed for at købe, hvis han køber bliver 
		}
		else if(owner==p)
		{
			//Hvis spilleren ejer feltet
			//Sker der ikke noget
		}
		else
		{
			//Hvis spilleren ikke ejer feltet
			//Betaler automatisk renten
			//owner skal så have pengene
		}
	}
}
