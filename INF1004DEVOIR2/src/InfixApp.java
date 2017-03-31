/*
 * Methode principale pour l'evaluation de l'expression postfixée et sa forme
 * modifié par Herimanitra RANAIVOSON, INF1004-Devoir2
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InfixApp {
	
	public static void main(String[] args) throws IOException 
	{
		String input, output;
		double evaluation;
		while(true)
		{
			System.out.print("Enter infix: ");
			System.out.flush();
			input = getString();
			if( input.equals("") ) {
				break;
			}
			InToPost theTrans = new InToPost(input);
			output = theTrans.doTrans(); 		
			System.out.println("Postfix is " + output + '\n');
			ParsePost aParser = new ParsePost(output);
			evaluation = aParser.doParse();	
			System.out.println("\n Evaluates to " + evaluation + '\n');
		}
    }
	private static String getString() throws IOException 
	{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}
}

	
