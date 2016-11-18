package field;

<<<<<<< HEAD
<<<<<<< HEAD
public class Territory extends Ownable {
=======
=======
>>>>>>> branch 'Patch' of https://github.com/LasseJensen213/42_CDIO_03
import desktop_resources.GUI;
import player.Player;
<<<<<<< HEAD
>>>>>>> branch 'Patch' of https://github.com/LasseJensen213/42_CDIO_03
=======
>>>>>>> branch 'Patch' of https://github.com/LasseJensen213/42_CDIO_03

<<<<<<< HEAD
<<<<<<< HEAD
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
			//Skal have mulighed for at købe
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
=======
=======
>>>>>>> branch 'Patch' of https://github.com/LasseJensen213/42_CDIO_03
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
<<<<<<< HEAD
>>>>>>> branch 'Patch' of https://github.com/LasseJensen213/42_CDIO_03
=======
>>>>>>> branch 'Patch' of https://github.com/LasseJensen213/42_CDIO_03
		}
	}
}
