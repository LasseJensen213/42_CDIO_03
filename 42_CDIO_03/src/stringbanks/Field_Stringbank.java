package stringbanks;

public class Field_Stringbank {

	//Field Titles
	private static String startTitle = "Start";

	//Types of fields:
	private static String territoryType = "Territory";
	private static String fleetType = "Fleet";
	private static String laborCampType = "Labor Camp";
	private static String taxType = "Tax";
	private static String refugeType = "Refuge";
	//Territory Titles
	private static String tribeEncampmentTitle = "Tribe encampment";
	private static String craterTitle = "Crater";
	private static String mountainTitle = "Mountain";
	private static String coldDesertTitle = "Cold Desert";
	private static String blackCaveTitle = "Black Cave";
	private static String wereWallTitle = "The Werewall";
	private static String mountainVillageTitle = "Mountain Village";
	private static String southCitadelTitle = "South Citadel";
	private static String palaceGatesTitle = "Palace Gates";
	private static String towerTitle = "Tower";
	private static String castleTitle = "Castle";

	//Fleet Titles
	private static String secondSailTitle = "Second Sail";
	private static String seaGroverTitle = "Sea Grover";
	private static String theBuccaneersTitle = "The Buccaneers";
	private static String privateerArmadeTitle = "Privateer Armada";
	
	//Labor Camp Titles
	private static String mountainHutsTitle = "Huts in the mountain";
	private static String thePitTitle = "The pit";

	//Tax Titles
	private static String goldmineTitle = "Goldmine";
	private static String caravanTitle = "Caravan";

	//Refuge Titles
	private static String walledCityTitle = "Walled City";
	private static String monasteryTitle = "Monastery";


	//Descriptions:
	//Start description.
	private static String startDescription = "Starting Field";
	
	//Territory descriptions.
	private static String tribeEncampmentDescription = "Price %d.";
	private static String craterDescription = "Price %d.";
	private static String mountainDescription = "Price %d.";
	private static String coldDesertDescription = "Price %d.";
	private static String blackCaveDescription = "Price %d.";
	private static String wereWallDescription = "Price %d.";
	private static String mountainVillageDescription = "Price %d.";
	private static String southCitadelDescription = "Price %d.";
	private static String palaceGatesDescription = "Price %d.";
	private static String towerDescription = "Price %d.";
	private static String castleDescription = "Price %d.";


	//Fleet descriptions:
	private static String secondSailDescription = "Price %d.";
	private static String seaGroverDescription = "Price %d.";
	private static String theBuccaneersDescription = "Price %d.";
	private static String privateerArmadeDescription = "Price %d.";


	//Labor Camp descriptions
	private static String mountainHutsDescription = "Price %d.";
	private static String thePitDescription = "Price %d.";

	//Tax fields description
	private static String goldmineDescription = "Lose: %d";
	private static String caravanDescription = "Lose: %d or 10%%";

	//Refuge descriptions:
	private static String walledCityDescription = "Price %d.";
	private static String monasteryDescription = "Price %d.";


	//Subtext:
	private static String startSubtext = "";
	
	//Territory subtext.
	private static String tribeEncampmentSubtext = territoryType + "<br>The Field \""  + tribeEncampmentTitle + "\" can be bought for %d." + "<br> The rent on this field is %d.";
	private static String craterSubtext = territoryType + "<br>The Field \""  + craterTitle + "\" can be bought for %d." + "<br> The rent on this field is %d.";
	private static String mountainSubtext = territoryType + "<br>The Field \""  + mountainTitle + "\" can be bought for %d." + "<br> The rent on this field is %d.";
	private static String coldDesertSubtext = territoryType + "<br>The Field \""  + coldDesertTitle + "\" can be bought for %d." + "<br> The rent on this field is %d.";
	private static String blackCaveSubtext = territoryType + "<br>The Field \""  + blackCaveTitle + "\" can be bought for %d." + "<br> The rent on this field is %d.";
	private static String wereWallSubtext = territoryType + "<br>The Field \"" + wereWallTitle + "\" can be bought for %d." + "<br> The rent on this field is %d.";
	private static String mountainVillageSubtext = territoryType + "<br>The Field \"" + mountainVillageTitle + "\" can be bought for %d." + "<br> The rent on this field is %d.";
	private static String southCitadelSubtext = territoryType + "<br>The Field \"" + southCitadelTitle + "\" can be bought for %d." + "<br> The rent on this field is %d.";
	private static String palaceGatesSubtext = territoryType + "<br>The Field \"" + palaceGatesTitle + "\" can be bought for %d." + "<br> The rent on this field is %d.";
	private static String towerSubtext = territoryType + "<br>The Field \"" + towerTitle + "\" can be bought for %d." + "<br> The rent on this field is %d.";
	private static String castleSubtext = territoryType + "<br>The Field \"" + castleTitle + "\" can be bought for %d." + "<br> The rent on this field is %d.";


