package board;

import java.awt.Color;
import field.*;

import stringbanks.*;
public class FieldGenerator {

	//Field array
	private static Field fields[] = new Field[40];	

	//GUI Colours
	private static Color bgColors[] = new Color[40];
	private static Color fgColors[] = new Color[40];

	/**
	 * Describes the fields in use in the GUI.
	 */
	private final static int fieldsInUse[] = {0,2,4,6,8,10,11,13,15,17,19,20,22,24,26,28,30,31,33,35,37,39};
	int nFields = 22; 				// Number of fields in use
	//Territory related information.
	private final static int territoryPrice[] = {1000,1500,2000,3000,4000,4300,4750,5000,5500,6000,8000};
	private final static int territoryRent[] = {100,300,500,700,1000,1300,1600,2000,2600,3200,4000};
	private final static int territoryPlace[] = {2,5,6,8,10,11,13,14,16,17,19};

	//Labor Camp related information.
	private final static int laborCampPrice[] = {2500,2500};
	private final static int laborCampBaseRent[] = {100,100};
	private final static int laborCampPlace[] = {7,18};

	//Fleet related information.
	private final static int fleetPrice[] = {4000,4000,4000,4000};
	private final static int fleetPlace[] = {4,9,15,20};

	//Tax related information.
	private final static int tax_TaxAmount[] = {2000,4000};
	private final static int tax_TaxRate[] = {0,10};
	private final static int taxPlace[] = {3,21};

	//Refuge related information.
	private final static int refugeRecieve[] = {5000,500};
	private final static int refugePlace[] = {12,22};

	//Field arrays:
	//Territory fields.
	private static Territory territoryFields[] = new Territory[11];
	private static Fleet fleetFields[] = new Fleet[4];
	private static Tax taxFields[] = new Tax[2];
	private static LaborCamp laborCampFields[] = new LaborCamp[2];
	private static Refuge refugeFields[] = new Refuge[2];






	/**
	 * Initializes the territory fields
	 */
	public static void initTerritoryFields()
	{
		for(int i=0;i<territoryFields.length;i++)
		{
			String title = Field_Stringbank.getTerritoryTitleArray(i);
			String description = Field_Stringbank.getTerritoryDescriptionsArray(i);
			String subtext = Field_Stringbank.getTerritorySubtextArray(i);
			int price = territoryPrice[i];
			int rent = territoryRent[i];
			territoryFields[i] = new Territory(title,description,subtext,price,rent);
		}
	}

	/**
	 * initalizes the fleet fields
	 */
	public static void initFleetFields()
	{
		for(int i=0;i<fleetFields.length;i++)
		{
			String title = Field_Stringbank.getFleetTitleArray(i);
			String description = Field_Stringbank.getFleetDescriptionArray(i);
			String subtext = Field_Stringbank.getFleetSubtextArray(i);
			int price = fleetPrice[i];
			fleetFields[i] = new Fleet(title,description,subtext,price);
		}
	}

	/**
	 * initoalizes the tax fields
	 */
	public static void initTaxFields()
	{
		for(int i=0;i<taxFields.length;i++)
		{
			String title = Field_Stringbank.getTaxTitleArray(i);
			String description = Field_Stringbank.getTaxDescriptionArray(i);
			String subtext = Field_Stringbank.getTaxSubtextArray(i);
			int taxAmount = tax_TaxAmount[i];
			int taxRate = tax_TaxRate[i];
			taxFields[i] = new Tax(title,description,subtext,taxAmount,taxRate);
		}
	}

	/**
	 * initializes the labor camp fields
	 */
	public static void initLaborCampFields()
	{
		for(int i=0;i<laborCampFields.length;i++)
		{
			String title = Field_Stringbank.getLaborCampTitleArray(i);
			String description = Field_Stringbank.getLaborCampDescriptionArray(i);
			String subtext = Field_Stringbank.getLaborCampSubtextArray(i);
			int price = laborCampPrice[i];
			int baseRent = laborCampBaseRent[i];
			laborCampFields[i] = new LaborCamp(title,description,subtext,price,baseRent);
		}
	}

	/**
	 * initializes the refuge fields
	 */
	public static void initRefugeFields() 
	{
		for(int i=0;i<taxFields.length;i++)
		{
			String title = Field_Stringbank.getRefugeTitleArray(i);
			String description = Field_Stringbank.getRefugeDescriptionArray(i);
			String subtext = Field_Stringbank.getRefugeSubtextArray(i);
			int recieve = refugeRecieve[i];
			refugeFields[i] = new Refuge(title,description,subtext,recieve);
		}
	}

	/**
	 * Initialize the field array
	 */
	public static void initializeFields()
	{
		int territoryPlaceReached = 0;
		int fleetPlaceReached = 0;
		int refugePlaceReached = 0;
		int taxPlaceReached = 0;
		int laborCampPlaceReached = 0;


		for(int i = 0;i<fields.length;i++)
		{
			int territoryNr = gotoGUIField(territoryPlace[territoryPlaceReached]-1);
			int fleetNr = gotoGUIField(fleetPlace[fleetPlaceReached]-1);
			int taxNr = gotoGUIField(taxPlace[taxPlaceReached]-1);
			int laborCampNr = gotoGUIField(laborCampPlace[laborCampPlaceReached]-1);
			int refugeNr = gotoGUIField(refugePlace[refugePlaceReached]-1);
			if(i==territoryNr)
			{
				fields[i] = territoryFields[territoryPlaceReached];
				territoryPlaceReached++;

				if(territoryPlaceReached==territoryFields.length)
				{
					territoryPlaceReached=0;
				}
			}
			else if(i==fleetNr)
			{
				fields[i] = fleetFields[fleetPlaceReached];
				fleetPlaceReached++;
				if(fleetPlaceReached==fleetFields.length)
				{
					fleetPlaceReached=0;
				}
			}
			else if(i==taxNr)
			{
				fields[i] = taxFields[taxPlaceReached];
				taxPlaceReached++;
				if(taxPlaceReached==taxFields.length)
				{
					taxPlaceReached=0;
				}
			}
			else if(i==laborCampNr)
			{
				fields[i] = laborCampFields[laborCampPlaceReached];
				laborCampPlaceReached++;
				if(laborCampPlaceReached==laborCampFields.length)
				{
					laborCampPlaceReached=0;
				}
			}
			else if(i==refugeNr)
			{
				fields[i] = refugeFields[refugePlaceReached];
				refugePlaceReached++;
				if(refugePlaceReached==refugeFields.length)
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
	public static void initbgcolor()
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
	public static void initfgcolor()
	{	int fieldNrReached = 0;
	for(int i = 0;i<40;i++)
	{
		fgColors[i]=Color.BLACK;
		if(fieldsInUse[fieldNrReached]==i)
		{
			fgColors[i]=Color.BLACK;
			fieldNrReached++;
		}

	}
	}

	/**
	 * Translates between the fields (22 in total) and the GUI board (40 in total)
	 * @param Nr
	 * @return
	 */
	public static int gotoGUIField(int Nr)
	{
		return (fieldsInUse[Nr]);
	}

	public static Field getFields(int Nr) {
		return fields[Nr];
	}

	public static Color getBgColors(int Nr) {
		return bgColors[Nr];
	}

	public static Color getFgColors(int Nr) {
		return fgColors[Nr];
	}


	public static int getFieldsInUse(int Nr)
	{
		return fieldsInUse[Nr];
	}


}
