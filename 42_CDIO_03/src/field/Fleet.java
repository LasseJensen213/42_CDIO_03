package field;

import desktop_resources.GUI;
import gui.BoardGameGUI;
import player.Player;
import stringbanks.Game_Stringbank;

public class Fleet extends Ownable{

	public Fleet(String title,String descr, String subtext,int price)
	{
		super(title,descr,subtext,price);
		descr = String.format(descr, price);
		System.out.println(descr);
		this.setDescr(descr);

	}

	@Override
	public int getRent() {
		// TODO Auto-generated method stub
		if(this.getOwner()==null)
			return 500;
		
		return (int)(500*Math.pow(2,this.getOwner().getFleetsOwned()-1));
	}

	@Override
	public void landOnField (Player p) 
	{
		BoardGameGUI gui = new BoardGameGUI();
		Player owner = this.getOwner();
		if(owner==null )
		{
			if(p.getAccount().getBalance()>super.getPrice())
			{
				//Hvis feltet ingen ejer har
				//Skal have mulighed for at købe, hvis han køber bliver 
				//Hvis feltet ingen ejer har og spilleren har penge nok
				//Skal have mulighed for at købe

				String input = gui.buyMenu(this.getTitle(), this.getPrice(), this.getRent());
				if(input.equals(Game_Stringbank.getFieldMsg(0)))
				{
					this.setOwner(p);
					int alreadyOwned = p.getFleetsOwned();
					p.setFleetsOwned(alreadyOwned+1);
					gui.setOwner(p.getPlayerPos(), p.getName());
					p.getAccount().withdraw(this.getPrice());
				}

			}
		}
		else if(this.getOwner()==p)
		{
			gui.showYourFieldMsg(this.getTitle());
		}
		else if(this.getOwner()!=p){
			int FleetsOwned = this.getOwner().getFleetsOwned();
			FleetsOwned = (int)(500*Math.pow(2, FleetsOwned-1));
			//			switch(FleetsOwned) {
			//			case 1: FleetsOwned = 500 ;  
			//			break;
			//			case 3: FleetsOwned = 1000 ;  
			//			break;
			//			case 2: FleetsOwned = 2000 ;  
			//			break;
			//			case 4: FleetsOwned = 4000 ;  
			//			break;
			//			}
			p.getAccount().withdraw(FleetsOwned);
			this.getOwner().getAccount().deposit(FleetsOwned);
			gui.showOpponentFieldMsg(this.getOwner().getName(),p.getName(), FleetsOwned);
		}


	}

	@Override
	public void freeOwner(Player player, int pos) {
		BoardGameGUI gui = new BoardGameGUI();
		if(!(this.getOwner()==null)){
			if(this.getOwner().getName().equals(player.getName()))
			{
				gui.removeOwner(pos);
				this.setOwner(null);
				this.setDescr(String.format("Price: %d", this.getPrice()));
			}
		}

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
