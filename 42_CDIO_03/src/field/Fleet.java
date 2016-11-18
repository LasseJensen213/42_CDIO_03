package field;

import player.Player;

public class Fleet extends Ownable{
	
	public Fleet(String descr, String subtext,int price)
	{
		super(descr,subtext,price);
		
	}

	@Override
	public int getRent() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	void landOnField(Player player) {
		// TODO Auto-generated method stub
		
	}
	
}
