package board;


import java.awt.Color;

import board.FieldGenerator;
import desktop_fields.Field;
import desktop_fields.Tax;
import desktop_resources.GUI;

public class Board {

	
	public static void generateBoard()
	{
		//Intialize the fields
		FieldGenerator.initTerritoryFields();
		FieldGenerator.initFleetFields();
		FieldGenerator.initTaxFields();
		FieldGenerator.initLaborCampFields();
		
		FieldGenerator.initRefugeFields();
		
		//Initialize the colors
		FieldGenerator.initbgcolor();
		FieldGenerator.initfgcolor();
		
		Field[] fields = new Field[40];

		for (int i = 0; i<fields.length;i++)
		{
			String title = FieldGenerator.getFields(i).getTitle();
			if (title == null)
			{
				title = "";
			}
			String descr = FieldGenerator.getFields(i).getDescr();
			if (descr == null)
			{
				descr = "";
			}
			String subtext = FieldGenerator.getFields(i).getSubtext();
			if (subtext == null)
			{
				subtext = "";
			}
			Color bgColor = FieldGenerator.getBgColors(i);
			Color fgColor = FieldGenerator.getFgColors(i);
			fields[i]= new Tax.Builder().setTitle(title).setDescription(descr).setSubText(subtext).
					setBgColor(bgColor).setFgColor(fgColor).build();
			
		}
		GUI.create(fields);
		
		
	}




}
