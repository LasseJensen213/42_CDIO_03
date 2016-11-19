package board;

import java.awt.Color;
import field.*;

import stringbanks.*;
public class FieldGenerator {

	//Field array
	private Field boardFields[] = new Field[40];	

	//GUI Colours
	private Color bgColors[] = new Color[40];
	private Color fgColors[] = new Color[40];

	/**
	 * Describes the fields in use in the GUI.
	 */
	private final int fieldsInUse[] = {0,2,4,6,8,10,11,13,15,17,19,20,22,24,26,28,30,31,33,35,37,39};
	int nFields = 22; 				// Number of fields in use
	//Territory related information.
	private final int territoryPrice[] = {1000,1500,2000,3000,4000,4300,4750,5000,5500,6000,8000};
	private final int territoryRent[] = {100,300,500,700,1000,1300,1600,2000,2600,3200,4000};
	private final int territoryPlace[] = {2,5,6,8,10,11,13,14,16,17,19};

	//Labor Camp related information.
	private final int laborCampPrice[] = {2500,2500};
	private final int laborCampBaseRent[] = {100,100};
	private final int laborCampPlace[] = {7,18};

	//Fleet related information.
	private final int fleetPrice[] = {4000,4000,4000,4000};
	private final int fleetPlace[] = {4,9,15,20};

	//Tax related information.
	private final int tax_TaxAmount[] = {2000,4000};
	private final int tax_TaxRate[] = {0,10};
	private final int taxPlace[] = {3,21};

	//Refuge related information.
	private final int refugeRecieve[] = {5000,500};
	private final int refugePlace[] = {12,22};

	//Field arrays:
	//Territory fields.
	private Territory territoryFields[] = new Territory[11];
	private Fleet fleetFields[] = new Fleet[4];
	private Tax taxFields[] = new Tax[2];
	private LaborCamp laborCampFields[] = new LaborCamp[2];
	private Refuge refugeFields[] = new Refuge[2];






	/**
	 * Initializes the territory fields
	 */
	public void initTerritoryFields()
	{
		for(int i=0;i<territoryFields.length;i++)
		{
			String title = Field_Stringbank.getTerritoryTitleArray(i);
			String description = Field_Stringbank.getTerritoryDescriptionsArray(i);
			String subtext = Field_Stringbank.getTerritorySubtextArray(i);
			int price = territoryPrice[i];
			int rent = territoryRent[i];
			territoryFields[i] = new Territory(title,description,subtext,rent,price);
		}
	}

	/**
	 * initalizes the fleet fields
	 */
	public void initFleetFields()
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
	public void initTaxFields()
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
	public void initLaborCampFields()
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
	public void initRefugeFields() 
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
	public void initializeFields()
	{
		int territoryPlaceReached = 0;
		int fleetPlaceReached = 0;
		int refugePlaceReached = 0;
		int taxPlaceReached = 0;
		int laborCampPlaceReached = 0;


		for(int i = 0;i<boardFields.length;i++)
		{
			if(i==0)
			{

			}
			if(i==territoryPlace[territoryPlaceReached])
			{
				boardFields[i] =	territoryFields[territoryPlaceReached];
				territoryPlaceReached++;

				if(territoryPlaceReached>territoryFields.length)
				{
					territoryPlaceReached=0;
				}
			}
			else if(i==fleetPlaceReached)
			{
				boardFields[i] = fleetFields[fleetPlaceReached];
				fleetPlaceReached++;
				if(fleetPlaceReached>fleetFields.length)
				{
					fleetPlaceReached=0;
				}
			}
			else if(i==taxPlaceReached)
			{
				boardFields[i] = taxFields[taxPlaceReached];
				taxPlaceReached++;
				if(taxPlaceReached>taxFields.length)
				{
					taxPlaceReached=0;
				}
			}
			else if(i==laborCampPlaceReached)
			{
				boardFields[i] = laborCampFields[laborCampPlaceReached];
				laborCampPlaceReached++;
				if(laborCampPlaceReached>laborCampFields.length)
				{
					laborCampPlaceReached=0;
				}
			}
			else if(i==refugePlaceReached)
			{
				boardFields[i] = refugeFields[refugePlaceReached];
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

	/**
	 * Translates between the fields (22 in total) and the GUI board (40 in total)
	 * @param Nr
	 * @return
	 */
	public int gotoGUIField(int Nr)
	{
		return (fieldsInUse[Nr]);
	}

	public Field getBoardFields(int Nr) {
		return boardFields[Nr];
	}

	public Color getBgColors(int Nr) {
		return bgColors[Nr];
	}

	public Color getFgColors(int Nr) {
		return fgColors[Nr];
	}
	
	
	

}
