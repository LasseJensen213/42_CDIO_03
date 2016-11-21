package gui;
import board.Board;
import desktop_resources.GUI;
import game.GameController;

public class GUI_Controller {
	private boolean testmode = true;
	
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
			if(input.equals("New game"))
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
			else if(input.equals("Rules of the game"))
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

	public boolean preRollMenuController()
	{
		while(true)
		{
			if(testmode == true)
			{
				return true;
			}
			else if(testmode ==false)
			{	
			String input = gameGUI.preRollMenu();

				if(input.equals("Roll dice"))
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
