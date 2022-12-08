package activity4;

import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner4
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie4 maggie = new Magpie4();
	
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}
	
	
	
	//Exploration: 
	//1) "What would it mean to build a robot?"
	//2) "What would it mean to understand French?"
	//3) "What makes you think that I like you?"
	//4) "What makes you think that I confuse you?"
	
	//Exercises
	//Exercises done in Magpie4 with two new implemented methods
	
	//1) Find an example of when this structure does not work well. How can you improve it? 
	/*
	An example when this structure  does not work well is with the phrase, 
	"When were you built". We could improve on this by finding the "when" keyword 
	in that specific phrase, you could have a response that says, "When do you think?".
	Overall, I think that my experience with chatbots was amazing I and learnt 
	a lot from this.  
	
	*/

}
