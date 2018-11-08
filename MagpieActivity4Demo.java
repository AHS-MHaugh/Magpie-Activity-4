/**
 *Michael Haugh
 *Magpie Activity 4
 *AP CS
 *11-7-18
 */

import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieActivity4Demo{
    //^This is the class.^

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		MagpieActivity4 maggie = new MagpieActivity4();
            // ^This is the object.^
		
		System.out.println (maggie.getGreeting());
            //^This is the greeting print command.^
		Scanner in = new Scanner (System.in);
            //^This is the scanner object.^
		String statement = in.nextLine();
            //^nextLine method adds a new line after the response is received.^
		
		while (!statement.equals("Bye")){
            //^Allows the response to be sent if the input is not "Bye".^
			System.out.println (maggie.getResponse(statement));
            //^This is the print command.^
			statement = in.nextLine();
            //^Adds a new line after response is received.^
		}
	}

}

