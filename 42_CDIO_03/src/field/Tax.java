package field;

public class Tax extends Field{
	private int taxAmount;;
	private int taxRate;
	
	protected Tax(int taxAmount, int taxRate)
	{
		this.taxAmount = taxAmount;
		this.taxRate = taxRate;
	}
	
	
	
}
