package field;

import gui.BoardGameGUI;
import player.Player;

public class Refuge extends Field {

	private int receive;

	//Constructor
	public Refuge(String title, String descr, String subtext, int receive)
	{
		super(title, descr, subtext);
		this.receive = receive;
		subtext = String.format(subtext, receive);
		descr = String.format("Bonus: %d", receive);
		this.setDescr(descr);
		this.setSubtext(subtext);
	}

	//Getter
	public int getReceive() {
		return this.receive;
	}


	//Actions happening when landing on field "Refuge"
	@Override
	public void landOnField(Player p) {
		BoardGameGUI gui = new BoardGameGUI();
		p.getAccount().deposit(receive);
		gui.showRefugeMsg(receive);
	}

	@Override
	public String toString()
	{
		return super.toString()+" Type: "+this.getClass().getName()+" Bonus: "+receive;
	}

	@Override
	public int getRent()
	{
		return 0;
	}

	@Override
	public void freeOwner(Player player, int pos) {	
		
	}

}

