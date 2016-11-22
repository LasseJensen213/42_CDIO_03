package field;

import desktop_resources.GUI;
import gui.BoardGameGUI;
import player.Player;
import stringbanks.Game_Stringbank;

//Her skal man også betale en afgift til ejeren.
//Beløbet bestemmes ved at slå med terningerne og gange resultatet med 100. 
//Dette tal skal så ganges med antallet af Labor camps med den samme ejer. 

public class LaborCamp extends Ownable {

	private int baseRent;


	public LaborCamp(String title, String descr, String subtext,int price, int baseRent)
	{
		super(title, descr, subtext, price);
		this.baseRent = baseRent;
		descr = String.format("Price: %d", price);
		this.setDescr(descr);

	}

	@Override
	public void landOnField(Player player){
		BoardGameGUI gui = new BoardGameGUI();
		if(super.getOwner() == null){
			if(player.getAccount().getBalance()>this.getPrice()){
				String input = gui.buyMenu(this.getTitle(), this.getPrice(), this.getRent());
				if(input.equals(Game_Stringbank.getFieldMsg(0)))
				{
					this.setOwner(player);
					player.setLaborOwned(player.getLaborOwned()+1);
					player.getAccount().withdraw(this.getPrice());
					gui.setOwner(player.getPlayerPos(), player.getName());
				}


			}
		}
		else if(this.getOwner()==player)
		{
			gui.showYourFieldMsg(this.getTitle());
		}
		else if(!(this.getOwner()==null))
		{
			int diceTotal = player.getDiceResult();
			int nLaborCampsOwned = this.getOwner().getLaborOwned();
			player.getAccount().withdraw(baseRent*diceTotal*nLaborCampsOwned);
			this.getOwner().getAccount().deposit(baseRent*diceTotal*nLaborCampsOwned);
			gui.showOpponentFieldMsg(this.getOwner().getName(), baseRent*diceTotal*nLaborCampsOwned);
		}

	}

	@Override
	public int getRent()
	{
		return this.baseRent;
	}

	@Override
	public String toString()
	{
		return super.toString()+" Type: "+this.getClass().getName()+" Base rent: "+baseRent;
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