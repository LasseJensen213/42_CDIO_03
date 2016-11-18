package board;

import java.awt.Color;
import field.Field;
import field.Territory;
import stringbanks.TerritoryStringbank;
public class Board {

	//Field array
	int fields[] = new int[40];	
	
	//GUI Colours
	Color bgColors[] = new Color[40];
	Color fgColors[] = new Color[40];

	/**
	 * Describes the fields in use in the GUI.
	*/
	int fieldsInUse[] = {0,2,4,6,8,10,11,13,15,17,19,20,22,24,26,28,30,31,33,35,37,39};
	
	//Territory related information.
	String territorydescriptions[] = new String[11];
	String territorysubtext[] = new String[11];
	int territoryPrice[] = {1000,1500,2000,3000,4000,4300,4750,5000,5500,6000,8000};
	int territoryRent[] = {100,300,500,700,1000,1300,1600,2000,2600,3200,4000};
	
	//Territory fields.
	Territory territoryFields[] = new Territory[11];
	
	
	public void initTerritoryFields()
	{
		for(int i=0;i<territoryFields.length;i++)
		{
			territoryFields[i] = new Territory(TerritoryStringbank.)
		}
	}
//			public Territory(String descr, String subtext,int price, int rent)
	Territory a = new Territory("descr","subtext",30,40);
	
	

//	public void opretfields() 
//	{
//		for()
//	}
//	//Array {100,300,500..
//	//pris	{1000,1500.


	/**
	 * Initialize the background colors in the GUI
	 * @return bgColor array
	 */
	public void initbgcolor()
	{
		int fieldNrReached = 0;
		for(int i = 0;i<40;i++)
		{
			bgColors[i]=Color.BLACK;

			if(fieldsInUse[fieldNrReached]==i)
			{
				bgColors[i]=Color.YELLOW;
				fieldNrReached++;
			}
			
		}
	}

	/**
	 * Initialize the text colors in the GUI
	 * @return fgColor array
	 */
	public void initfgcolor()
	{	int fieldNrReached = 0;
		for(int i = 0;i<40;i++)
		{
			fgColors[i]=Color.BLACK;
			if(fieldsInUse[fieldNrReached]==i)
			{
				fgColors[i]=Color.GREEN;
				fieldNrReached++;
			}
			
		}
	}



}
