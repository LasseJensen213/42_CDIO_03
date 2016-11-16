package field;

import desktop_resources.GUI;
import player.Player;

//Her skal man også betale en afgift til ejeren.
//Beløbet bestemmes ved at slå med terningerne og gange resultatet med 100. 
//Dette tal skal så ganges med antallet af Labor camps med den samme ejer. 

public class LaborCamp extends Ownable {

	private int baseRent;
	
	@Override
	public void landOnField(Player player){
		if(super.getOwner() == null && player.getAccount().getBalance()>this.getPrice()){
			String input = GUI.getUserSelection("Do You want to buy this LaborCamp? Price is: "+ this.getPrice(), new String[]{"buy", "skip"});
			if(input.equals("buy")){
				this.setOwner(player);
				player.getAccount().deposit(-this.getPrice());
			}
			
			
		}
		else if(this.getOwner()==player){
			
		}
		else{
			int diceTotal = player.getDiceTotal();
			int nLaborCampsOwned = this.getOwner().getLaborCamps();
			player.getAccount().deposit(-(baseRent*diceTotal*nLaborCampsOwned));
			this.getOwner().getAccount().deposit(baseRent*diceTotal*nLaborCampsOwned);
		}
			
		
		
		
	}
	
	

	
}
