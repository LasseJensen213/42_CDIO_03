package gui;
import board.Board;
import desktop_resources.GUI;
import game.GameController;
import stringbanks.Game_Stringbank;

public class GUI_Controller {
	private boolean testmode = false;
	private boolean quit = false;
	private static boolean backFromMenu = false;

	private Board gameBoard;
	private BoardGameGUI gameGUI;

	public GUI_Controller()
	{
		gameBoard = new Board();
		gameGUI = new BoardGameGUI();
	}


	//Main
	public void startGame()
	{
		boolean playGame = true;
		while(playGame)
		{
			backFromMenu=false;
			mainMenuController();
			if (quit)
			{
				break;
			}
			else if(!backFromMenu)
				playGame = restart();

		}

	}
	/**
	 * Function that starts the game when called.
	 */
	public void mainMenuController()
	{

		gameBoard.generateBoard();

		while(true)
		{

			gameGUI = new BoardGameGUI();
			String input = gameGUI.menu();
			if(input.equals(Game_Stringbank.getMainMenuMsg(1)))
			{
				GameController game = new GameController();
				game.testmode(testmode);
				game.gameControl(); 
				break;

			}
			else if(input.equals(Game_Stringbank.getMainMenuMsg(3)))
			{
				gameGUI.showRules();
			}
			else if(gameGUI.confirmInput())
			{
				GUI.close();
				this.quit = true;
				break;

			}

		}
	}

	/**
	 * 
	 * @param name: Player name
	 * @return true if player wants to roll the dice <br> false if the player wants to quit the game
	 *
	 */
	public boolean preRollMenuController(String name)
	{
		while(true)
		{
			if(testmode == true)
			{
				return true;
			}
			else if(testmode ==false)
			{	
				String input = gameGUI.preRollMenu(name);

				if(input.equals(Game_Stringbank.getPreRollMsg(1)))
					return true;
				else if(gameGUI.confirmInput()){
					backFromMenu = true;
					return false;
				}		
			}				
		}
	}

	public void setTestmode(boolean testmode) {
		this.testmode = testmode;
	}

	public boolean restart()
	{
		String input = GUI.getUserSelection(Game_Stringbank.getRestartMessage(), Game_Stringbank.getYesNoArr());
		if(input == "Yes")
		{
			GUI.close();

			return true;
		}
		else
		{
			GUI.close();
			return false;
		}
	}




}
