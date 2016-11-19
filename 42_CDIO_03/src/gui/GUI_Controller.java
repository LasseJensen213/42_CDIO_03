package gui;
import board.Board;
import desktop_resources.GUI;
import game.GameController;

public class GUI_Controller {

	private Board gameBoard;
	private BoardGameGUI gameGUI;

	public void controller()
	{
		gameBoard = new Board();
		gameBoard.generateBoard();
		while(true)
		{
			gameGUI = new BoardGameGUI();
			String input = gameGUI.menu();
			if(input.equals("New game"))
			{
				GameController game = new GameController();
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
	
	



}
