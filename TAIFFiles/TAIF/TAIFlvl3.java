//import java.util.Scanner;
//import acm.program.*;
//import acm.graphics.*;
//import java.awt.*;
//import javax.swing.JOptionPane;
//public class TAIFlvl3 extends GraphicsProgram {
//	public static final int APPLICATION_WIDTH = 800;  // x size of window
//	public static final int APPLICATION_HEIGHT = 800; // y size of window
//
//  public void run() {
//  	//add scanner
//    Scanner scan = new Scanner(System.in);
//	 
//	 //declare variables
//    int timeSpent = 0;
//    int win = 0;
//	 
//	 //name?
//	  GRect newCharScreen = new GRect(800,800);
//	 add(newCharScreen,0,0);
//	 newCharScreen.setFilled(true);
//	 newCharScreen.setColor(Color.BLACK);
//	 String name = getString("Welcome to The Adventures In Fieldville LVL 3. What is your name? ");
//	 
//	 //choose your character
//	 GLabel choose1 = new GLabel("CHOOSE");
//	 GLabel choose2 = new GLabel("YOUR");
//	 GLabel choose3 = new GLabel("CHARACTER");
//	 choose1.setFont("SansSerif-80");
//	 choose2.setFont("SansSerif-80");
//	 choose3.setFont("SansSerif-80");
//	choose1.setColor(Color.WHITE);
//	choose2.setColor(Color.WHITE);
//	choose3.setColor(Color.WHITE);
//	 add(choose1, 400-((choose1.getWidth())/2), 100);
//	 add(choose2, 400-((choose2.getWidth())/2), 175);
//	 add(choose3, 400-((choose3.getWidth())/2), 250);
//	 GRect mcBack1 = new GRect(200,250);
//	 GRect mcBack2 = new GRect(200,250);
//     GRect mcBack3 = new GRect(200,250);
//	 mcBack1.setFilled(true);
//	 mcBack2.setFilled(true);
//     mcBack3.setFilled(true);
//	 mcBack1.setColor(Color.WHITE);
//	 mcBack2.setColor(Color.WHITE);
//     mcBack3.setColor(Color.WHITE);
//      add(mcBack1, 100, 400);   
//      add(mcBack2, 500, 400); //CHANGE LOCATIONS
//      add(mcBack3, 700, 400);
//	 GImage mcOpt1 = new GImage("MC.png");
//	 GImage mcOpt2 = new GImage("MCBlush.png");
//      GImage mcOpt3 = new GImage("MCCowboy.png");
//	 mcOpt1.setSize(125, 175);  
//	 add(mcOpt1, 140, 440); 
//	mcOpt2.setSize(125, 175);
//	 add(mcOpt2, 540, 440);        //CHANGE ALL VALUES
//      mcOpt2.setSize(125, 175);
//	 add(mcOpt2, 540, 440);  
//	 showMessage("New character unlocked!");
//	 int chChar = getInt("Would you like to play as \n1. " +name + "\n2. Blushing " +name + "\n3. Cowboy" + name);
//	 
//	 GImage mc;
//	 //set char img
//	 if (chChar==1)
//	 {
//	 	mc = new GImage("MC.png");
//	}
//	else if (chChar==2)
//	{
//		mc = new GImage("MCBlush.png"); 
//	}
//      else
//      {
//          mc = new GImage("MCCowboy.png"); //ADD COWBOY CHARACTER
//
////start screen
//	 GImage bk = new GImage("BKMCHouse.png"); //ADD MAIN CHARACTER'S HOUSE
//	 bk.setSize(800,800);
//	 add(bk,0,0);
//	 mc.setSize(75, 117);
//	 add(mc, 500, 400);
//	 GRect backStart= new GRect(285,100);
//	 backStart.setColor(Color.BLACK);
//	 backStart.setFilled(true);
//	 add(backStart, 200,600);
//	 GLabel start= new GLabel ("START");
//	start.setFont("SansSerif-80");
//	start.setColor(Color.WHITE);
//	 add(start, 210, 680);
//	 	 waitForClick();
//    remove(start);
//	 remove(backStart);
//	 //start
//		
//	//declare variables
//    String opt = "1) Harry the Hooligan \n2) John Jr.(Lil' Johnny) \n3)Martha \n4)Bethany Ann \n5)Ronny the rooster";
//    boolean TFOne = false;
//    boolean TFTwo = false;
//    boolean TFThree = false;
//    boolean TFFour = false;
//    boolean TFFive = false;
//    int optOne = 0;
//    int optTwo = 0;
//    int optThree = 0;
//    int optFour = 0;
//    int optFive = 0;
//	 
//    showMessage("Hello " + name + ". If you recall, in The Adventures of Fieldville LVL 2, you defeated the evil bomber who was preparing to blow up the whole town during a celebration in your honor. Since then, the town has been cleaned up and returned to it's regular slow pace. You were given a quaint, yellow, southern-style house to live in in the town square, next to Ranger Joe's.");
//	 //RANGER JOE WALKS UP
//	 int ch1 = getInt("'Howdy " + name + ". I'm afraid since you arrived, there's been no rest in our humble little town. This mornin' old Uncle John was found murdered in his home. I would like your help finding the murderer'\n1) Sure. Tell me more. \n2) Nah I think I want a break today.");
//    if (ch1 == 2)
//    {
//      showMessage("Congratulations. You won the game. Adventures In Fieldville LVL 4 coming soon. ");
//      pause(4000);
//		//ADD MC DEAD
//      showMessage("Ha. You thought you won? I'm not going to let you get away THAT easily. Now quit being a lazy bum and re run the program.");
//    }
//    else
//    {
//	 //BK CRIME SCENE
//      showMessage("Ranger Joe leads you to the crime scene: Uncle John's house. He was found in his conservatory with a kitchen knife in his back. There was no sign of forced entry in the house and the door to the conservatory was closed but the window on the other side of the room was unlocked allowing anyone to come in.");
//      while (TFOne==false||TFTwo==false||TFThree==false||TFFour==false||TFFive==false)
//      {
//		//SUSPECT THOUGHT BUBBLE
//        int ch2 = getInt("'Cool beans! Right now there are 5 main suspects. First there is Harry the hooligan. You may have met him before in LVL 1 or 2. He's the crazy guy that keeps offering you drugs. John Jr., also known as lil' Johnny, is Uncle John's son. Then there's Martha. She is Uncle John's maid. There's also...Bethany Ann...my ex wife. After we divorced, she married Uncle John. Lastly, there's Ronny the rooster. He may just be a chicken but I swear, he's up to something. Is there anyone you want to know more about? \n1) Harry the Hooligan \n2) John Jr. \n3) Martha \n4) Bethany Ann \n5) Ronny the Rooster");
//        if (ch2 ==1 )
//        {
//          showMessage("'No one knows much about Harry. The man is crazy. The lot of us just call 'em a Hooligan. No one knows how he got here or how long he's been here. No one pays much attention to him. He hasn't changed a bit in the past few decades. The only fella in town that might know where he came from is Deryl. Feels like the old man has been here since the founding of the town. Usually you can find him gettin a beer at the pub.'");
//          //harry walks in now with drugs
//          int ch3 = getInt("'Look, there's the nut case now. Go talk to him. Be careful. He's insane' \n1) Go talk to him. \n2) I know all I need to know about him. ");
//          if(ch3==2)
//          {
//            showMessage("You ask Ranger Joe about the other suspects.");
//            TFOne = true;
//          }
//          else
//          {
//            int ch4 = getInt("'YEUGH YAh haaAA a EEEEEe DA.' \nHarry the Hooligan is yelling at the air. You get a closer look at him. He is older, probably in his late 40s but due to addiction he looks like he's 20 years older. Hes wearing a tattered green shirt with dirt smudged on his face. He looks like he wouldn't be afraid to get his hands dirty. Whether the killing was an accident, someone hired him to do it, or he had a greater motive, he looks capeable of the task. You ask him if you can sit and talk to him for a bit. He nods and sits down criss cross applesauce, rocking back and forth. \n1) Immediately interrogate him about the murder. \n2) Get to know him a bit. Gain his trust.");
//            if(ch4==1)
//            {
//              showMessage("You say 'I'm here with the police. You are a suspect in the murder of Uncle John. What do you have to say for yourself?'
//				int ch5 = getInt("'HabAdAAbada. EEEEEEEE.' Harry says. You scared him. He gets up and runs. do you chase him?\n1) I chase him \n2) I have enough information. There's no use in chasing him.");
//              if(ch5==2)
//              {
//                showMessage("You go back to Ranger Joe and tell him that you ask him for a recap on the suspects and more information. ");
//                TFOne = true;
//              }
//              else
//              {
//                int ch6 = getInt("You try to chase him through alleys and you are fast be he is faster. You're still fairly new to town and he has been here since evryone can remember. He got away. Do you have enough information? \n1) I have enough information. I know what I need to know about Harry. \n2) I want to ask someone else. I go look for Deryl");
//                if(ch6==1)
//                {
//                  showMessage("You figure you have enough information on Harry and go back to Ranger Joe in search of more clues on the other suspects.");
//                  TFOne = true;
//                }
//                else
//                {
//                  int ch7 = getInt("You go to the pub in search of Deryl. Surely enough you find him at the bar. He's so old. He looks like he dies ceturies ago. \n'Hey! Deryl? Do you have any information about Harry the Hooligan?' \nHe turns to face you'EH?' \n1) Say nevermind and walk away. \n2) 'HELLO DERYL. DO YOU KNOW ANYTHING ABOUT HARRY THE HOOLIGAN?'");
//                  if (ch7==1)
//                  {
//                    showMessage("You can't figure out anything better to do and go back to Ranger Joe for more information on other suspects.");
//                    TFOne = true;
//                  }
//                  else
//                  {
//                    showMessage("'HARRY? I COULDN'T TELL YOU ANYTHING ABOUT THE LITTLE TROUBLEMAKER.'\nYou go back to Ranger Joe. You got all the information you could about Harry the Hooligan");
//                    TFOne = true;
//                  }
//                }
//              }
//            }
//            else
//            {
//              int ch8 = getInt("'Yo Harry. Wassup dude? How are you?' \nHarry turns and looks at you confused. 'Why are you talking to me?' \n1) Come clean. \n2) Tell him you wanted to be his friend. ");
//              if (ch8==1)
//              {
//                showMessage("'HOO BA DA BA DA.' Harry runs away.");
//                int ch6 = getInt("You try to chase him through alleys and you are fast be he is faster. You're still fairly new to town and he has been here since evryone can remember. He got away. Do you have enough information? \n1) I have enough information. I know what I need to know about Harry. \n2) I want to ask someone else. I go look for Deryl");
//                if(ch6==1)
//                {
//                  showMessage("You decide you have enough information on Harry the Hooligan and go back to Ranger Joe in search of clues on the other suspects.");
//                  TFOne = true;
//                }
//                else
//                {
//                  int ch7 = getInt("You go to the pub in search of Deryl. Surely enough you find him at the bar. He's so old. He looks like he dies ceturies ago. \n'Hey! Deryl? Do you have any information about Harry the Hooligan?' \nHe turns to face you'EH?' \n1) Say nevermind and walk away. \n2) 'HELLO DERYL. DO YOU KNOW ANYTHING ABOUT HARRY THE HOOLIGAN?'");
//                  if (ch7==1)
//                  {
//                  showMessage("You decide you have enough information on Harry anyway and go back to Ranger Joe in search of clues on the other suspects.");
//                    TFOne = true;
//                  }
//                  else
//                  {
//                    showMessage("'HARRY? I COULDN'T TELL YOU ANYTHING ABOUT THE LITTLE TROUBLEMAKER.'\nYou go back to Ranger Joe. You got all the information you could about Harry the Hooligan");
//                    TFOne = true;
//                  }
//                }
//              }
//              showMessage("'Really? Ever since I got here, no one wanted to be my friend.' \nYou and Harry chat for a few hours. He tells you his past. You can tell he's lonely. Druing the conversation he tells you that he isn't a drug addict and that its all a ploy. He carries around real drugs but never actually takes them himself. He said his real name is Harry Twiddlesworth the third and that he is the prince of Pickletown in a neighboring village. He says that he ran away from an arranged marriage between him and a girl he didn't want to marry from another kingdom. He is actually 24. He disguises himself as a drug addict to prevent people from realizing the truth. He also admits that he has a crush on lil' Johnny but he knows it will never work beacause he has to hide his identity. He seems very sincere, he just never got the chance to tell anyone before then. He tells you that you can't tell anyone his secret and thanks you for listening. Is this just a big elaborate cover up story? Is what he has told you just a result of the copius amount of drugs he has taken? Was he hired to murder Uncle John? Was it just a big accident from when Harry wasn't in his right mind? Is he completely innocent and telling the truth?\nYou've discovered all you can about Harry the Hooligan. You go back to Ranger Joe to consult him about the other suspects. ");
//              TFOne = true;
//            }
//          }
//        }
//        else if(ch2==2)
//        {
//          int ch8 = getInt("'Ah yes. John Jr...or 'lil Johnny as some call him. He is Uncle John's stepson and a spoiled little brat. He was planning on moving out of this small town and out into the world. His mother died at a young age. He his currently 23. He is a bit of a ruffian, that boy. Rumor has it, he often associates with Harry the Hooligan and they do their little drugs together or somethin'. He could have definitely been told that his illegal actions will lead to Uncle John taking him out of the will. Then 'lil johnny kills him before the will is changed to secure his position, get money, and move out. That's my theory at least. Here is his address'.\nHe slips you a piece of paper with an address on it.\n1) I want to go talk to him.\n2) I have enough information.");
//          if (ch8==2)
//          {
//            showMessage("You tell Ranger Joe you have enough information on John Jr. and you ask him to recap the suspects.");
//            TFTwo = true;
//          }
//          else
//          {
//            showMessage("You follow the directions on the slip of paper to the address. It leads you to a large masion in the outskirts of town. It's not the biggest builing in town, only second to his parent's place. You go up to the door and knock. After another attempt at knocking on the door, you are about to leave when you hear the door beginning to unlock.");
//			int ch9 = getInt("'Sup dude. What are you doin' here little man?'\n1) 'Yo bro. I was wondering if you wanted to chill, homie'\n2) Say you are here to talk about the murder of his stepdad ");
//            if(ch9==1)
//            {
//              int ch10 = getInt("'Oh man. I'm down.' \n'Lil John opens the door and lets you in. He leads you to his living room. You sit down on a soft, nice couch. \n'So, dude. What's your name?' \n1)Say your name \n2) Say 'You don't need to know that.'");
//              if (ch10==1)
//              {
//                showMessage("'For sure, my dude. My name is " + name + ".'\n");
//              }
//              else
//              {
//                showMessage("'Aight dude. That's a little sus but I get it'");
//              }
//              showMessage("You guys begin to chat and have a steady conversation. Eventually he brings up that fact that his stepdad died very recently. He doesn't seem too bothered. He seems like he couldn't care less. He does admit that he occasionally does drugs with Harry the Hooligan but that he doesn't know him well or talk to him much. He also tells you about the fact that he wants to move to the big city and be a movie star but he can't yet because he doesn't have the finances. Overall, he doesn't give you much information. Did he go as far so to murder his own step father or is he just indifferent to the situation? Did he hire someone else do it? Is he desprate enough to follow his dream that he would murder his family fo the inheritance?");
//              shoeMessage("You got all the information you could on John Jr. and go back to Ranger Joe in search of clues on the other suspects.");
//              TFTwo = true;
//            }
//            else
//            {
//              showMessage("'I am here to talk about the murder of your stepdad' you say\nJohn Jr. looks uncomfortable. He says 'I don't know what to tell you dude. My old man just kicked the bucket. My step mom found him in his kitchen with a knife in his back. a pretty gnarly way to go if you ask me. Sorry. Can't help you much bro.'\nYou got all the information you could. The only other thing you can do now is go back to Ranger Joe and ask him for infromation on the other suspects.");
//              TFTwo = true;
//            }
//          }
//        }
//        else if (ch2==3)
//        {
//          showMessage("Martha, you say? Truthfully, we don't have much information on Martha. All we know is that she is Uncle John's maid and that in murder mysteries, the maid is always the culprit. I think that's all-");
//          showMessage("OH ONE MORE THING");
//         int ch11 = getInt("She is Betty Sue's sister. Yes, the evil witch from level 1. Do you need more information on her?\n1) Yes. She seems almost too obvious. I need more info. \n2) Nah. I've made up my mind. I don't need to hear anything else");
//          if (ch11==2)
//          {
//            showMessage("You have come to a conclusion on Martha and you decide to go back to Ranger Joe and ask him about the other suspects.");
//            TFThree=true;
//          }
//          else
//          {
//            showMessage("'More infromation? I don't have anymore information but usually when she's not cleaning for the household, she's at the local pub, The Hairy Camel. Good luck buckaroo!' and with that, Ranger Joe sent you on your way.");
//            int ch12 = getInt("With Ranger Joe's instructions you find the pub. You walk in and find a handful of people drinking their sorrows away. Among them is Martha. You pick her out of the crowd right away. She is the spitting image of her sister except with A LOT more tattoos. You approach her. Do you \n1) Ask her about the murder. \n2) Ask her about Betty Sue. \n3) Get drunk.");
//            if (ch12==3)
//            {
//              showMessage("You get wasted with the people in the pub. Soon enough, it gets dark and you have to go home and get to sleep. You wake up the next morning slightly hung over with no recollection of the night before. Even if you did get any information from Martha, you don't remember any of it. You decide to be done with your investigation on Martha and you go back to Ranger Joe for more information on the other suspects. ");
//              TFThree=true;
//            }
//            else if (ch12==2)
//            {
//              showMessage("You ask Martha about her sister. She angrily slams down her bottle of beer. 'I'm tired of all y'all in this dumb town askin' me about her. I don't know. We we're never close. There was always somthin' off about that girl. I never questioned it. I just figured she was weird.'\nMartha makes it clear that she does not want to anwswer any more of your questions. You go back to Ranger Joe to continue your investigation. ");
//            }
//            else
//            {
//              int ch13 = getInt("You question Martha about her employer, Uncle John. You see her begin to tear up. She solemnly stares off at a blank wall. \n'We were childood freinds. He grew up across the street from me. His mother was like a second mom to me.' \nYou see one tear trail down her cheek. Suddenly her face hardens. She realizes that she let her guard down. The room is silent. They've never seen Martha cry. \n'I want whoever did this to suffer. They need to be punished. They need to pay.' \nThe tough Martha that everyone knows is back. The people of the pub go back to their regular conversations.\nMartha seems innocent. Was it just an elaborate act? Is she lying? Is she just as evil as her sister? Is she a secret demon? Will we ever know? \n1) Ask Martha about Betty Sue. It seems suspicious that she is the sister of a demon. \n2)Go back to Ranger Joe. You have enough information");
//              if(ch13==2)
//              {
//                showMessage("You go back to Ranger Joe to continue your investigation.");
//                TFThree = true;
//              }
//              else
//              {
//                showMessage("You ask Martha about her sister. She angrily slams down her bottle of beer. 'I'm tired of all y'all in this dumb town askin' me about her. I don't know. We we're never close. There was always somthin' off about that girl. I never questioned it. I just figured she was weird.'\nMartha makes it clear that she does not want to anwswer any more of your questions. You go back to Ranger Joe to continue your investigation.");
//                TFThree=true;
//              }
//            }
//          }
//
//        }
//        else if (ch2==4)
//        {
//          showMessage("'Bethany Ann?...listen here partner. Bethany Ann is kinda a sore subject for me. She is my ex wife and personally, I don't trust her. She is always very passive aggressive and acts too friendly. It gives me the heebie jeebies. We broke up because I wanted kids and she didn't. Honestly, I'm kinda glad she left. She was really sweet before we got married but the second we got married she became cold and threatening. She's been off ever since. I avoid that woman like the plague. Now she is--was married to this Uncle John guy. I suspect she's only with him for the money.'");
//          int ch14 = getInt("Do you \n1) Go find Bethany Ann to interrogate her. \n2) I know all I need to know about her");
//          if(ch14==2)
//          {
//            showMessage("You decide you have enough information about Bethany Ann and go back to Ranger Joe. ");
//            TFFour=true;
//          }
//          else
//          {
//            showMessage("'Where can I find her?' you ask \n'I don't keep tabs on her anymore but last I heard, she moved into the biggest house in Feildville along with Uncle John. I would check there first. It's pretty easy to find.'");
//            showMessage("You thank him and continue on your way. Soon enough you find the biggest house, a giant mansion with corinthian order pillars and an unaturally perfect lawn. Its almost unsettling. You walk up to the door and ring the doorbell. You hear a womans voice from inside the door yell 'Coming, Dear!' A few seconds later you hear someone fumbling with the locks on the door and the door swings open. Bethany Ann is standing in the doorway in a stlyish blue dress with her hair perfectly done in victorian stlye ringlets. Her face is caked with makeup and she is smiling avidly. ");
//            showMessage("'I'm here to talk to you about the death of Uncle John' yous say \n'Ah yes. a real shame. We'd only been married 4 months before he kicked the bucket.' She starts tearing up and she dramatically sighs and leads you inside. She brings you to the living room to offer you a seat on the couch and a glass of wine.");
//           int ch15 = getInt("Do you \n1) Ask her about her previous marriage with Ranger Joe. \n2)Ask her more about why she married uncle john.");
//            if (ch15==2)
//            {
//              showMessage("'Why did I marry him? Why he's the kindest most handsome young man, sugar. He's very sweet and caring.' she says. \nShe looks into the distance and smiles. She waits about 2 seconds, gazing into the distance before she looks back at you and sighs. \n'Real shame, ain't it darlin?' \nAnyway, that's all I know. I should probably get going. I have very important bussiness to attend to.");
//              int ch16 = getInt("Do you \n1)Ask her what she is doing\n2)Ask her abour her previous marriage with Rnager Joe.");
//              if(ch16==1)
//              {
//                showMessage("'Ummm. I am going to see my stepson, John Jr. Since the death of his father, he has become an orphan and although he is old enough to take care of himself, I'd still like to check on him. His mother died when he was young. A real shame. Anyway, I must be off.' She grabs her purse and swings it over her shoudler. She walks to the mirror by the door, reapplies her bright red lipstick, and opens the door for you. \nWhy did she seem so casual about it? Is she the murderer. She wouldv'e had access to the house. Ranger Joe said she was only interested in money. Would she kill for it? ");
//                showMessage("With nothing better to do, you return to Ranger Joe.");
//                TFFour=true;
//              }
//              else
//              {
//                showMessage("'That is horribly offensive. I'd like you to leave immediately. You've overstayed your welcome. I'm sure you can see yourself to the door.' She leaves in a huff and doesn't look back. She goes straight up the giant staircase to, presumebaly, her room. ");
//                showMessage("It seems like you touched a nerve. You leave the house. and go back to Ranger Joe");
//                TFFour=true; 
//              }
//            }
//            else
//            {
//              showMessage("'That is horribly offensive. I'd like you to leave immediately. You've overstayed your welcome. I'm sure you can see yourself to the door.' She leaves in a huff and doesn't look back. She goes straight up the giant staircase to, presumebaly, her room. ");
//              showMessage("It seems like you touched a nerve. You leave the house. and go back to Ranger Joe");
//              TFFour=true; 
//            }
//          }
//        }
//        else
//        {
//          showMessage("'Great. Ronny the Rooster. Hes one of the town chickens. No one really owns him and no one wants him either. When he wants food, he goes to the feilds for wheat. He is a mean rooster. If you walk to close to him, he will try to peck your legs off. He is not a friendly cock. I don't reccomend approaching him. Good luck buckaroo.'");
//          int ch17 = getInt("Do you \n1) Find the rooster and spy on him from afar.\n2) Getting anywhere near him seems unsafe. I have enough information. I go back to Ranger Joe");
//          if (ch17==2)
//          {
//            showMessage("You decide Ronny is unsafe and tell Ranger Joe you have enough information on him and that you are ready for the next step in the investigation");
//            TFFive=true;
//          }
//          else
//          {
//            int ch18 = getInt("You sneak up behind Ronny and spy on him from afar. A horse drawn carriage containing wheat rolls by. Ronny is unphased. He pecks at the horses hooves as the trot past him. Once they are gone, Ronny pecks at the stalks of wheat that fell off the carraige. Another chicken comes up to the trail of wheat left by the carriage and tries to take a piece. Ronny immediately crows at the chicken, and starts chasing it down an alley. You follow along behind them and discover the chicken's limp body on the gorund at the end of he alley with Ronny standing over it with his claw still on the bloody chicken's neck. You can still see the rise and fall of the chicken's chest. It's still alive do you \n1) Save it \n2) Run while you still can. ");
//            if (ch18==1)
//            {
//              showMessage("You take one step forward to help the chicken and Ronny turns his head towards you. His eyes are glowing red. Next thing you know he is diving for your throat and suddenly the world goes black. ");
//              showMessage("-You failed. Suffer.-");
//              //pause/wait
//              System.exit(0);
//            }
//            else
//            {
//              showMessage("Horrified, you take off running the other direction. You run back to Ranger Joe. It is pretty safe to say you dont want to encounter Ronny again. Is Ronny a cold blooded killer? He already killed another chicken but would he go as far as to kill a man in his own home? Did Uncle John see something or provoke him?");
//              TFFive=true;
//            }
//          }
//        }
//      }
//        int ch 19 = getInt("'Have you decided who the murderer is? '\n'yes', you reply. The killer was\n1)Harry the hooligan\n2)John Jr. \n3)Martha the maid \n4)Bethany Ann \n5)Ronny the rooster");
//      if (ch19==1)
//      {
//        showMessage("3 Days after Harry the Hooligan's public execution ordered by you, you are murdered in your sleep by the real murderer. You proceed to spend eternity in hell for killing an innocent man. ");
//        showMessage("-You failed. Suffer.-");
//      }
//      else if (ch19==2)
//      {
//        showMessage("3 Days after John Jr.'s public execution ordered by you, you are murdered in your sleep by the real murderer. You proceed to spend eternity in hell for killing an innocent man. ");
//        showMessage("-You failed. Suffer.-");
//      }
//      else if (ch19==3)
//      {
//        showMessage("3 Days after Martha The Maid's public execution ordered by you, you are murdered in your sleep by the real murderer. You proceed to spend eternity in hell for killing an innocent woman. ");
//        showMessage("-You failed. Suffer.-");
//      }
//      else if (ch19==5)
//      {
//        showMessage("3 Days after Ronny The Rooster's public execution (and feast)ordered by you, you are murdered in your sleep by the real murderer. You proceed to spend eternity in hell for killing a semi-innocent chicken. ");
//        showMessage("-You failed. Suffer.-");
//      }
//      else
//      {
//        showMessage("You order Bethany Ann's public execution and the next day she is hung in the town square.");
//        showMessage("Good Job. Bethany Ann was the murderer. You saved many innocent lives by ridding the village of the danger.");
//        showMessage("Congratulations. You won the game. Adventures In Fieldville LVL 4 coming soon. ");
//      }
//    }
//    }
//  }
//  
//  public static void main (String args[])
// {
// 	new TAIFlvl3().start(args);
// }
// 
// 
// //METHODS FOR ACM
//
//public static int random(int n)
//    {
//        return (int)(Math.random()*n) + 1;
//    }
//
//    //returns a random number between a and b
//    public static int random(int a, int b)
//    {
//        int c = Math.abs(b-a);
//        return (int)(Math.random()*c) + a + 1;
//    }
//
//    //Returns a string value input by the user
//    public  String getString(String userInput)
//    {
//        String input = JOptionPane.showInputDialog(userInput);
//        return input;
//    }
//
//    //Returns an int value input by the user
//    public  int getInt(String userInput)
//    {
//        String input = JOptionPane.showInputDialog(userInput);
//        return Integer.parseInt(input);
//    }
//
//    //Returns a double value input by the user that will be
//    //used in the program
//    public  double getDouble(String userInput)
//    {
//        String input = JOptionPane.showInputDialog(userInput);
//        return Double.parseDouble(input);
//    }
//
//    //displays output
//    public static void showMessage(String message )
//    {
//        JOptionPane.showMessageDialog(null, message, "Results",
//                                      JOptionPane.PLAIN_MESSAGE );
//    }
//
//    //Rounds a double value to p places after the decimal.
//    static double round(double x, double p)
//    {
//        p = Math.pow(10,p);
//        double y;
//        y = Math.floor(x*p+0.5)/p;
//        return y;
//    }
//
//}