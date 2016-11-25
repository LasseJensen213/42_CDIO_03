package field;

import gui.BoardGameGUI;
import player.Player;
import stringbanks.Game_Stringbank;

public class Tax extends Field{
	private int taxAmount;
	private int taxRate;
	
	public Tax(String title, String descr, String subtext, int taxAmount, int taxRate)
	{
		super(title, descr, subtext);
		this.taxAmount = taxAmount;
		this.taxRate = taxRate;
		
		if(taxRate==10)
		{
			descr = String.format(descr, taxAmount);
			subtext = String.format(subtext, taxAmount,taxRate);

		}
		else if (taxRate==0)
		{
			descr = String.format(descr, taxAmount);
			subtext = String.format(subtext, taxAmount);
		}
		this.setDescr(descr);
		this.setSubtext(subtext);
	}

	/**
	 * 	
	 */
	@Override
	public void landOnField(Player player)
	{
		BoardGameGUI gui = new BoardGameGUI();
		if (taxRate == 0)
		{
			gui.showSimpleTax(this.taxAmount);
			player.getAccount().withdraw(taxAmount);
			
		}
		else
		{
			int percentage = player.getAccount().getBalance()*taxRate/100;
			String procent = String.format(Game_Stringbank.getFieldMsg(9), percentage);
			String normal = String.format(Game_Stringbank.getFieldMsg(8), this.taxAmount);
			String options[] = {normal,procent};
			String input = gui.showComplexTax(this.taxAmount, percentage);
			if(input.equals(options[0]))
				{
					player.getAccount().withdraw(taxAmount);
				}
			else if(input.equals(options[1]))
			{
				player.getAccount().withdraw(percentage);
			}
		}
		}
		
		
			
		
	
	
	
	
	
	
	public int getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(int taxAmount) {
		this.taxAmount = taxAmount;
	}

	public int getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(int taxRate) {
		this.taxRate = taxRate;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+" Type: "+this.getClass().getName()+" Tax: "+taxAmount;
	}

	@Override
	public void freeOwner(Player player, int pos) {
		
	}
	
	@Override
	public int getRent()
	{
		return 0;
	}
	
}
