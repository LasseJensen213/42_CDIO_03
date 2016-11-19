package field;

import player.Player;

public class Fleet extends Ownable{
	
	public Fleet(String title,String descr, String subtext,int price)
	{
		super(title,descr,subtext,price);
		
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
