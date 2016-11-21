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
	public void landOnField(Player player) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void freeOwner(Player player, int pos) {
		if(this.getOwner()==player)
			this.setOwner(null);
		
	}
	
}
