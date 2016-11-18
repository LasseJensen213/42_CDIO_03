package field;

import player.Player;

public class Refuge extends Field {

	private int receive;

	//Constructor
	public Refuge(String descr, String subtext, int receive)
	{
		super(descr, subtext);
		this.receive = receive;
	}

	//Getter
	public int getReceive() {
		return this.receive;
	}


	//Actions happening when landing on field "Refuge"

	public void landOnField(Player p) {
		p.getAccount().deposit(receive);
	}
	
	@Override
	public String toString()
	{
		return super.toString()+" Type: "+this.getClass().getName()+" Bonus: "+receive;
	}

}
