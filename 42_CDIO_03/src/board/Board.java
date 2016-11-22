package board;


import java.awt.Color;

import board.FieldGenerator;
import desktop_fields.Brewery;
import desktop_fields.Field;
import desktop_fields.Refuge;
import desktop_fields.Shipping;
import desktop_fields.Street;
import desktop_fields.Tax;
import desktop_resources.GUI;

import stringbanks.Field_Stringbank;

public class Board {


	public static void generateBoard()
	{
		//Intialize the fields
		FieldGenerator.initTerritoryFields();
		FieldGenerator.initFleetFields();
		FieldGenerator.initTaxFields();
		FieldGenerator.initLaborCampFields();
		FieldGenerator.initRefugeFields();
		FieldGenerator.initializeFields();

		//Initialize the colors
		FieldGenerator.initbgcolor();
		FieldGenerator.initfgcolor();

		String title;
		String descr;
		String subtext;
		String name = "";

		Field[] fields = new Field[40];
		int fieldInUseReached = 0;

		for (int i = 0; i<fields.length;i++)
		{
			int fieldReached = FieldGenerator.getFieldsInUse(fieldInUseReached);

			if(i==fieldReached && fieldReached==0)
			{
				title = Field_Stringbank.getStartTitle();
				descr = Field_Stringbank.getStartDescription();
				subtext = Field_Stringbank.getStartSubtext();

				fieldInUseReached++;
			}
			else if(i==fieldReached)
			{
				title =FieldGenerator.getFields(i).getTitle();
				descr = FieldGenerator.getFields(i).getDescr();
				subtext = FieldGenerator.getFields(i).getSubtext();
				name = FieldGenerator.getFields(i).getClass().getName();

				fieldInUseReached++;
			}
			else
			{
				title = "";
				descr = ""; 
				subtext = "";
			}



			Color bgColor = FieldGenerator.getBgColors(i);
			Color fgColor = FieldGenerator.getFgColors(i);
			if(name=="field.Territory")
			{
				
			}
			else if(name=="field.Tax")
			{
				fields[i]= new Tax.Builder().setTitle(title).setDescription(title).setSubText(descr).
						setBgColor(bgColor).setFgColor(fgColor).build();
			}
			else if(name=="field.LaborCamp")
			{
				fields[i]= new Brewery.Builder().setTitle(title).setDescription(title).setSubText(descr).
						setBgColor(bgColor).setFgColor(fgColor).build();
			}
			else if(name=="field.Fleet")
			{
				fields[i]= new Shipping.Builder().setTitle(title).setDescription(title).setSubText(descr).
						setBgColor(bgColor).setFgColor(fgColor).build();
			}
			else if(name=="field.Refuge")
			{
				fields[i]= new Refuge.Builder().setTitle(title).setDescription(title).setSubText(descr).
						setBgColor(bgColor).setFgColor(fgColor).build();
			}
			System.out.println("Generating " +  title + "..");
		}
		GUI.create(fields);



	}




}
