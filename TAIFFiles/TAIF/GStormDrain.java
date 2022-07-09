import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import javax.swing.JOptionPane;
import java.awt.Component;
import java.awt.Color;
import acm.graphics.GImage;
import acm.graphics.GObject;
import acm.program.GraphicsProgram;

public class GStormDrain extends GCompound{
	GRect bk;
    GRect square;
	 GRect light;

    //Constructor
    GStormDrain()
    {
        bk = new GRect(800,800);
        add(bk,0,0);
		  bk.setFilled(true);
		  bk.setColor(Color.BLACK);
		  light = new GRect(90,90);
		  int yCoord = 110;
		  for(int i = 0; i < 6;i++)
		  {
				int xCoord = 10;
		  		for(int j = 0; j < 8;j++)
		  		{
					square = new GRect(90, 90);
					add(square, xCoord, yCoord);
					square.setFilled(true);
					square.setColor(Color.GRAY);
					xCoord+=100;
				}
				yCoord+=100;
			}
						light.setFilled(true);
			light.setColor(Color.YELLOW);
			/*
			int localXCoord = 410;
			int localYCoord = 610;
			add(light, localXCoord, localYCoord);
			pause(200);
			String code = "wwaawawdddwdwaaaw";
			for(int p = 0; p < code.length(); p++)
			{
				remove(light);
			  if ((code.substring(p,p+1)).equals("w"))
        		{
					localXCoord -= 100;
					add(light, localXCoord, localYCoord);
        		}
				else if ((code.substring(p,p+1)).equals("a"))
        		{
         			localYCoord -= 100;
					add(light, localXCoord, localYCoord);
        		}
				else if ((code.substring(p,p+1)).equals("d"))
        		{
         			localYCoord += 100;
					add(light, localXCoord, localYCoord);
        		}
				else
				{}
				pause(200);
			}
			*/
    }

}
