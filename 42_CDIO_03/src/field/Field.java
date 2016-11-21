package field;

import player.Player;


public abstract class Field {
	
	
	String title; //Titel på selve feltet i GUI.
	String descr; //Beskrivelse i selve feltet i GUI
	String subtext; //Beskrivelse, der bruges til det store felt i midten
	
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

	public abstract void landOnField(Player player);
	/**
	 * If the player corresponds to the owner, then the owner is set to null.
	 * @param player
	 */
	public abstract void freeOwner(Player player, int pos);

	@Override
	public String toString() {
		return "Field: "+descr;
	}
	
}
