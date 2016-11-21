package field;

import java.util.Scanner;

import desktop_resources.GUI;
import player.Player;

public class Fleet extends Ownable{

	public Fleet(int price) {
		super(price);
		// TODO Auto-generated constructor stub
	}
	Scanner keyb = new Scanner(System.in);
	String FleetNumb = keyb.nextLine();


	public void LandOnFeild (Player player) {
		Player owner = this.getOwner();

		if(owner == null && super.getPrice() < player.getAccount().getBalance());{
			String answar = GUI.getUserSelection("Do you want to buy this Fleet?  Price is:"+this.getPrice(), new String[] {"buy", "skip"});

			if(answar.equals("buy"));{
				this.setOwner(player);
				player.getAccount().deposit(-this.getPrice());
			}


		}
		if(this.getOwner()!=player){
			int FleetsOwned = this.getOwner().getFleets;

			switch(FleetNumb) {
			case "1": FleetsOwned = 500 ;  
			break;
			case "2": FleetsOwned = 1000 ;  
			break;
			case "3": FleetsOwned = 2000 ;  
			break;
			case "4": FleetsOwned = 4000 ;  
			break;
			}
			player.getAccount().deposit(-FleetsOwned);
			this.getOwner().getAccount().deposit(FleetsOwned);
		}


	}


}

