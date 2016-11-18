package gui;
import board.Board;
import desktop_resources.GUI;
import game.GameController;
public class GUI_Controller {

	private Board gameBoard;

	public void controller()
	{
		gameBoard = new Board();
		gameBoard.initilizeFields();
		while(true)
		{

			String input = BoardGameGUI.menu();
			if(input.equals("New game"))
			{
				GameController game = new GameController();
				game.controller(); 
				// når man hopper ud af denne metode er GUI'en 
				//lukket ned så man skal starte den op igen
				gameBoard = new Board();
				gameBoard.initilizeFields();

			}
			else if(input.equals("Rules of the game"))
			{
				BoardGameGUI.showRules();
			}
			else if(BoardGameGUI.confirmInput())
			{
				GUI.close();
				break;
			}
		}
	}

	public void showPreRollMenu()
	{
		String input = BoardGameGUI.preRollMenu();
		if(input.equals("Back to Menu"))
		{
			if(BoardGameGUI.confirmInput())
			{
				
			}
		}

	}


}
