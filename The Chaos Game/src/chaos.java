import java.util.Scanner;
import java.util.Random;
public class chaos {

    private final int LINEWIDTH = 60;
    private Scanner in = new Scanner(System.in);
    private String name;
	final String ANSI_RED = "\u001B[31m";
    final String ANSI_RESET = "\u001B[0m";
	final String ANSI_GREEN = "\u001B[32m";
	final String ANSI_YELLOW = "\u001B[33m";
	final String ANSI_BLUE = "\u001B[34m";
	final String ANSI_PURPLE = "\u001B[35m";
	final String ANSI_CYAN = "\u001B[36m";
	final String ANSI_WHITE = "\u001B[37m";

    
	//story
    public void start() {
        slowPrint("The Chaos Game - an mediocre attempt at dark humor", 10);
		delay(3000);
		slowPrint("Written by Naaman Roberts.", 10);
		delay(5000);
		System.out.println();
		slowPrint("It is 7:00 am. You sit on the edge of your bed, deep in thought. The phone rings.", 10);
		int quest1;
		System.out.println("What do you want to do?");
		print("(1) Answer the phone.");
		print("(2) Ignore it, and continue sitting deep in thought.");
		quest1 = in.nextInt();
			if (quest1 == 1) {
				part1();
			}
			else {
				slowPrint("Some seconds pass, and the phone stops ringing. Your bedroom door flies open, and a stone-faced man in a dark suit puts a gun in your face. \"You should have answered the phone.\" he says, before promptly pulling the trigger.", 10);
				failCondition();	
			}	
 }
	public void part1() {
			slowPrint("You put the phone to your ear. A voice speaks. \"Would you like to play a game?\"", 10);
				print("(1) \"Sure, I guess.\"");
				print("(2) \"Okay?\"");
				int quest2 = in.nextInt();

			slowPrint("\"Good, good. We can call it the Chaos Game. The objective of the game? Survive. I believe you're going to find that to be intensely difficult.\"", 10);
				print("(1) \"Wait, WHAT?!\"");
				print("(2) \"Wait, wait, wait, no, I want no part of this!!\"");
				quest2 = in.nextInt();

			slowPrint("\"Ah, ah, ah. I'm afraid its a bit late for second thoughts. Two hints before you begin. It'd be in your best interest to not stay where you are. It would also be in your best interest to take this phone with you. Good luck.\" \nThe phone clicks as the caller hangs up. Immediately, a loud banging on the front door is heard.", 10);
				System.out.println("What do you want to do?");
				print("(1) Hide in the bedroom closet.");
				print("(2) Go into the bedroom closet, open the safe and grab a gun.");
				print("(3) Hide under the bed, and call 911.");
				int quest3 = in.nextInt();

				if (quest3 == 1) {
					slowPrint("You hide in the bedroom closet. The banging on the front door continues, until it flies off the hinges. Footsteps are heard heading towards the bedroom. You hold your breath. The footsteps get close to the closet door.", 10);
					System.out.println("What do you want to do?");
					print("(1) Shove the bedroom door open with a shirt in hand, and attempt to choke the person standing in your bedroom.");
					print("(2) Do nothing.");
					print("(3) Attempt to talk things out with the person standing in your bedroom.");
					int quest4 = in.nextInt();

					if (quest4 == 1) {
						slowPrint("You shove open the bedroom door, with a shirt in hand. The door hits the assailant, catching him off guard, so you jump up on to the bed and wrap the shirt around his neck, and pull it tight. The man grabs the shirt and swings you off the bed, over his shouldr and onto the floor, and quickly follows with a kick to your face.", 10);
						failCondition();
					}
					else if (quest4 == 2) {
						slowPrint("You sit quietly and do nothing. A few seconds pass, and the man snatches the bedroom closet door open, you scream like a scared child and promptly take a knuckle sandwich to the kisser. The punch sends your head flying into the back wall of the closet.", 10);
						failCondition();
					}
					else if (quest4 == 3) { 
						slowPrint("You yell, \"Would you like some coffee?!\" from the inside the closet. The man, puzzled, responds. \"Uh, sure.\" An hour passes, and you've discovered that this man is an enjoyer of dogs, classical music and, strangely, nuclear physics. If you manage to survive the next few rounds, you'll attend a London Symphony Orchestra concert together next week.", 10);
						System.out.println(ANSI_GREEN + "Well done. You've survived." + ANSI_RESET);
						part2();
					}
				}
				else if (quest3 == 2) {
					slowPrint("You go to the bedroom closet and grab your gun. Then, you stand in front of the bedroom door, gun trained on it, as you hear the front door fly off its hinges. The bedroom door flies open, and you pull the trigger. \"CLICK!\" In your infinite wisdom, you've discovered that in order for a gun to be effective, it requires bullets. As the man is dragging you by the feet out of your front door, you see \".9MM AMMO\" written on a sticky note titled \"GROCERY LIST\".", 10);
					failCondition();
				}
				else if (quest3 == 3) {
					slowPrint("You hide under the bed and call 911. Except, there's no cell service. In the time you spent repeatedly calling 911 because the concept of NO SERVICE hadn't quite registered the first six times, the man had made his way into your bedroom. You get snatched out from under the bed by your feet like a scene out of a bad horror movie.",10);
					failCondition();
				}	
	}
	public void part2() {
		int quest5;
		slowPrint("The man leaves the house satisfied and full of good, warm coffee. You are left standing in your kitchen, cleaning coffee cups, when suddenly you are aggressively pinned to a cabinet by a woman, armed to the teeth and clad in dark military fatigues.", 10);
		System.out.println("What do you want to do?");
		print("(1) Reach for the knife behind you and attempt to fight her.");
		print("(2) Shove her away from you, and stare menacingly.");
		print("(3) Suggest that she should use mouthwash and learn the concept of personal space.");
		quest5 = in.nextInt();
		if (quest5 == 1) {
			slowPrint("You reach for the knife but she grabs your arm and twists it, then proceeds to knee you in the groin. You never once thought you could sing at such high notes.", 10);
			failCondition();
		}
		else if (quest5 == 2) {
			int subQuest1;
			slowPrint("You shove her away from you, and stare at her menacingly, attempting the form the fiercest facial expression you can find. She glares back. The air is tense and thick, so much so that it may be cut and consumed with a fork and a knife.", 10);
			System.out.println("What do you want to do?");
			print("(1) Attempt a roundhouse kick to her head.");
			print("(2) Snatch a flower from the vase nearby, put it in your mouth, and rip off your shirt and pants to reveal a crisp tuxedo, red tie and slacks, and say confidently \"May I have this dance, m'lady?\"");
			print("(3) Offer to make her pancakes.");
			subQuest1 = in.nextInt();
				if (subQuest1 == 1) {
					slowPrint("You attempt to roundhouse kick her head. Except you're a yellow belt in Taekwondo and you make funky faces before you kick, so she saw it coming from a mile away. She grabs your foot midkick, and does origami with it.", 10);
					failCondition();
				}
				else if (subQuest1 == 2) {
					slowPrint("Being the hopelessly romantic gentleman you are, clad in tuxedo, red tie and slacks, you ask her, \"May I have this dance, m'lady?\" She rips off her military gear to reveal a stunning red dress, and the both of you passionately do the tango without music in your kitchen. This goes on for thirty minutes. If you survive the next round, the both of you will get married under the Eiffel Tower in Paris.", 10);
					System.out.println(ANSI_GREEN + "Well done. You've survived." + ANSI_RESET);
					part3();
				}
				else if (subQuest1 == 3) {
					slowPrint("Being the world class chef you are, you ask her if she'd like you to make her some pancakes. At the mere mention of the word pancakes, this woman is furious. \"I HATE PANCAKES! WAFFLES ARE SUPERIOR YOU UNCULTURED SWINE!!\" The woman proceeds to throw you to the ground, then follows with a kick to the face.", 10);
					failCondition();
				}

		}
		else if (quest5 == 3) {
			slowPrint("You tell her she should use mouthwash and give you some space. Unexpectedly, she becomes very apologetic and steps back slightly. Then she offers to cook you waffles, and given that you love waffles, it's 8:00 in the morning and you're starving, you accept. The waffles are good. Really good. Michelin-star level good. Good all the way up until the point where you feel woozy, and fall over unconcious out of your dining room chair. You were poisoned, but at least you died happy.", 10);
			failCondition();
		}

	}
	public void part3() {
		
	}
	public void failCondition() {
		int randCondition = (int)(Math.random()*(3-1+1)+1);
		if (randCondition == 1)
			System.out.println(ANSI_RED + "It appears that you've died." + ANSI_RESET);
		else if (randCondition == 2)
			System.out.println(ANSI_RED + "You've been fatally injured." + ANSI_RESET);
		else if (randCondition == 3) 
			System.out.println(ANSI_RED + "You're dead." + ANSI_RESET);

	}
	public void slowPrint(String str, int timeBetweenCharactersMS)
	{
		for (int i = 0; i < str.length(); i++)
		{
			//print one character at a time
			System.out.print(str.substring(i,i+1));
			delay(timeBetweenCharactersMS);
		}
		//Put a new line
		System.out.println();
	} //end slowPrint()
	public void delay(int ms)
	{
		//Uses Thread.sleep( numberInMS ) to pause the program
		try
		{	Thread.sleep( ms );		}
		catch(Exception e)
		{	}
	} //end delay

	public void print(String str)
	{
		//store the string into a "consumable" toPrint string
		String toPrint = str;
		
		//While there is stuff still to be printed
		while (toPrint.length() > 0)
		{
			if (toPrint.length() > LINEWIDTH)
			{
				//If the amount of stuff left is longer than the LINEWIDTH...
				//Find the index of the last space before the LINEWIDTH
				int index = toPrint.lastIndexOf(" ", LINEWIDTH);
				
				if (index > -1)
				{	
					//Find the last space nearest to the LINEWIDTH
					System.out.println(toPrint.substring(0, index));
					toPrint = toPrint.substring(index);
				}
				else
				{
					//If there are no spaces, just yolo the whole line
					System.out.println(toPrint.substring(0, index));
					toPrint = "";
				}
				
			}
			else
			{
				//If there is less to print than the linewidth
				System.out.println(toPrint);
				toPrint = "";
			}
		}//end while

	}//end print()
}
