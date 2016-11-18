package stringbanks;

public class Territory_Stringbank {

	//Territory descriptions.
	private static String tribeEncampmentDescription = "Description";
	private static String craterDescription = "Description";
	private static String mountainDescription = "Description";
	private static String coldDesertDescription = "Description";
	private static String blackCaveDescription = "Description";
	private static String wereWallDescription = "Description";
	private static String mountainVillageDescription = "Description";
	private static String southCitadelDescription = "Description";
	private static String palaceGatesDescription = "Description";
	private static String towerDescription = "Description";
	private static String castleDescription = "Description";
	
	
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
	
	
	
	
	
	
	
	//Territory descriptions array
	private static String territoryDescriptionsArray[] = {tribeEncampmentDescription,craterDescription,mountainDescription,coldDesertDescription,
			blackCaveDescription,wereWallDescription,mountainVillageDescription,southCitadelDescription,palaceGatesDescription,
			towerDescription,castleDescription};
	
	//Territory subtext array
	private static String territorySubtextArray[] = {tribeEncampmentSubtext,craterSubtext,mountainSubtext,coldDesertSubtext,blackCaveSubtext,
			wereWallSubtext,mountainVillageSubtext,southCitadelSubtext,palaceGatesSubtext,towerSubtext,castleSubtext};

	
	//Getters 
	public static String getTerritoryDescriptionsArray(int i) {
		return territoryDescriptionsArray[i];
	}

	public static String getTerritorySubtextArray(int i) {
		return territorySubtextArray[i];
	}
	
	
}
