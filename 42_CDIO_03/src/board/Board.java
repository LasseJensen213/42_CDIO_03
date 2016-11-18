package board;

import java.awt.Color;
import field.Field;
public class Board {

	//Field array
	int fields[] = new int[40];	
	
	//GUI Colours
	Color bgColors[] = new Color[40];
	Color fgColors[] = new Color[40];
	
	/**
	 * @return true: if field is in use 
	 * <br> false: if field is not use
	 */
	boolean fieldsInUse[] = {true,false,true,false,true,false,true,false,true,false,true,true,false,true,false,true,false,true,false,true,true,false,true,false,true,false,true,false,true,false,true,true,false,true,false,true,false,true,false,true};






	/**
	 * Initialize the background colors in the GUI
	 * @return bgColor array
	 */
	public void initbgcolor()
	{
		for(int i = 0;i<40;i++)
		{
			if(fieldsInUse[i]==true)
			{
				bgColors[i]=Color.GREEN;
			}
			else if(fieldsInUse[i]==false)
			{
				bgColors[i]=Color.BLACK;
			}
		}
	}

	/**
	 * Initialize the text colors in the GUI
	 * @return fgColor array
	 */
	public void initfgcolor()
	{
		for(int i = 0;i<40;i++)
		{
			if(fieldsInUse[i]==true)
			{
				fgColors[i]=Color.YELLOW;
			}
			if(fieldsInUse[i]==false)
			{
				fgColors[i]=Color.BLACK;
			}
		}
	}



}
