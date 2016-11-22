package gui;
import board.Board;
import desktop_resources.GUI;
import game.GameController;
import stringbanks.Game_Stringbank;

public class GUI_Controller {
	private boolean testmode = false;
	
	private Board gameBoard;
	private BoardGameGUI gameGUI;

	public GUI_Controller()
	{
		gameBoard = new Board();
		gameGUI = new BoardGameGUI();
	}

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
				
				// når man hopper ud af denne metode er GUI'en 
				//lukket ned så man skal starte den op igen
				GUI.close();
				gameBoard = new Board();
				gameBoard.generateBoard();

			}
			else if(input.equals(Game_Stringbank.getMainMenuMsg(3)))
			{
				gameGUI.showRules();
			}
			else if(gameGUI.confirmInput())
			{
				GUI.close();
				break;
			}
		}
	}

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
				else if(gameGUI.confirmInput())
					return false;
			}				
		}
	}

	public void setTestmode(boolean testmode) {
		this.testmode = testmode;
	}





}
