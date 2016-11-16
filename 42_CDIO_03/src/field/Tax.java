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
		
		int pos = player.getPlayerPos();
		if (pos == 3)
		{
			GUI.showMessage("Tax message 2000 coins");
			player.getAccount().withdraw(taxAmount);
			
		}
		else if (pos == 21) 
		{
			int percentage = player.getAccount().getBalance()*this.taxRate;
			String procent = "10%: " + percentage;
			String options[] = {"4000",procent};
			GUI.showMessage("Valg 4000 eller 10% af balance");
			GUI.getUserSelection("Vælg", options);
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