	//Fleet subtext:
	private static String secondSailSubtext = fleetType + "<br>Rent: With 1 owned 500<br>" + "Rent: With 2 owned 1000<br>" + "Rent: With 3 owned 2000<br>" + "Rent: With 4 owned 4000";
	private static String seaGroverSubtext = fleetType + "<br>Rent: With 1 owned 500<br>" + "Rent: With 2 owned 1000<br>" + "Rent: With 3 owned 2000<br>" + "Rent: With 4 owned 4000";
	private static String theBuccaneersSubtext = fleetType + "<br>Rent: With 1 owned 500<br>" + "Rent: With 2 owned 1000<br>" + "Rent: With 3 owned 2000<br>" + "Rent: With 4 owned 4000";
	private static String privateerArmadeSubtext = fleetType + "<br>Rent: With 1 owned 500<br>" + "Rent: With 2 owned 1000<br>" + "Rent: With 3 owned 2000<br>" + "Rent: With 4 owned 4000";


	//Labor Camp subtext
	private static String mountainHutsSubtext = laborCampType + " <br> The Field \"" + mountainHutsTitle + "\" can be bought for %d <br>" + "Rent is calculated by diceresult times 100 times number of labor camps owned";
	private static String thePitSubtext = laborCampType + " <br> The Field \"" + thePitTitle + "\" can be bought for %d <br>" + "Rent is calculated by diceresult times 100 times number of labor camps owned";


	//Tax fields subtext
	private static String goldmineSubtext =  taxType + "<br> You have to pay %d on this field.";;
	private static String caravanSubtext = taxType + "<br> You have to pay %d or %d%% of your total assets on this field.";


	//Refuge subtexts.
	private static String walledCitySubtext = refugeType + "<br> You recieve %d on this field.";
	private static String monasterySubtext = refugeType + "<br> You recieve %d on this field.";


	//Title arrays:
	//Territory title array
	private static String territoryTitleArray[] = {tribeEncampmentTitle,craterTitle,mountainTitle,
		coldDesertTitle,blackCaveTitle,wereWallTitle,mountainVillageTitle,southCitadelTitle,
		palaceGatesTitle,towerTitle,castleTitle};
	
	//Fleet title array
	private static String fleetTitleArray[] = {secondSailTitle,seaGroverTitle,theBuccaneersTitle,privateerArmadeTitle};
	
	//Labor Camp title array
	private static String laborCampTitleArray[] = {mountainHutsTitle,thePitTitle};
	
	//Tax title array
	private static String taxTitleArray[] = {goldmineTitle,caravanTitle};
	
	//Refuge title array
	private static String refugeTitleArray[] = {walledCityTitle,monasteryTitle};
	
	//Description arrays:
	//Territory descriptions array.
	private static String territoryDescriptionsArray[] = {tribeEncampmentDescription,craterDescription,mountainDescription,
			coldDesertDescription,blackCaveDescription,wereWallDescription,mountainVillageDescription,southCitadelDescription,
			palaceGatesDescription,towerDescription,castleDescription};

	//Fleet description array.
	private static String fleetDescriptionArray[] = {secondSailDescription,seaGroverDescription,theBuccaneersDescription,privateerArmadeDescription};

	//Labor camp description array.
	private static String laborCampDescriptionArray[] = {mountainHutsDescription,thePitDescription};

	//Tax description array.
	private static String taxDescriptionArray[] = {goldmineDescription,caravanDescription};

	//Refuge description array.
	private static String refugeDescriptionArray[] = {walledCityDescription,monasteryDescription};


