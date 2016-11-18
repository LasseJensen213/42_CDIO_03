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
	int fieldsInUse[] = {0,2,4,6,8,10,11,13,15,17,19,20,22,24,26,28,30,31,33,35,37,39};

//	public void opretfields() 
//	{
//		for()
//	}
//	//Array {100,300,500..
//	//pris	{1000,1500.


	/**
	 * Initialize the background colors in the GUI
	 * @return bgColor array
	 */
	public void initbgcolor()
	{
		int fieldNrReached = 0;
		for(int i = 0;i<40;i++)
		{
			bgColors[i]=Color.BLACK;

			if(fieldsInUse[fieldNrReached]==i)
			{
				bgColors[i]=Color.GREEN;
				fieldNrReached++;
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
