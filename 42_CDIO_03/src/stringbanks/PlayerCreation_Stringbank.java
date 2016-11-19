package stringbanks;

public class PlayerCreation_Stringbank {

	
	//Messages used by PlayerManager class
	private static String chooseNumPlayers = "Please choose the number of players [2-6]";
	private static String choosePlayerName = "Player %d please choose your name [MAX 16 CHARACTERS]";
	private static String nameTooLong = "The name is too long";
	private static String nameTaken = "Sorry, but that name has been taken";

	private static String[] PlayerManager_Messages ={chooseNumPlayers,choosePlayerName,nameTooLong,nameTaken};
	
	
	/**
	 * 
	 * @param msgIndex
	 * @return 0 : Choose number of players message<br>
	 * 1: Choose player name message(needs formatting)<br>
	 * 2: Name is too long message<br>
	 * 3: The name is taken message<br>
	 * 
	 */
	public static String getMsg(int msgIndex)
	{
		return PlayerManager_Messages[msgIndex];
	}
}
