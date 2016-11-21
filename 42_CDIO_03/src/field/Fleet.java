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
	public void landOnField (Player player) 
	{
		Player owner = this.getOwner();

		if(owner == null && super.getPrice() < player.getAccount().getBalance());{
			String answer = GUI.getUserSelection("Do you want to buy this Fleet?  Price is:"+this.getPrice(), new String[] {"buy", "skip"});

			if(answer.equals("buy"));{
				this.setOwner(player);
				player.getAccount().deposit(-this.getPrice());
			}


		}
		if(this.getOwner()!=player){
			int FleetsOwned = player.getFleetsOwned();

			switch(FleetsOwned) {
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

	@Override
	public void freeOwner(Player player) {
		if(this.getOwner()==player)
			this.setOwner(null);

	}

}
//package field;
//
//import java.util.Scanner;
//
//import desktop_resources.GUI;
//import player.Player;
//
//public class Fleet extends Ownable{
//
//	public Fleet(int price) {
//		super(price);
//		// TODO Auto-generated constructor stub
//	}
//	Scanner keyb = new Scanner(System.in);
//	String FleetNumb = keyb.nextLine();
//
//
//	public void LandOnField (Player player) {
//		Player owner = this.getOwner();
//
//		if(owner == null && super.getPrice() < player.getAccount().getBalance());{
//			String answer = GUI.getUserSelection("Do you want to buy this Fleet?  Price is:"+this.getPrice(), new String[] {"buy", "skip"});
//
//			if(answer.equals("buy"));{
//				this.setOwner(player);
//				player.getAccount().deposit(-this.getPrice());
//			}
//
//
//		}
//		if(this.getOwner()!=player){
//			int FleetsOwned = this.getOwner().getFleets;
//
//			switch(FleetNumb) {
//			case "1": FleetsOwned = 500 ;  
//			break;
//			case "2": FleetsOwned = 1000 ;  
//			break;
//			case "3": FleetsOwned = 2000 ;  
//			break;
//			case "4": FleetsOwned = 4000 ;  
//			break;
//			}
//			player.getAccount().deposit(-FleetsOwned);
//			this.getOwner().getAccount().deposit(FleetsOwned);
//		}
//
//
//	}
//
//
//}
//
