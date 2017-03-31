/*
 * Copie de ParsePost.java Listing 4.8, par Herimanitra RANAIVOSON, INF1004-Devoir2
 * avec modification pour prise en compte de l'operateur $ 
 * comme operateur unaire
 */
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParsePost {
	private Postfix theStack;
	private String input;
	private ArrayList<String> inputArray = new ArrayList<String>();
	//---------------------constructor------------------------------------
	public ParsePost(String s)
	{ 
		input = s; 
		System.out.println("we are going to evaluate:" + input);
		inputArray = getInputArray(input);
	}
	//--------------------------------------------------------------
	public ArrayList<String> getInputArray(String str)
	{
		String condregexp1 = "((?<=([*]))|(?=[*]))|";
		String condregexp2= "(?<=/)|(?=/)|";
		String condregexp3 ="(?<=-)|(?=-)|";
		String condregexp4 = "((?<=([+]))|(?=[+]))|";
		String condregexp5 = "((?<=([$]))|(?=[$]))|";
		String condregexp6 = "((?<=([(]))|(?=[(]))|";
		String condregexp7 = "((?<=([)]))|(?=[)]))|";
		String condregexp8 = "\\s+";
		String[] splittedString = str.split(condregexp1+condregexp2+ condregexp3+ condregexp4+condregexp5+ condregexp6+condregexp7+condregexp8);		
		for (int k=0 ; k<splittedString.length ; k++) 
		{
			Pattern pattern = Pattern.compile("\\d+|[*]|[+]|[-]|[/]|[$]");
			Matcher matcher = pattern.matcher( splittedString[k]);
			boolean found = matcher.find();
			if (found)
			{
				//System.out.println("STRING"+k+" : " + splittedString[k]);
				this.inputArray.add(splittedString[k]);	
			}
			
		}
		return this.inputArray;
	}
	
	//int-->double
	public double doParse()
	{
		int mysize = inputArray.size();
		theStack = new Postfix(mysize);
		String ch;
		int j;
		double interAns;
		for (j=0;j<inputArray.size();j++)
		{
			ch = inputArray.get(j);
			
			//if ( !ch.equals("") && !ch.equals(" ") )
			//{
				
				theStack.displayStack(""+ch+" ");
				if( Pattern.compile("\\d+").matcher(ch).find() ) 
				{
					System.out.println(ch+" appended to the stack");
					theStack.push( Double.parseDouble(ch) ); 
				} else {
					//evaluation of $ as unary operator:
					if (Pattern.compile("[$]").matcher(ch).find() )
					{
						System.out.println("evaluation of " + ch);
						theStack.push( Math.sqrt( theStack.pop() ) ) ; 
					} else {
						double num2 = theStack.pop();
						double num1;
						if(!theStack.isEmpty() ) 
						{
							num1 = theStack.pop();
					    } else {
							num1=0;
					    }
						
						switch(ch)
						{
						case "+":
							interAns = num1 + num2;
						    break;
						case "-":
							interAns = num1 - num2;
							break;
						case "*":
							interAns = num1 * num2;
							break;
						case "/":
							interAns = num1 / num2;
							break;
						default:
							interAns = 0;
						}
						theStack.push(interAns);
					}
					
			//}
			}
			
	    } //endof for
		interAns = theStack.pop();
		return interAns;
}
}
