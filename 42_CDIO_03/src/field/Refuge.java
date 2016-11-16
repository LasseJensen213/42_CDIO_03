package field;

import player.Player;

public class Refuge {

	private int receive;

	//Constructor
	public Refuge(int receive) {
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

}
