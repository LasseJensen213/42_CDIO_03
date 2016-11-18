package stringbanks;

public class Tax_Stringbank {

	
	//Tax fields description
	private static String goldmineDescription = "description";
	private static String caravanDescription = "description";
	
	//Tax fields subtext
	private static String goldmineSubtext = "subtext";
	private static String caravanSubtext = "subtext";
	
	//Tax desciption and subtext arrays
	private static String goldmineDescriptionArray[] = {goldmineDescription,caravanDescription};
	private static String goldmineSubtextArray[] = {goldmineDescription,caravanSubtext};
	
	
	public static String getTaxDescriptionArray(int i) {
		return goldmineDescriptionArray[i];
	}
	public static String getTaxSubtextArray(int i) {
		return goldmineSubtextArray[i];
	}
	
	
	
}
