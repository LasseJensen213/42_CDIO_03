package field;
import player.Player;
public class Tax extends Field{
	private int taxAmount;;
	private int taxRate;
	
	protected Tax(int taxAmount, int taxRate)
	{
		this.taxAmount = taxAmount;
		this.taxRate = taxRate;
	}

	
	
	private void landOnField(Player player)
	{
		int pos = player.getPos();
		
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
