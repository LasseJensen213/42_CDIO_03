package field;

import player.Player;


public abstract class Field {
	
	
	String title; //Titel på selve feltet i GUI.
	String descr; //Beskrivelse, der bruges til det store felt i midten
	String subtext; //Beskrivelse i selve feltet i GUI
	
	public Field(String title, String descr,String subtext )
	{
		this.title = title;
		this.descr = descr;
		this.subtext = subtext;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
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