	//Subtext arrays.
	//Territory subtext array
	private static String territorySubtextArray[] = {tribeEncampmentSubtext,craterSubtext,mountainSubtext,coldDesertSubtext,
			blackCaveSubtext,wereWallSubtext,mountainVillageSubtext,southCitadelSubtext,palaceGatesSubtext,towerSubtext,castleSubtext};

	//Fleet subtext array.
	private static String fleetSubtextArray[] = {secondSailSubtext,seaGroverSubtext,theBuccaneersSubtext,privateerArmadeSubtext};

	//Labor Camp subtext array.
	private static String laborCampSubtextArray[] = {mountainHutsSubtext,thePitSubtext};

	//Tax subtext array.
	private static String taxSubtextArray[] = {goldmineSubtext,caravanSubtext};

	//Refuge subtext array.
	private static String refugeSubtextArray[] = {walledCitySubtext,monasterySubtext};


	
	
	//Title getters
	/**
	 * 
	 * @return Start Title
	 */
	public static String getStartTitle()
	{
		return startTitle;
	}
	
	/**
	 * 
	 * @param Nr
	 * @return Territory title
	 */
	public static String getTerritoryTitleArray(int Nr) {
		return territoryTitleArray[Nr];
	}
	
	/**
	 * 
	 * @param Nr
	 * @return Fleet Title
	 */
	public static String getFleetTitleArray(int Nr) {
		return fleetTitleArray[Nr];
	}
	
	/**
	 * 
	 * @param Nr
	 * @return Labor Camp Title
	 */
	public static String getLaborCampTitleArray(int Nr) {
		return laborCampTitleArray[Nr];
	}

	/**
	 * 
	 * @param Nr
	 * @return Tax Title
	 */
	public static String getTaxTitleArray(int Nr) {
		return taxTitleArray[Nr];
	}

	/**
	 * 
	 * @param Nr
	 * @return Refuge Title
	 */
	public static String getRefugeTitleArray(int Nr) {
		return refugeTitleArray[Nr];
	}
	
	//Description getters:
	/**
	 * 
	 * @return Starting field description
	 */
	public static String getStartDescription() 
	{
		return startDescription;
	}
	

	/**
	 * @param Nr
	 * @return Territory description.
	 */
	public static String getTerritoryDescriptionsArray(int Nr) {
		return territoryDescriptionsArray[Nr];
	}

	/**
	 * 
	 * @param Nr
	 * @return Fleet description
	 */
	public static String getFleetDescriptionArray(int Nr) {
		return fleetDescriptionArray[Nr];
	}

	/**
	 * 
	 * @param Nr
	 * @return Labor Camp description
	 */
	public static String getLaborCampDescriptionArray(int Nr) {
		return laborCampDescriptionArray[Nr];
	}

	/**
	 * 
	 * @param Nr
	 * @return Tax description
	 */
	public static String getTaxDescriptionArray(int Nr) {
		return taxDescriptionArray[Nr];
	}

	/**
	 * 
	 * @param Nr
	 * @return Refuge description
	 */
	public static String getRefugeDescriptionArray(int Nr) {
		return refugeDescriptionArray[Nr];
	}

	
	
	
	
	//Subtext getters:
	/**
	 * 
	 * return Starting field subtext
	 */
	public static String getStartSubtext()
	{
		return startSubtext;
	}
	
	/**
	 * 
	 * @param Nr
	 * @return Territory subtext
	 */
	public static String getTerritorySubtextArray(int Nr) {
		return territorySubtextArray[Nr];
	}

	/**
	 * 
	 * @param Nr
	 * @return Fleet subtext
	 */
	public static String getFleetSubtextArray(int Nr) {
		return fleetSubtextArray[Nr];
	}

	/**
	 * 
	 * @param Nr
	 * @return Labor Camp subtext
	 */
	public static String getLaborCampSubtextArray(int Nr) {
		return laborCampSubtextArray[Nr];
	}

	/**
	 * 
	 * @param Nr
	 * @return Tax subtext
	 */
	public static String getTaxSubtextArray(int Nr) {
		return taxSubtextArray[Nr];
	}
	
	/**
	 * 
	 * @param Nr
	 * @return Refuge subtext
	 */
	public static String getRefugeSubtextArray(int Nr) {
		return refugeSubtextArray[Nr];
	}


	


}