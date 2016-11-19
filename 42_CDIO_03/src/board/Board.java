package board;

import java.awt.Color;

import desktop_resources.GUI;
import field.*;

import stringbanks.*;
public class Board {

	//Field array
	Field fields[] = new Field[40];	

	//GUI Colours
	Color bgColors[] = new Color[40];
	Color fgColors[] = new Color[40];

	/**
	 * Describes the fields in use in the GUI.
	 */
	int fieldsInUse[] = {0,2,4,6,8,10,11,13,15,17,19,20,22,24,26,28,30,31,33,35,37,39};

	//	Start: 1
	//	Territory: 2,5,6,8,10,11,13,14,16,17,19
	//	Refuge: 12,22
	//	Labor Camp: 7,18
	//	Tax: 3,21
	//	Fleet: 4,9,15,20

	//Territory related information.
	int territoryPrice[] = {1000,1500,2000,3000,4000,4300,4750,5000,5500,6000,8000};
	int territoryRent[] = {100,300,500,700,1000,1300,1600,2000,2600,3200,4000};
	int territoryPlace[] = {2,5,6,8,10,11,13,14,16,17,19};

	//Labor Camp related information.
	int laborCampPrice[] = {2500,2500};
	int laborCampBaseRent[] = {100,100};
	int laborCampPlace[] = {7,18};

	//Fleet related information.
	int fleetPrice[] = {4000,4000,4000,4000};
	int fleetPlace[] = {4,9,15,20};

	//Tax related information.
	int tax_TaxAmount[] = {2000,4000};
	int tax_TaxRate[] = {0,10};
	int taxPlace[] = {3,21};

	//Refuge related information.
	int refugeRecieve[] = {5000,500};
	int refugePlace[] = {12,22};

	//Field arrays:
	//Territory fields.
	Territory territoryFields[] = new Territory[11];
	Fleet fleetFields[] = new Fleet[4];
	Tax taxFields[] = new Tax[2];
	LaborCamp laborCampFields[] = new LaborCamp[2];
	Refuge refugeFields[] = new Refuge[2];






	/**
	 * Initializes the territory fields
	 */
	public void initTerritoryFields()
	{
		for(int i=0;i<territoryFields.length;i++)
		{
			String description = Territory_Stringbank.getTerritoryDescriptionsArray(i);
			String subtext = Territory_Stringbank.getTerritorySubtextArray(i);
			int price = territoryPrice[i];
			int rent = territoryRent[i];
			territoryFields[i] = new Territory(description,subtext,rent,price);
		}
	}

	/**
	 * initalizes the fleet fields
	 */
	public void initFleetFields()
	{
		for(int i=0;i<fleetFields.length;i++)
		{
			String description = Fleet_Stringbank.getFleetDescriptionArray(i);
			String subtext = Fleet_Stringbank.getFleetSubtextArray(i);
			int price = fleetPrice[i];
			fleetFields[i] = new Fleet(description,subtext,price);
		}
	}

	/**
	 * initoalizes the tax fields
	 */
	public void initTaxFields()
	{
		for(int i=0;i<taxFields.length;i++)
		{
			String description = Tax_Stringbank.getTaxDescriptionArray(i);
			String subtext = Tax_Stringbank.getTaxSubtextArray(i);
			int taxAmount = tax_TaxAmount[i];
			int taxRate = tax_TaxRate[i];
			taxFields[i] = new Tax(description,subtext,taxAmount,taxRate);
		}
	}

	/**
	 * initializes the labor camp fields
	 */
	public void initLaborCampFields()
	{
		for(int i=0;i<laborCampFields.length;i++)
		{
			String description = LaborCamp_Stringbank.getLaborCampDescriptionArray(i);
			String subtext = LaborCamp_Stringbank.getLaborCampSubtextArray(i);
			int price = laborCampPrice[i];
			int baseRent = laborCampBaseRent[i];
			laborCampFields[i] = new LaborCamp(description,subtext,price,baseRent);
		}
	}

	/**
	 * initializes the refuge fields
	 */
	public void initRefugeFields() 
	{
		for(int i=0;i<taxFields.length;i++)
		{
			String description = Refuge_Stringbank.getRefugeDescriptionArray(i);
			String subtext = Refuge_Stringbank.getRefugeSubtextArray(i);
			int recieve = refugeRecieve[i];
			refugeFields[i] = new Refuge(description,subtext,recieve);
		}
	}


	public void initializeFields()
	{
		int territoryPlaceReached = 0;
		int fleetPlaceReached = 0;
		int refugePlaceReached = 0;
		int taxPlaceReached = 0;
		int laborCampPlaceReached = 0;
		for(int i = 0;i<fields.length;i++)
		{
			if(i==0)
			{
				
			}
			if(i==territoryPlace[territoryPlaceReached])
			{
				fields[i] =	territoryFields[territoryPlaceReached];
				territoryPlaceReached++;
				
				if(territoryPlaceReached>territoryFields.length)
				{
					territoryPlaceReached=0;
				}
			}
			else if(i==fleetPlaceReached)
			{
				fields[i] = fleetFields[fleetPlaceReached];
				fleetPlaceReached++;
				if(fleetPlaceReached>fleetFields.length)
				{
					fleetPlaceReached=0;
				}
			}
			else if(i==taxPlaceReached)
			{
				fields[i] = taxFields[taxPlaceReached];
				taxPlaceReached++;
				if(taxPlaceReached>taxFields.length)
				{
					taxPlaceReached=0;
				}
			}
			else if(i==laborCampPlaceReached)
			{
				fields[i] = laborCampFields[laborCampPlaceReached];
				laborCampPlaceReached++;
				if(laborCampPlaceReached>laborCampFields.length)
				{
					laborCampPlaceReached=0;
				}
			}
			else if(i==refugePlaceReached)
			{
				fields[i] = refugeFields[refugePlaceReached];
				refugePlaceReached++;
				if(refugePlaceReached>refugeFields.length)
				{
					refugePlaceReached=0;
				}
			}
			

		}
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
