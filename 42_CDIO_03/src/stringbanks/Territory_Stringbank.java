package stringbanks;

public class Territory_Stringbank {

	//Territory descriptions.
	String tribeEncampmentDescription = "Description";
	String craterDescription = "Description";
	String mountainDescription = "Description";
	String coldDesertDescription = "Description";
	String blackCaveDescription = "Description";
	String wereWallDescription = "Description";
	String mountainVillageDescription = "Description";
	String southCitadelDescription = "Description";
	String palaceGatesDescription = "Description";
	String towerDescription = "Description";
	String castleDescription = "Description";
	
	
	//Territory subtext.
	String tribeEncampmentSubtext = "Subtext";
	String craterSubtext = "Subtext";
	String mountainSubtext = "Subtext";
	String coldDesertSubtext = "Subtext";
	String blackCaveSubtext = "Subtext";
	String wereWallSubtext = "Subtext";
	String mountainVillageSubtext = "Subtext";
	String southCitadelSubtext = "Subtext";
	String palaceGatesSubtext = "Subtext";
	String towerSubtext = "Subtext";
	String castleSubtext = "Subtext";
	
	
	
	
	
	
	
	//Territory descriptions array
	String territoryDescriptionsArray[] = {tribeEncampmentDescription,craterDescription,mountainDescription,coldDesertDescription,
			blackCaveDescription,wereWallDescription,mountainVillageDescription,southCitadelDescription,palaceGatesDescription,
			towerDescription,castleDescription};
	
	//Territory subtext array
	String territorySubtextArray[] = {tribeEncampmentSubtext,craterSubtext,mountainSubtext,coldDesertSubtext,blackCaveSubtext,
			wereWallSubtext,mountainVillageSubtext,southCitadelSubtext,palaceGatesSubtext,towerSubtext,castleSubtext};

	
	//Getters 
	public String getTerritoryDescriptionsArray(int i) {
		return territoryDescriptionsArray[i];
	}

	public String getTerritorySubtextArray(int i) {
		return territorySubtextArray[i];
	}
	
	
}
