import java.lang.Math;
import java.util.Scanner;
public class App {
    final static String ANSI_RED = "\u001B[31m";
    final static String ANSI_RESET = "\u001B[0m";
	final static String ANSI_GREEN = "\u001B[32m";
	final static String ANSI_YELLOW = "\u001B[33m";
	final static String ANSI_BLUE = "\u001B[34m";
	final static String ANSI_PURPLE = "\u001B[35m";
	final static String ANSI_CYAN = "\u001B[36m";
	final static String ANSI_WHITE = "\u001B[37m";
    private static boolean playAgain = true;
    private static int totalGuesses = -1;
    private static int totalGames = -1;
    private static int maxValue;
    private static int average = totalGuesses / totalGames;

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println(ANSI_YELLOW + "Welcome to the HighLow Game!" + ANSI_RESET);
        System.out.println(ANSI_PURPLE + "What is your maximum value?" + ANSI_RESET); 
        maxValue = input.nextInt();

        while (playAgain == true)
        {
            int number = 1 + (int)(Math.random() * maxValue);
            totalGames = totalGames + 1;
            int userGuess = -1;
            int guessCount = 0;
            while (userGuess != number) 
            {
                System.out.println("I'll need you to guess a number for me.");
                userGuess = input.nextInt(); input.nextLine();
                guessCount = guessCount + 1;
                totalGuesses = totalGuesses + 1;
                if (userGuess > number) 
                {
                    System.out.println(ANSI_RED + "Too high, try again." + ANSI_RESET);
                }
                else if (userGuess < number)
                {
                    System.out.println(ANSI_RED + "Too low, try again." + ANSI_RESET);
                }
                else if (userGuess == number)
                {
                    System.out.println(ANSI_GREEN + "You guessed correctly." + ANSI_RESET);
                }
            }
            System.out.println(ANSI_GREEN + "Well done. You've guessed the number, and it took you " + guessCount + " tries.");
            System.out.println("Average guesses per game: " + average + ANSI_RESET);
            System.out.println("You would like to play again. [true]");
            playAgain = input.nextBoolean();
            if (playAgain == true) 
            {
                playAgain = true;
            }
            else 
            {
                playAgain = false;
            }
            
        }




    }
}
