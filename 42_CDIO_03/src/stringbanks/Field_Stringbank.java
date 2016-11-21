package stringbanks;

public class Field_Stringbank {

	//Field Titles
	private static String startTitle = "Start";

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
	private static String tribeEncampmentDescription = "Price: %d";
	private static String craterDescription = "Price: %d";
	private static String mountainDescription = "Description";
	private static String coldDesertDescription = "Description";
	private static String blackCaveDescription = "Description";
	private static String wereWallDescription = "Description";
	private static String mountainVillageDescription = "Description";
	private static String southCitadelDescription = "Description";
	private static String palaceGatesDescription = "Description";
	private static String towerDescription = "Description";
	private static String castleDescription = "Description";


	//Fleet descriptions:
	private static String secondSailDescription = "description";
	private static String seaGroverDescription = "description";
	private static String theBuccaneersDescription = "description";
	private static String privateerArmadeDescription = "description";


	//Labor Camp descriptions
	private static String mountainHutsDescription = "description";
	private static String thePitDescription = "description";

	//Tax fields description
	private static String goldmineDescription = "description";
	private static String caravanDescription = "description";

	//Refuge descriptions:
	private static String walledCityDescription = "Description";
	private static String monasteryDescription = "Description";


	//Subtext:
	private static String startSubtext = "Subtext";
	
	//Territory subtext.
	private static String tribeEncampmentSubtext = "Subtext";
	private static String craterSubtext = "Subtext";
	private static String mountainSubtext = "Subtext";
	private static String coldDesertSubtext = "Subtext";
	private static String blackCaveSubtext = "Subtext";
	private static String wereWallSubtext = "Subtext";
	private static String mountainVillageSubtext = "Subtext";
	private static String southCitadelSubtext = "Subtext";
	private static String palaceGatesSubtext = "Subtext";
	private static String towerSubtext = "Subtext";
	private static String castleSubtext = "Subtext";


	//Fleet subtext:
	private static String secondSailSubtext = "Subtext";
	private static String seaGroverSubtext = "Subtext";
	private static String theBuccaneersSubtext = "Subtext";
	private static String privateerArmadeSubtext = "Subtext";


	//Labor Camp subtext
	private static String mountainHutsSubtext = "subtext";
	private static String thePitSubtext = "subtext";


	//Tax fields subtext
	private static String goldmineSubtext = "subtext";
	private static String caravanSubtext = "subtext";


	//Refuge subtexts.
	private static String walledCitySubtext = "subtext";
	private static String monasterySubtext = "subtext";


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