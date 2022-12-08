package activity2;

import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner2
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		Magpie2 maggie = new Magpie2();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();
		
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}
	
	
	//Activity #2
	//1) Tell me more about your family. 
	//2) You don't say.
	//3) Hmm. 
	//4) Tell me more about your family. 
	
	//5) We can prioritize the responses with multiple keywords by creating else if statements that
    //    are able to cover every possibility the user enters in the chat box. We would need to implement multiple && and || statements 
	//     in order to process the combination of multiple keywords. (Ex. using && or || statements for either dog,
	//     mother, brother, and any other keywords. 

	//Questions 
	//1) 
	/*
	 That means that keywords are pulled out from the user's response and reply's according
      to that specific keyword, and in this instance the keywords are father, mother, brother, sister
     But the problem with the responses stated is that there are no common keywords.
	
	 */
	
}
