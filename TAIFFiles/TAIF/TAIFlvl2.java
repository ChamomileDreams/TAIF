import java.util.Scanner;
import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class TAIFlvl2 extends GraphicsProgram {
	public static final int APPLICATION_WIDTH = 800;  // x size of window
	public static final int APPLICATION_HEIGHT = 800; // y size of window

  public void run() {
  	//add scanner
    Scanner scan = new Scanner(System.in);
	 
	 //declare variables
    int timeSpent = 0;
    int win = 0;
	 
	 //name?
	  GRect newCharScreen = new GRect(800,800);
	 add(newCharScreen,0,0);
	 newCharScreen.setFilled(true);
	 newCharScreen.setColor(Color.BLACK);
    GImage bk = new GImage("BKLogo.png");
	 bk.setSize(800,800);
	 add(bk,0,0);
	 String name = getString("Welcome to The Adventures In Fieldville LVL 2. What is your name? ");
	 
	 //choose your character
	 remove(bk);
	 GLabel choose1 = new GLabel("CHOOSE");
	 GLabel choose2 = new GLabel("YOUR");
	 GLabel choose3 = new GLabel("CHARACTER");
	 choose1.setFont("SansSerif-80");
	 choose2.setFont("SansSerif-80");
	 choose3.setFont("SansSerif-80");
	choose1.setColor(Color.WHITE);
	choose2.setColor(Color.WHITE);
	choose3.setColor(Color.WHITE);
	 add(choose1, 400-((choose1.getWidth())/2), 100);
	 add(choose2, 400-((choose2.getWidth())/2), 175);
	 add(choose3, 400-((choose3.getWidth())/2), 250);
	 GRect mcBack1 = new GRect(200,250);
	 GRect mcBack2 = new GRect(200,250);
	 mcBack1.setFilled(true);
	 mcBack2.setFilled(true);
	 mcBack1.setColor(Color.WHITE);
	 mcBack2.setColor(Color.WHITE);
      add(mcBack1, 100, 400);   
      add(mcBack2, 500, 400); 
	 GImage mcOpt1 = new GImage("MC.png");
	 GImage mcOpt2 = new GImage("MCBlush.png");
	 mcOpt1.setSize(125, 175);  
	 add(mcOpt1, 140, 440); 
	mcOpt2.setSize(125, 175);
	 add(mcOpt2, 540, 440);  
	 showMessage("New character unlocked!");
	 int chChar = getInt("Would you like to play as \n1. " +name + "\n2. blushing " +name);
	 
	 GImage mc;
	 //set char img
	 if (chChar==1)
	 {
	 	mc = new GImage("MC.png");
	}
	else
	{
		mc = new GImage("MCBlush.png"); 
	}
	

//start screen
	 bk = new GImage("BKTown.png");
	 bk.setSize(800,800);
	 add(bk,0,0);
	 mc.setSize(75, 117);
	 add(mc, 500, 400);
	 GRect backStart= new GRect(285,100);
	 backStart.setColor(Color.BLACK);
	 backStart.setFilled(true);
	 add(backStart, 200,600);
	 GLabel start= new GLabel ("START");
	start.setFont("SansSerif-80");
	start.setColor(Color.WHITE);
	 add(start, 210, 680);
	 	 waitForClick();
    remove(start);
	 remove(backStart);
	 //start
	 GImage rj = new GImage("RJ.png");
	 	rj.setSize(150, 200);
	 	add(rj, 200, 350);
    showMessage("Hello " + name + ". If you recall, in The Adventures of Fieldville LVL 1, you defeated Betty Sue, the evil witch. \nSince then, you have been praised as a savior of Fieldville. The town is throwing a celebration in your honor. \nThe past few days have been rainy, but luckily, today the sun is out. It's a great day in Fieldville and the little town is bustling with people getting ready.");
    int ch1 = getInt("Ranger Joe approaches you. \n'Howdy " + name + ". Are you attending the celebration in your honor? It starts in 2 hours.'\n1) Yes, of course. A whole town is throwing a party just for you. \n2) What? No. Never. I'm an introvert. I'd rather die than go to a party.");
    while (timeSpent==0)
    {
      if (ch1==2)
      {
		remove(mc);
		if (chChar==1)
	 	{
	 		mc = new GImage("MCDead.png");
		}
		else
		{
			mc = new GImage("MCBlushDead.png");  
		}
	 		mc.setSize(117,75);
	 		add(mc, 500,425);
        showMessage("Your wish is granted. You said you'd rather die than go to the party and in this case, you did :) ");
        showMessage("-You Failed. SUFFER.-");
		   pause(500000);
        System.exit(0);
      }
      else
      {
		for(int i = 0; i < 11; i++)
		  {
		  	rj.move(50,0);
			pause(200);
		  }		
		  remove(rj);
		  GImage hh = new GImage("HH.png");
	 		hh.setSize(150, 200);
	 		add(hh, 0, 350);
			for(int i = 0; i < 4; i++)
		  	{
		  	hh.move(50,0);
			pause(200);
		  	}	
			GImage itm = new GImage("ITMDrug.png");
			itm.setSize(50,50);
			add(itm,190,350);
        int ch2 = getInt("'Neato Bandito. I'll see ya 'round, partner'\nRanger Joe leaves. You have time to walk around. You see a hooligan walking around town. He seems like he is definitely on drugs. Do you approach him? \n1) No, of course not. Why would I do that? In LVL 1, if you take drugs from the hooligan, you die. I'm not doing that again. \n2) YES. THAT SOUNDS LIKE THE PERFECT WAY TO WASTE MY TIME. TIME TO DO DRUGS WITH A HOOLIGAN.");
        if (ch2==2)
        {
		  itm.move(85,-20);
				  pause(500);
				  itm.move(90, -10);
				  pause(500);
				  itm.move(100,95);
				  pause(1000);
          showMessage("Great choice. The hoolian offers you drugs and you accept. You just sit and get high with the hooligan for the next 2 hours until the party starts.");
          timeSpent = timeSpent + 1;
        }
        else
        {
		  remove(itm);
		  add(hh, 0, 350);
			for(int i = 0; i < 20; i++)
		  	{
		  	hh.move(50,0);
			pause(200);
		  	}	
			remove(hh);
            bk = new GImage("BKGrass.png");
		      bk.setSize(800,800);
		      add(bk,0,0);
			itm = new GImage("ITMKids.png");
			  itm.setSize(400,180);
				  add(itm,250,400);
				  if (chChar==1)
	 			{
	 				mc = new GImage("MC.png");
				}
				else
				{
					mc = new GImage("MCBlush.png"); 
				}
	 			mc.setSize(75,117);
	 			add(mc, 500,600);
          int ch3 = getInt("You have better things to do than to do drugs with a hooligan. You continue walking. You see a group of kids playing tag. Do you play tag with them? \n1) YES. I love tag. That seems so fun. \n2) No? I'm not a child.");
          if (ch3==1)
          {  showMessage("You ignore it and keep walking. You've spent the past two hours wakling around town.");
                timeSpent = timeSpent + 1;
              }
              else
              {
                showMessage("Spy dude time. you quietly follow behind him. At the end of the alley, he removes the grate from a storm drain and goes down into it. You follow him down into the drain.");
				GStormDrain stormDrain = new GStormDrain();
        		add(stormDrain);
				//storm drain animation 
int localXCoord = 410;
int localYCoord = 610;
add(stormDrain.light, localXCoord, localYCoord);
npc = new GImage("NPCCreep.png");
npc.setSize(75, 100);
add(npc, localXCoord+10, localYCoord-10);
pause(1000);
String code = "wwaawawdddwdw";
//GPoint spyLocation;
for(int p = 0; p < code.length(); p++)
{
		remove(stormDrain.light);
		 if ((code.substring(p,p+1)).equals("w"))
        {
				localYCoord -= 100;
				add(stormDrain.light, localXCoord, localYCoord);
				add(npc, localXCoord+10, localYCoord-10);
        }
			else if ((code.substring(p,p+1)).equals("a"))
        	{
         			localXCoord -= 100;
					add(stormDrain.light, localXCoord, localYCoord);
					add(npc, localXCoord+10, localYCoord-10);
        	}
			else if ((code.substring(p,p+1)).equals("d"))
        	{
         			localXCoord += 100;
					add(stormDrain.light, localXCoord, localYCoord);
					add(npc, localXCoord+10, localYCoord-10);
        	}
			else
			{}
		 	
			pause(1000);
	}
				//spyLocation = new GPoint(npc.getLocation());
				//end storm drain animation
				showMessage("Follow the creep");
				if (chChar==1)
	 			{
	 				mc = new GImage("MC.png");
				}
				else
				{
					mc = new GImage("MCBlush.png"); 
				}
	 			mc.setSize(70,110);
	 			localXCoord = 410;
				localYCoord = 610;
				remove(npc);
				add(mc, localXCoord+10, localYCoord-10);
				addKeyListeners(new KeyStrokes(mc, code));
			
				
//					for(int n = 0; n< code.length() - 1 ; n++)
//					{
//						//get key 
//						
//							if (code.substring(n, n+1).equals(KeyStrokes.getPressed()) && KeyStrokes.getPressed().equals("w"))
//       					 {
//								//mc.move(0,-100);
//								showMessage("moved up");
//								passLevel++;
//								
//       					 }
//							else if (code.substring(n, n+1).equals(KeyStrokes.getPressed()) && KeyStrokes.getPressed().equals("a"))
//        					{
//         							//mc.move(-100, 0);
//								showMessage("moved left");
//         							passLevel++;
//        					}
//							else if (code.substring(n, n+1).equals(KeyStrokes.getPressed()) && KeyStrokes.getPressed().equals("d"))
//        					{
//         							//mc.move(100, 0);
//								showMessage("moved right");
//         							passLevel++;
//        					}
//						
//
//					}
			
				//follow game
				while(mc.getLocation().getY() > 100) //this is not working..... 
				{
					pause(100);
				}
				bk = new GImage("BKStormdrain.png");
	 				bk.setSize(800,800);
	 				add(bk,0,0);
					if (chChar==1)
	 			{
	 				mc = new GImage("MC.png");
				}
				else
				{
					mc = new GImage("MCBlush.png"); 
				}
				mc.setSize(75, 117);
				 add(mc, 650, 550);
				 //creep
					npc = new GImage("NPCCreep.png");
			 		npc.setSize(140, 200);
	 				add(npc, 450, 500);
					itm = new GImage("ITMBomb.png");
				  itm.setSize(40,45);
				  add(itm,450,640);
				int ch6 = getInt("He sits down and takes a bomb out of his coat pocket. He looks like he is setting the bomb. Do you try to stop him or not? \n1) I try to stop him! I can't just let him blow up the town!!! \n2) Eh. It'll be fine. ");
                if (ch6==2)
                {
					 bk = new GImage("BKTownParty.png");
	 				bk.setSize(800,800);
	 				add(bk,0,0);
                  showMessage("You ignore the guy with the bomb, climb out of the storm drain, and continue on with your day. ");
                  timeSpent = timeSpent + 1;
                }
                else
                {
					 remove(npc);
					 npc = new GImage("NPCCreepDead.png");
			 		npc.setSize(200, 140);
	 				add(npc, 450, 600);
					 //BOMB DOWN RIVER ANIMATION
					 itm.setLocation(150,550);
					 showMessage("You tackle the guy with the bomb and wrestle it out of his grasp. You throw the bomb into the running water behind you in the storm drain. \nLuckliy, since the previous days were rainy, the water in the storm drain carries the bomb out of the town and into the nearby river. \nYou watch the bomb float away and you turn back to the guy and beat him up. You leave him half alive and bleeding in the storm drain.\nYou climb out of the hole. You have a party to get to.");
                  timeSpent = timeSpent+1;
                  win = win +1;
                }
                
			
			
              }
            }
          }
        }
      }
    }
	 bk = new GImage("BKTownParty.png");
	 				bk.setSize(800,800);
	 				add(bk,0,0);
	 rj = new GImage("RJ.png");
	 	rj.setSize(150, 200);
	 	add(rj, 250, 250);
		remove(mc);
		if (chChar==1)
	 			{
	 				mc = new GImage("MC.png");
				}
				else
				{
					mc = new GImage("MCBlush.png");
				}
	 			mc.setSize(75,117);
				 add(mc, 450, 320);
    if (win == 0)
    {
	
      showMessage("The party is starting now. You see Ranger Joe standing in front of everyone, ready to talk to them. \n'Ladies and Getleman. I'd like to introduce you to my good pal " + name + "'. \nThe crowd applauses as you walk into the town square and stand next to Ranger Joe. You open your mouth to speak and--");
        pause(2000);
		GImage bk2 = new GImage("ITMExplosion.png");
	 				bk2.setSize(800,800);
	 				add(bk2,0,0);
		showMessage("*BOOM*");
		showMessage("A bomb goes off in town and all of you die. You made the wrong decision in the past and wasted your time. Re-play to prevent the bomber from striking again.");
      showMessage("-You Failed. SUFFER.-");
		 pause(500000);
    }
    else
    {
      showMessage("The party is starting now. You see Ranger Joe standing in front of everyone, ready to talk to them. \n'Ladies and Getleman. I'd like to introduce you to my good pal " + name + "'. \nThe crowd applauses as you walk into the town square and stand next to Ranger Joe. The town celebrates all day and night. You have a swell time. ");
      showMessage("Congratulations. You won the game. Adventures In Fieldville LVL 3 coming soon. ");
		 pause(500000);
    }
  }
  
  public static void main (String args[])
 {
 	new TAIFlvl2().start(args);
 }
 
 
 //METHODS FOR ACM

public static int random(int n)
    {
        return (int)(Math.random()*n) + 1;
    }

    //returns a random number between a and b
    public static int random(int a, int b)
    {
        int c = Math.abs(b-a);
        return (int)(Math.random()*c) + a + 1;
    }

    //Returns a string value input by the user
    public  String getString(String userInput)
    {
        String input = JOptionPane.showInputDialog(userInput);
        return input;
    }

    //Returns an int value input by the user
    public  int getInt(String userInput)
    {
        String input = JOptionPane.showInputDialog(userInput);
        return Integer.parseInt(input);
    }

    //Returns a double value input by the user that will be
    //used in the program
    public  double getDouble(String userInput)
    {
        String input = JOptionPane.showInputDialog(userInput);
        return Double.parseDouble(input);
    }

    //displays output
    public static void showMessage(String message )
    {
        JOptionPane.showMessageDialog(null, message, "Results",
                                      JOptionPane.PLAIN_MESSAGE );
    }

    //Rounds a double value to p places after the decimal.
    static double round(double x, double p)
    {
        p = Math.pow(10,p);
        double y;
        y = Math.floor(x*p+0.5)/p;
        return y;
    }

}