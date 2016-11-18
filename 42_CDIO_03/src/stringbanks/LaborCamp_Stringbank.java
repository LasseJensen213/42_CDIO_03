package stringbanks;

public class LaborCamp_Stringbank {

	//Labor Camp descriptions
	private static String mountainHutsDescription = "description";
	private static String thePitDescription = "description";
	
	//Labor Camp subtext
	private static String mountainHutsSubtext = "subtext";
	private static String thePitSubtext = "subtext";
	
	//Labor camp description array.
	private static String laborCampDescriptionArray[] = {mountainHutsDescription,thePitDescription};
	
	//Labor Camp subtext array.
	private static String laborCampSubtextArray[] = {mountainHutsSubtext,thePitSubtext};

	public static String getLaborCampDescriptionArray(int i) {
		return laborCampDescriptionArray[i];
	}

	public static String getLaborCampSubtextArray(int i) {
		return laborCampSubtextArray[i];
	}
	
	
}
