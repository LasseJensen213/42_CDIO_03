package field;

import player.Player;


public abstract class Field {
	
	
	
	String descr; //Beskrivelse, der bruges til det store felt i midten
	String subtext; //Beskrivelse i selve feltet i GUI
	
	public Field(String descr,String subtext )
	{
		this.descr = descr;
		this.subtext = subtext;
	}
	
	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getSubtext() {
		return subtext;
	}

	public void setSubtext(String subtext) {
		this.subtext = subtext;
	}

	abstract void landOnField(Player player);

	@Override
	public String toString() {
		return "Field: "+descr;
	}
	
}
