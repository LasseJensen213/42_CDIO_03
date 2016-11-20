package field;
import desktop_resources.GUI;
import player.Player;


public class Territory extends Ownable {

	private int rent;

	
	
	public Territory(String title, String descr, String subtext,int price, int rent)
	{
		super(title, descr, subtext, price);
		this.rent = rent;
	}

	
	@Override
	public int getRent()
	{
		return rent;
	}

	
	@Override
	public  void landOnField(Player player)
	{
		Player owner = this.getOwner();
		if(owner==null && player.getAccount().getBalance()>super.getPrice())
		{
			//Hvis feltet ingen ejer har
			//Skal have mulighed for at købe, hvis han køber bliver 
			//Hvis feltet ingen ejer har og spilleren har penge nok
			//Skal have mulighed for at købe
			
				String options[] = {"Buy","Skip"};
				String input = GUI.getUserSelection("Message", options);
				if(input.equals(options[0]))
				{
					this.setOwner(player);
					player.getAccount().withdraw(this.getPrice());
				}

		}
		else if(this.getOwner().getName().equals(player.getName()))
		{
			//Hvis spilleren ejer feltet
			//Sker der ikke noget
			//dette skal være tomt
		}
		else if(!(owner==null))
		{
			//Hvis spilleren ikke ejer feltet
			//Betaler automatisk renten
			//owner skal så have pengene

			player.getAccount().withdraw(rent);
			owner.getAccount().deposit(rent);

		}
	}
	
	@Override
	public String toString()
	{
		return super.toString()+" Type: "+this.getClass().getName()+" Rent: "+rent;
	}


	@Override
	public void freeOwner(Player player) {
		if(this.getOwner().getName().equals(player.getName()))
			this.setOwner(null);
		
	}
}
