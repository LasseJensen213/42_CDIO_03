package field;
import player.Player;
public abstract class Ownable extends Field{
	private int price;
	private Player owner;
	
		
	public Ownable(int price)
	{
		this.price = price;
	}
	
	@Override
	abstract void landOnField(Player player);
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Player getOwner() {
		return owner;
	}
	public void setOwner(Player owner) {
		this.owner = owner;
	}
	
	
	
	
}
