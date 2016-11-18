package stringbanks;

public class Refuge_Stringbank {

	//Refuge descriptions:
	private static String walledCityDescription = "Description";
	private static String monasteryDescription = "Description";
	
	//Refuge subtexts.
	private static String walledCitySubtext = "subtext";
	private static String monasterySubtext = "subtext";
	
	//Refuge description and subtext arrays
	private static String refugeDescriptionArray[] = {walledCityDescription,monasteryDescription};
	private static String refugeSubtextArray[] = {walledCitySubtext,monasterySubtext};
	
	
	
	//Refuge getters

	public static String getRefugeDescriptionArray(int i) {
		return refugeDescriptionArray[i];
	}
	public static String getRefugeSubtextArray(int i) {
		return refugeSubtextArray[i];
	}
	
}
