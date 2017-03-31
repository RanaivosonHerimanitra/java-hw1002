/*
 * Copie de PostfixApp.java, Listing 4.8 par Herimanitra RANAIVOSON, INF1004-Devoir2
 * Sans modification!
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PostfixApp {

	public static void main(String[] args) throws IOException 
	{
		String input;
		double output;
		while(true)
		{
			System.out.print("Enter postfix: ");
			System.out.flush();
			input = getString();
			if( input.equals("") ) 
			{
				break;
			} else  {
				ParsePost aParser = new ParsePost(input);
				output = aParser.doParse(); 
				System.out.println("Evaluates to " + output);
			}
		} 
	}
	
	public static String getString() throws IOException
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
}
