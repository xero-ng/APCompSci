/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 *       Uses indexOf to find strings
 *       Handles responding to simple words and phrases 
 * This version uses a nested if to handle default responses.
 */
public class Magpie1
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		//Statements with multiple keywords will always respond with priority according to the order of the if statement. To change the prioritization of the responses, rearrange the if statement.
		String response = "";
		statement = statement.toLowerCase();
		statement = statement.trim();
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("yes") >= 0)
		{
			response = "Great.";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0
				|| statement.indexOf("uncle") >= 0
				|| statement.indexOf("aunt") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("dog") >= 0 || statement.indexOf("cat") >= 0)
		{
					response = "Tell me more about your pets.";
		}
		else if (statement.indexOf("naaman") >= 0)
		{
			response = "He sounds pretty awesome!";
		}
		else if (statement.length() <= 0)
		{
			response = "Say something, please.";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "Huh.";
		}
		else if (whichResponse == 5)
		{
			response = "Well, isn't that something?";
		}

		return response;
	}
}
