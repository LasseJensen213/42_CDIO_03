package stringbanks;

public class PlayerCreation_Stringbank {


	//Messages used by PlayerManager class
	private static String chooseNumPlayers = "Please choose the number of players [2-6]";
	private static String choosePlayerName = "Player %d please choose your name [MAX 16 CHARACTERS]";
	private static String nameTooLong = "The name is too long";
	private static String nameTaken = "Sorry, but that name has been taken";
	private static String chooseColor = "Choose the color for your car";

	
	private static String colorBlue = "Blue";
	private static String colorGreen = "Green";
	private static String colorRed = "Red";
	private static String colorYellow = "Yellow";
	private static String colorWhite ="White";
	private static String colorPink ="Pink";
	
	private static String[] PlayerCreation_Messages ={chooseNumPlayers,choosePlayerName,
													  nameTooLong,nameTaken,
													  chooseColor};
	
	private static String[] colors = {colorBlue , 
									  colorGreen , colorRed, 
									  colorYellow , colorWhite , colorPink};


	/**
	 * 
	 * @param msgIndex
	 * @return 0 : Choose number of players message<br>
	 * 1: Choose player name message(needs formatting)<br>
	 * 2: Name is too long message<br>
	 * 3: The name is taken message<br>
	 * 4:Choose a color message<br>
	 */
	public static String getMsg(int msgIndex)
	{
		return PlayerCreation_Messages[msgIndex];
	}
	
	public static String getColor(int colorIndex)
	{
		return colors[colorIndex];
	}
	
	public static String[] getColors()
	{
		return colors;
	}
}
