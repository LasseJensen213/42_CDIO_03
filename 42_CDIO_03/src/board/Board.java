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
		FieldGenerator.initFleetFields();
		FieldGenerator.initTaxFields();
		FieldGenerator.initLaborCampFields();
		FieldGeneator.initRefugeFields();
		
		//Initialize the colors
		FieldGenerator.initbgcolor();
		FieldGenerator.initfgcolor();
		
		Field[] fields = new Field[nFields];

		for (int i = 0; i<fields.length;i++)
		{
			String Title = FieldGenerator.getBoardFields(i).getTitle();
			String descr = FieldGenerator.getBoardFields(i).getDescr();
			String subtext = FieldGenerator.getBoardFields(i).getSubtext();
			Color bgcolor = FieldGenerator.g
			fields[i]= new Tax.Builder().setTitle(boardFields[i].getTitle()).setDescription(String.valueOf(boardFields[i].getDescr())).
					setSubText(boardFields[i].getSubtext()).setBgColor(bgColors[i]).setFgColor(fgColors[i]).build();
		}
		GUI.create(fields);
		
		
	}




}
