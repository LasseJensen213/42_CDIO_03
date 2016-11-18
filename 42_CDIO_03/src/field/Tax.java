package field;
import desktop_resources.GUI;
import player.Player;
public class Tax extends Field{
	private int taxAmount;;
	private int taxRate;
	
	protected Tax(int taxAmount, int taxRate)
	{
		this.taxAmount = taxAmount;
		this.taxRate = taxRate;
	}

	
	@Override
	public void landOnField(Player player)
	{
		if (taxRate == 0)
		{
			GUI.showMessage("Tax message 2000 coins");
			player.getAccount().withdraw(taxAmount);
			
		}
		else
		{
			int percentage = player.getAccount().getBalance()*taxRate/100;
			String procent = "10%: " + percentage;
			String options[] = {"4000","10 procent, svarende til:" + procent};
			String input = GUI.getUserSelection("Valg: 4000 eller 10% af balance", options);
			
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
	
	
	
}
