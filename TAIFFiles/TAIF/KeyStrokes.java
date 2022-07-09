import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import javax.swing.JOptionPane;

import acm.program.GraphicsProgram;
class KeyStrokes implements KeyListener
{
	private static String pressed;
  //This instance variable is so the KeyListener can access the object made in another class and move it as appropriate.
	private GImage mc;
	private static String code;
	private static int counter;
KeyStrokes(GImage mc, String code) //Can replace with your object
{
	pressed = "";
	this.mc = mc;
	this.code = "w" + code;
	counter = 0;
}

@Override
public void keyTyped(KeyEvent e) {

}

@Override
public void keyPressed(KeyEvent e) {
     
 
if(e.getKeyCode() == KeyEvent.VK_W||e.getKeyCode() == KeyEvent.VK_UP) 
{
	mc.move(0,-100);
	pressed = "w";
	counter ++;
	
}

if(e.getKeyCode() == KeyEvent.VK_A||e.getKeyCode() == KeyEvent.VK_LEFT) 
{
	mc.move(-100, 0);
	pressed = "a";
	counter ++;
}

if(e.getKeyCode() == KeyEvent.VK_D||e.getKeyCode() == KeyEvent.VK_RIGHT) 
{
	mc.move(100, 0);
	pressed = "d";
	counter ++;
}


if(counter < code.length() -1 && !pressed.equals(code.substring(counter, counter + 1)))
{
	showMessage("Wrong way !! Try again.");
	//You can include any bad ending you want here. I'm just making them start over
	mc.setLocation(420,  600);
	counter = 0;
}

}



@Override
public void keyReleased(KeyEvent e) {
// TODO Auto-generated method stub

}

public static String getPressed()
{
	return pressed;
}

public static boolean passed()
{
	if(counter == code.length() - 1)
		return true;
	return false;
}

public static void showMessage(String message )
{
    JOptionPane.showMessageDialog(null, message, "Results",
                                  JOptionPane.PLAIN_MESSAGE );
}
}


