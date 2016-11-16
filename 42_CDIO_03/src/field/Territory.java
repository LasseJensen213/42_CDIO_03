package field;

import player.Player;

public class Territory extends Ownable {

	private int rent;
	
	public Territory(int price, int rent)
	{
		super(price);
		this.rent = rent;
	}
	@Override
	public int getRent()
	{
		return rent;
	}
	@Override
	public  void landOnField(Player p)
	{
		Player owner = this.getOwner();
		if(owner==null && p.getAccount().getBalance()>super.getPrice())
		{
			//Hvis feltet ingen ejer har
			//Skal have mulighed for at købe, hvis han køber bliver 
			//Hvis feltet ingen ejer har og spilleren har penge nok
			//Skal have mulighed for at købe
			String input = GUI.getUserSelection("Do you want to buy this territory? Price is: "+this.getPrice(),new String[]{"Buy","Skip"});
			if(input.equals("Buy"))
			{
				this.setOwner(p);
				p.getAccount().deposit(-this.getPrice());
			}
		}
		else if(owner==p)
		{
			//Hvis spilleren ejer feltet
			//Sker der ikke noget
			//dette skal være tomt
		}
		else
		{
			//Hvis spilleren ikke ejer feltet
			//Betaler automatisk renten
			//owner skal så have pengene
			
			p.getAccount().deposit(-rent);
			owner.getAccount().deposit(rent);
		}
	}
}
