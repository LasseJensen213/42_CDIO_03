package field;
import player.Player;
public abstract class Ownable extends Field{
	private int price;
	private Player owner;
	
	public Ownable(String title, String descr, String subtext,int price)

	{
		super(title,descr,subtext);
		this.price = price;
	}
	
	
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
	
	
	@Override
	public String toString()
	{
		return super.toString()+" Price: "+price;
	}
	
	
}
