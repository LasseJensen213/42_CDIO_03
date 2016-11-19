package board;


import board.FieldGenerator;
import desktop_fields.Field;
import desktop_fields.Tax;
import desktop_resources.GUI;

public class Board {

	
	public void generateBoard()
	{
		//Intialize the fields
		FieldGenerator.initTerritoryFields();
		initFleetFields();
		initTaxFields();
		initLaborCampFields();
		initRefugeFields();
		
		//Initialize the colors
		initbgcolor();
		initfgcolor();
		
		Field[] fields = new Field[nFields];

		for (int i = 0; i<fields.length;i++)
		{
			String Title = FieldGenerator.
			fields[i]= new Tax.Builder().setTitle(boardFields[i].getTitle()).setDescription(String.valueOf(boardFields[i].getDescr())).
					setSubText(boardFields[i].getSubtext()).setBgColor(bgColors[i]).setFgColor(fgColors[i]).build();
		}
		GUI.create(fields);
		
		
	}


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
