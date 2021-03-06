package stringbanks;

public class Game_Stringbank {

	//These are the string used by the main game and the menu
	
	//Main menu options
	private static String mainMenuMsg = "Welcome to the boardgame. Please choose from the menu";
	private static String newGame ="New game";
	private static String endGame ="Close";
	private static String getRules ="Rules of the game";
	private static String gameRules ="This game is for 2-6 players of all ages.\n"
			+ "On the players turn they roll 2 dice and the game will move their car accordingly.\n"
			+ "There are five types of fields. Territory, Refuge, Labor camp, tax and fleet.\n"
			+ " - Territory, fleet and labor camp are ownable fields that the player will have the option to buy. "
			+ "Other players will then have to pay the owner each time they land on that field.\n"
			+ " - On a refuge field the player will receive either 500 or 5000 depending on the refuge.\n"
			+ " - On a tax field the player pays either 2000, or 4000 or 10% of their assets, depending on the tax field.\n"
			+ "When a player hits 0 they lose. The game ends when all but one player is broke.";
	
	private static String[]mainMenuArr = {mainMenuMsg,newGame,endGame,getRules,gameRules};
	
	//Pre roll menu options
	private static String preRollMenuMsg = "%s: It's your turn";
	private static String roll = "Roll the dice";
	private static String backToMenu = "Back to menu";
	
	private static String[]preRollMenuArr = {preRollMenuMsg,roll,backToMenu};
	
	//Confirm input message and true / false button
	private static String confirmMessage = "Are you sure?";
	private static String trueButton = "Yes";
	private static String falseButton = "No";
	
	private static String[] yesNoArr = {trueButton,falseButton};
	private static String[] confirmArr = {confirmMessage, trueButton,falseButton};
	
	//Messages for Land on field methods in the field subclasses
	private static String buyOption = "Yes - I want to buy the field.";
	private static String dontBuy = "No - I don't want to buy the field.";
	
	private static String ownableFieldMsg_NoOwner = "You've landed the field \"%s\". Do you want to buy it?";
	private static String ownableFieldMsg_YouOwn = "You've landed on your own field \"%s\"";
	private static String ownableFieldMsg_DontOwn = "%s have to pay %s '%d'.";
	private static String refugeMsg = "You've recieved a bonus of: %d";
	private static String tax_NoOption ="You've landed on a Tax field. You have to pay %d";
	private static String tax_TwoOptions = "You've landed on a Tax field. \n     You have to pay %d or 10%% of you total assets";
	private static String tax_Option1 ="Pay: %d";
	private static String tax_Option2 ="10%%: %d";
	
	//Restart message.
	private static String restartMessage = "Do you want to play the game again?";
	
	/**
	 * Field messages.
	 * @return 
	 * 0: Buy <br>
	 * 1: Don't buy <br>
	 * 2: No owner <br>
	 * 3: Players own field <br>
	 * 4: Not players own field <br>
	 * 5: Refuge message <br>
	 * 6: Cheap tax field <br>
	 * 7: Expensive tax field <br>
	 * 8: Tax - Pay 4000 <br>
	 * 9: Tax - Pay 10% of assets <br>
 	 */
	private static String[] fieldMsg = {buyOption , dontBuy , ownableFieldMsg_NoOwner,
										ownableFieldMsg_YouOwn , ownableFieldMsg_DontOwn,
										refugeMsg , tax_NoOption , tax_TwoOptions, tax_Option1, tax_Option2};
	
	private static String winnerMsg = "Congratulations! %s you have beaten all the other players. ";
	
	private static String brokeMsg = "%s is broke and has been removed from the game";
	/**
	 * 
	 *
	 * @param msg int [0:4]
	 * @return
	 * 0: main menu msg<br>
	 * 1: New game option<br>
	 * 2: end game option <br>
	 * 3: getRules option <br>
	 * 4: The game's rules<br>
	 */
	public static String getMainMenuMsg(int msg)
	{
		return mainMenuArr[msg];
	}
	
	/**
	 * Pre roll menu msg
	 * @param msg int [0:2]
	 * @return
	 * 0: Menu message, this one needs formatting(takes a string as argument)<br>
	 * 1: roll option<br>
	 * 2: back to menu option <br>
	 */
	
	public static String getPreRollMsg(int msg)
	{
		return preRollMenuArr[msg];
	}
	
	/**
	 * Confirm input messages 
	 * @param msg int[0:2]
	 * @return
	 * 0: Confirm input message<br>
	 * 1: True option<br>
	 * 2: false option<br>
	 */
	
	public static String getConfirmMsg(int msg)
	{
		return confirmArr[msg];
	}
	
	
	/**
	 * The messages for the fields' land on field methods
	 * @param msg int[0:9]
	 * @return
	 * 0 : Buy option<br>
	 * 1 : Dont buy options<br>
	 * 2 : When you can buy message a field(Needs fieldtype name , price , rent)<br>
	 * 3 : When you own the field(needs fieldtype name)<br>
	 * 4 : When you don't own the field (Needs player name, rent)<br>
	 * 5 : when you've landed on refuge(Needs the bonus)<br>
	 * 6 : When  you've landed on the simple tax field(Needs the tax amount)<br>
	 * 7 : When you've landed on the more complex tax field(Needs the tax amount)<br>
	 * 8 : First option in complex tax(needs tax Amount)<br>
	 * 9 : Second option in complex tax(needs tax percentage<br>
	 */
	public static String getFieldMsg(int msg)
	{
		return fieldMsg[msg];
	}

	public static String getWinnerMsg()
	{
		return winnerMsg;
	}
	
	public static String getBrokeMsg()
	{
		return brokeMsg;
	}

	public static String getRestartMessage() {
		return restartMessage;
	}

	public static String[] getYesNoArr() {
		return yesNoArr;
	}
	
	
}
