package stringbanks;

public class Fleet_Stringbank {

	//Fleet descriptions:
	private static String secondSailDescription = "description";
	private static String seaGroverDescription = "description";
	private static String theBuccaneersDescription = "description";
	private static String privateerArmadaDescription = "description";

	//Fleet subtext:
	private static String secondSailSubtext = "Subtext";
	private static String seaGroverSubtext = "Subtext";
	private static String theBuccaneersSubtext = "Subtext";
	private static String privateerArmadaSubtext = "Subtext";

	//Fleet description array:
	private static String fleetDescriptionArray[] = {secondSailDescription,seaGroverDescription,theBuccaneersDescription,privateerArmadaDescription};
	private static String fleetSubtextArray[] = {secondSailSubtext,seaGroverSubtext,theBuccaneersSubtext,privateerArmadaSubtext};
	
	
	//Getters for Fleet description and subtext
	public static String getFleetDescriptionArray(int i) {
		return fleetDescriptionArray[i];
	}
	public static String getFleetSubtextArray(int i) {
		return fleetSubtextArray[i];
	}
	
	
	
}
