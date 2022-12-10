import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 */
public class MagpieRunner1
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie1 maggie = new Magpie1();
		
		System.out.println (maggie.getGreeting());
		try (Scanner in = new Scanner (System.in)) {
			String statement = in.nextLine();
			
			while (!statement.equals("bye"))
			{
				System.out.println (maggie.getResponse(statement));
				statement = in.nextLine();
			}
		}
	}

}
