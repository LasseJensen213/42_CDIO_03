package field;

<<<<<<< HEAD
=======
import desktop_resources.GUI;
>>>>>>> refs/heads/Patch
import player.Player;

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
		if(owner==null && p.getAccount().getBalance()>super.getPrice())
		{
			//Hvis feltet ingen ejer har og spilleren har penge nok
			//Skal have mulighed for at købe
			String input = GUI.getUserSelection(new String[]{"Buy: "+this.getPrice(),"Skip"});
			if(input.equals("Buy: "+this.getPrice()))
			{
				this.setOwner(p);
				p.getAccount().deposit(-this.getPrice());

			String options[] = {"Buy","Skip"};
			String input = GUI.getUserSelection("Message", options);
			if(input.equals(options[0]))
			{
				this.setOwner(p);
				p.getAccount().withdraw(this.getPrice());

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
