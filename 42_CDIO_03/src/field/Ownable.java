package field;
import player.Player;
public class Ownable extends Field{
	private int price;
	private Player owner;
	
		
	
	
	
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
