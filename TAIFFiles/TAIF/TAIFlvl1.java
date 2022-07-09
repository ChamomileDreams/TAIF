import java.util.Scanner;
import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import javax.swing.JOptionPane;
public class TAIFlvl1  extends GraphicsProgram{

	public static final int APPLICATION_WIDTH = 800;  // x size of window
	public static final int APPLICATION_HEIGHT = 800; // y size of window
//main code
  public void run() {
 	//add scanner
    Scanner scan = new Scanner(System.in);
	 //declare variable
    int bettySue = 0;
	 
	 //dec 1 pic
	 GImage bk = new GImage("BKField.png");
	 bk.setSize(800,800);
	 add(bk,0,0);
	 GImage mc = new GImage("MC.png");
	 mc.setSize(75, 117);
	 add(mc, 450, 350);
	 /*GRect backTitle= new GRect(700,75);
	 backTitle.setColor(Color.BLACK);
	 backTitle.setFilled(true);
	 add(backTitle, 50, 100);
	 GLabel title= new GLabel ("The Adventures In Fieldville LVL 1");
	title.setFont("SansSerif-40");
	 title.setColor(Color.WHITE);
	 add(title, 50, 100);*/
	 GRect backStart= new GRect(285,100);
	 backStart.setColor(Color.BLACK);
	 backStart.setFilled(true);
	 add(backStart, 200,600);
	 GLabel start= new GLabel ("START");
	start.setFont("SansSerif-80");
	start.setColor(Color.WHITE);
	 add(start, 210, 680);
	 
	 waitForClick();
	 //intro
     showMessage("Welcome to The Adventures In Fieldville LVL 1.  ");
     String name = getString("What is your name?");
    showMessage("Hello " + name + ".");
    while (bettySue==0)
    {
	 //
	//wake
      int ch1 = getInt("You wake up in a field of wheat. You look around. You don't recall ever being here in your life. You see a village in the distance. Would you like to \n1) Investigate the village. \n2) Go back to sleep in the field");
      if (ch1==2)
      {
		bk = new GImage("BKFieldFire.png");
		bk.setSize(800,800);
		add(bk,0,0);
		mc = new GImage("MCFire.png");
	 	mc.setSize(200,200);
	 	add(mc, 425, 350);
        showMessage("I see you chose the lazy route. You go back to sleep. A wildfire starts in the brittle, dry field and you burn alive in your sleep.");
        showMessage("-You Failed. SUFFER.-");
		 pause(500000);
		 System.exit(0);
      }
      else
      {
		bk = new GImage("BKTown.png");
		bk.setSize(800,800);
		add(bk,0,0);
	 	add(mc, 500, 400);
		GImage rj = new GImage("RJ.png");
	 	rj.setSize(150, 200);
	 	add(rj, 200, 350);
        int ch2 = getInt("You walk through the field and stumble into town. A man approaches you. \n'Howdy stranger. I haven't seen you around these parts. What is your name?' \n Do you \n1) Say your name. \n2) Run away.");
        if (ch2==2)
        {
			bk = new GImage("BKCliff.png");
			bk.setSize(800,800);
			add(bk,0,0);
			GImage mc2 = new GImage("MCFallC.png");
	 			mc2.setSize(90, 200);
	 			add(mc2, 435,450);
				pause(1000);
				
			showMessage("You run aimlessly into the village. The man starts chasing you and you run a few blocks. You look back to see if he is still chasing you. \nDue to you looking back, you did not see the cliff in front of you and you fall off and die.");
          	showMessage("-You Failed. SUFFER.-");
			//fall animation
			for(int i = 0; i < 5; i++)
		  	{
			remove(mc2);
				GImage mc1 = new GImage("MCFallL.png");
	 			mc1.setSize(100, 200);
	 			add(mc1, 425,400);
				pause(1000);
				remove(mc1);
				 mc2 = new GImage("MCFallC.png");
	 			mc2.setSize(90, 200);
	 			add(mc2, 435,450);
				pause(1000);
				remove(mc2);
				GImage mc3 = new GImage("MCFallR.png");
	 			mc3.setSize(102, 200);
	 			add(mc3, 435,500);
				pause(1000);
				remove(mc3);
				GImage mc4 = new GImage("MCFallC.png");
	 			mc4.setSize(90, 200);
	 			add(mc4, 435,550);
				pause(1000);
				remove(mc4);
			}
			System.exit(0);
        }
        else
        {
          showMessage("'Hello " + name + ". Welcome to Fieldville. I am Ranger Joe. I live at the little red house in the town square. \nIf you need a hand, don't be afraid to ask. YEEHAW!! TIME TO CATCH ME SOME CRAWDADS.' ");
   	pause(1000);
		for(int i = 0; i < 11; i++)
		  {
		  	rj.move(50,0);
			pause(200);
		  }		
		  remove(rj);
			int ch3 = getInt("Ranger Joe walks away. You look around and see an old woman selling fresh produce at a little shop. Do you \n1) Approach the old woman selling produce \n2) Continue Walking around town.");      
          if (ch3==1) 
          {
            bettySue = bettySue + 1;
          }
          else
          {
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
            int ch5 = getInt("You walk around and see a man tip toeing around like he is up to no good. He seems to think you don't see him, but you obviously do. Do you \n1) Approach this suspicious hooligan. \n2) Walk away. It seems like a bad idea ");
            if (ch5==2)
            {
			    remove(hh);
				 remove(itm);
             int ch7 = getInt("You don't find anything else interesting around town. Do you \n1) Talk to the old lady \n2) Vist Ranger Joe");
              if(ch7==1)
                {
                  bettySue = bettySue + 1;
                }
              else
              {
				  bk = new GImage("BKRJHouse.png");
				bk.setSize(800,800);
				add(bk,0,0);
				mc = new GImage("MC.png");
	 		mc.setSize(125, 175);
	 		add(mc, 600, 500);
			itm = new GImage("ITMPaper.png");
				itm.setSize(100,50);
				add(itm, 200, 700);
                showMessage("Bored, you decide to find Ranger Joe. You recall that he told you his house was the red one at the town square. The town is small and the square is easy to find. \nStanding in the center of the square, you see 4 old stone houses, 5 multicolored wood houses(none red) and single red brick house. Its pretty safe to assume it is Ranger Joe's. You approach the house. ");
				int ch9 = getInt("Do you \n1) Walk right in. \n2) Knock first. You aren't a heathen. ");
                if(ch9==1)
                {
					 remove(mc);
				mc = new GImage("MCDead.png");
	 		mc.setSize(234,150);
	 		add(mc, 425, 500);
                  showMessage("You failed to consider Ranger Joe's past. He is a kind man but he has severe trust issues due to some situations with his ex wife, Bethany Ann. \nFearing the worst and wanting to keep himself safe, he installed  booby traps in his house and the second you walk in, you are shot by a deadly poinsonous arrow. ");
                  showMessage("-You Failed. SUFFER.-");
				pause(500000);
				System.exit(0);
                }
                else
                {
                  showMessage("You knock. There is no answer. You knock again. There is no answer. You look down and see a note on the ground that seems to have fallen off the door. \nIt reads 'I'M OUT TO CATCH ME SOME CRAWDADS. I WILL BE BACK AT 4PM. YEEEEHAWW.' Right then, you hear the clock in the town square chime behind you, bringing to your attention the fact that it is 2PM.");
                  int ch10 = getInt("You you have extra time before he gets back. Do you \n1) talk to the old lady. \n2) TALK TO THE OLD LADY GOSH DARN IT. SHE'S LONELY. ");
                  if (ch10<4)
                  {
                    bettySue = bettySue + 1;
                  }
                }
              }
            }
            else
            {
              int ch6 = getInt("The man offers you 'Magic in a jar that will grant you the secrets of the universe'. Do you \n1) Take the drugs. \n2) Walk away. Drugs are bad. ");
              if (ch6==1)
              {
				  itm.move(79,-20);
				  pause(500);
				  itm.move(78, -10);
				  pause(500);
				  itm.move(78,80);
				  pause(3000);
				  remove(mc);
				  mc = new GImage("MCPoison.png");
	 			mc.setSize(90, 150);
	 			add(mc, 425,350);
				mc.sendBackward();
				pause(2000);
				remove(mc);
				remove(itm);
				mc = new GImage("MCPoisonDead.png");
	 			mc.setSize(150, 90);
	 			add(mc, 425,450);
                showMessage("The man was right. You have unlocked the secrets of the universe. In this case, the secret is what happens after death. You died.");
                showMessage("-You Failed. SUFFER.-");
				pause(500000);
				System.exit(0);
              }
              else
              {
				  remove(hh);
				 remove(itm);
                int ch7 = getInt("You don't find anything else interesting around town. Do you \n1) Talk to the old lady. \n2) Vist Ranger Joe.");
                if(ch7==1)
                {
                  bettySue = bettySue + 1;
                }
                else
                {
				   bk = new GImage("BKRJHouse.png");
				bk.setSize(800,800);
				add(bk,0,0);
				mc = new GImage("MC.png");
	 			mc.setSize(125, 175);
	 			add(mc, 600,500);
				itm = new GImage("ITMPaper.png");
				itm.setSize(100,50);
				add(itm, 200, 700);
                 showMessage("Bored, you decide to find Ranger Joe. You recall that he told you his house was the red one at the town square. The town is small and the square is easy to find. \nStanding in the center of the square, you see 4 old stone houses, 5 multicolored wood houses(none red) and single red brick house. Its pretty safe to assume it is Ranger Joe's. You approach the house. ");
				int ch9 = getInt("Do you \n1) Walk right in. \n2) Knock first. You aren't a heathen. ");
                  if(ch9==1)
                  {
						remove(mc);
				mc = new GImage("MCDead.png");
	 		mc.setSize(234,150);
	 		add(mc, 425, 500);
                    showMessage("You failed to consider Ranger Joe's past. He is a kind man but he has severe trust issues due to some situations woth his ex wife, Bethany Ann. \nFearing the worst and wanting to keep himself safe, he installed  booby traps in his house and the second you walk in, you are shot by a deadly poinsonous arrow. ");
                    showMessage("-You Failed. SUFFER.-");
                    pause(500000);
				System.exit(0);
                  }
                  else
                  {
                    showMessage("You knock. There is no answer. You knock again. There is no answer. You look down and see a note on the ground that seems to have fallen off the door. \nIt reads 'I'M OUT TO CATCH ME SOME CRAWDADS. I WILL BE BACK AT 4PM. YEEEEHAWW.' Right then, you hear the clock in the town square chime behind you, bringing to your attention the fact that it is 2PM.");
                    int ch10 = getInt("You you have extra time before he gets back. Do you \n1) talk to the old lady. \n2) TALK TO THE OLD LADY GOSH DARN IT. SHE'S LONELY. ");
                    if (ch10<4)
                    {
                      bettySue = bettySue + 1;
                    }
                  }
                }
              }
            }
          }
        } 
      }
    }
	 bk = new GImage("BKTownBSShop.png");
	bk.setSize(800,800);
	add(bk,0,0);
	 GImage bs = new GImage("BS.png");
	 bs.setSize(150, 300);
	 add(bs, 150, 360);
	 mc = new GImage("MC.png");
	 mc.setSize(125, 175);
	 add(mc, 600,500);
    int ch4 = getInt("'Hello darlin'. My name is Betty Sue. Would you like to buy some fresh produce?' \nWould you like to \n1) Say 'Sorry, I don't have any money' and continue roaming the town.\n2) Steal some fruit and run\n3)Tell Betty Sue that you don't have any money but you are willing to do a favor for her.");
    if (ch4==2)
    {
	 remove(bs);
	 remove(mc);
	 bs = new GImage("BSGun.png");
	 bs.setSize(190, 300);
	 add(bs, 200, 350);
	 mc = new GImage("MCDead.png");
	 		mc.setSize(234,150);
	 		add(mc, 425, 500);
      showMessage("'HEY! THAT'S MY FRUIT' yells Betty Sue. Betty Sue pulls a pistol out of her skirt and shoots you as you run with the produce. Her aim is dead on and she kills you. ");
      showMessage("-You Failed. SUFFER.-");
		pause(500000);
      System.exit(0);
    }
    else if (ch4==1)
    {
	 bk = new GImage("BKTown.png");
		bk.setSize(800,800);
		add(bk,0,0);
	 remove(mc);
	 remove(bs);
	mc = new GImage("MCDead.png");
	 		mc.setSize(234,150);
	 		add(mc, 425, 350);
      showMessage("Without Betty Sue's fresh, nourishing produce, you waste away and die.");
      showMessage("-You Failed. SUFFER.-");
		pause(500000);
      System.exit(0);
    }
    else
    {
      GImage itm = new GImage("ITMCookie.png");
	itm.setSize(50,40);
		add(itm,500,430);
      showMessage("'Oh sure, sugar. I been meaning to deliver these...cookies to Ranger Joe and ask him for some of his crawdads.' \nShe hands you a basket and a cookie. \n'Here ya go darlin'. You can eat the cookie. Do not open the basket. Tell Ranger Joe to fill the basket with crawdads and send it back to me.'");
      int ch11 = getInt("Do you \n1) Go to Ranger Joe's. \n2) Thank her, tell her you are starving, and eat the cookie in front of her. \n3) Go into an alley and open the basket. She hesitated and you think it's suspicious. \n4) Refuse to go, push her to the ground, and call her a witch. ");
      if (ch11==1)
      {
		bk = new GImage("BKRJHouse.png");
				bk.setSize(800,800);
				add(bk,0,0);
	 mc = new GImage("MCBlowUp.png");
	 	mc.setSize(300, 315);
	 	add(mc, 425,400);
		GImage rj = new GImage("RJBlowUp.png");
	 		rj.setSize(300, 350);
	 		add(rj, 200, 400);
       showMessage("You arrive at Ranger Joe's. \n'I knew you'd be a big help 'round here. Thank you kindly.' \nRanger Joe opens the basket. The basket explodes, killing you and Ranger Joe. Betty Sue was an evil witch disguised as a nice old lady. ");
        showMessage("-You Failed. SUFFER.-");
		  pause(500000);
        System.exit(0);
      }
      else if (ch11==2)
      {
		pause(2000);
		remove(mc);
		  mc = new GImage("MCPoison.png");
	 		mc.setSize(200, 300);
	 		add(mc, 425, 500);
			mc.sendBackward();
			pause(2000);
			remove(mc);
			mc = new GImage("MCPoisonDead.png");
	 		mc.setSize(300, 200);
	 		add(mc, 425,600);
        showMessage("She offers you a crate to sit on and you accept. As you ravenously devour the cookie, you feel your breathing slow. The cookie was poisoned. Betty Sue was an evil witch disguised as a nice old lady.");
        showMessage("-You Failed. SUFFER.-");
		  pause(500000);
        System.exit(0);
      }
      else if (ch11==3)
      {
		bk = new GImage("BKTown.png");
				bk.setSize(800,800);
				add(bk,0,0);
			mc = new GImage("MCBlowUp.png");
	 	mc.setSize(300, 315);
	 	add(mc, 425,400);
        showMessage("You have a bad feeling about this whole situation. There is something off about little old Betty Sue. Dispite her sweet appearance, you can sense soemthing more sinister lying deep within her soul. \nYou curiously open the basket meant for Ranger Joe. *BOOM* The basket explodes leaving you dead in an alley.");
        showMessage("-You Failed. SUFFER.-");
		  pause(500000);
        System.exit(0);
      }
      else
      {
        remove(bs);
		bs = new GImage("BSDead.png");
	 bs.setSize(300, 150);
	 add(bs, 150, 600);
	 pause(2000);
	remove(bs);
	 bs = new GImage("BSDemon.png");
	 bs.setSize(300, 150);
	 add(bs, 150, 600);
        showMessage("You push Betty Sue's frail body to the ground. She dies and you see her form shift into that of a demon. You never liked stupid Betty Sue anyway. You just saved this corrupted town from the hands of the devil. You are praised in the town as a mighty savior. ");
        showMessage("Congratulations. You won the game. Thank you for playing The Adventures In Fieldville LVL 1. The Adventures In Fieldville LVL 2 is coming soon. ");
      }
    }
  }
 
 public static void main (String args[])
 {
 	new TAIFlvl1().start(args);
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


