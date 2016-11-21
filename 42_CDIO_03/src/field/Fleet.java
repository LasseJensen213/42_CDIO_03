package field;

import desktop_resources.GUI;
import player.Player;

public class Fleet extends Ownable{

	public Fleet(String title,String descr, String subtext,int price)
	{
		super(title,descr,subtext,price);

	}

	@Override
	public int getRent() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void landOnField (Player p) 
	{
		GUI.showMessage("You landed on fleet");
	
		Player owner = this.getOwner();
		if(owner==null && p.getAccount().getBalance()>super.getPrice())
		{
			//Hvis feltet ingen ejer har
			//Skal have mulighed for at købe, hvis han køber bliver 
			//Hvis feltet ingen ejer har og spilleren har penge nok
			//Skal have mulighed for at købe
			
				String options[] = {"Buy","Skip"};
				String input = GUI.getUserSelection("Message", options);
				if(input.equals(options[0]))
				{
					this.setOwner(p);
					int alreadyOwned = p.getFleetsOwned();
					p.setFleetsOwned(alreadyOwned+1);
					p.getAccount().withdraw(this.getPrice());
				}

		}
		else if(this.getOwner()!=p){
			int FleetsOwned = this.getOwner().getFleetsOwned();

			switch(FleetsOwned) {
			case 1: FleetsOwned = 500 ;  
			break;
			case 3: FleetsOwned = 1000 ;  
			break;
			case 2: FleetsOwned = 2000 ;  
			break;
			case 4: FleetsOwned = 4000 ;  
			break;
			}
			p.getAccount().withdraw(FleetsOwned);
			this.getOwner().getAccount().deposit(FleetsOwned);
		}


	}

	@Override
	public void freeOwner(Player player) {
		if(this.getOwner()==player)
			this.setOwner(null);

	}

}
