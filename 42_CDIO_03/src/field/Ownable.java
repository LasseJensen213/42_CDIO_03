package field;
import player.Player;
public abstract class Ownable extends Field{
	private int price;
	private Player owner;
	
		
	
	
	public Ownable(int price)
	{
		this.price = price;
	}
	
	public abstract int getRent();
	
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
