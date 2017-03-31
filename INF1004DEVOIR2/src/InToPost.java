/*
 * Copie InToPost.java du listing 4.7, par Herimanitra RANAIVOSON, INF1004-Devoir2
 * Avec usage d'expression regulière pour tenir compte de n'importe quel chiffre
 * Prise en compte aussi de l'operateur $ pour évaluer en racine carrée
 */
import java.util.ArrayList;

public class InToPost {
	private Infix theStack;
	private String input;
	private String output = "";
	private ArrayList<String> inputArray = new ArrayList<String>();
	//-------------------constructor-------------------------------------------
	public InToPost(String in)
	{
		input = in;
		inputArray = getInputArray(input);
		int stackSize =inputArray.size();
		theStack = new Infix(stackSize);
	}
	
	/* method to split expression based on
	 * operation symbols
	 */
	public ArrayList<String> getInputArray(String str)
	{
		String condregexp1 = "((?<=([*]))|(?=[*]))|";
		String condregexp2= "(?<=/)|(?=/)|";
		String condregexp3 ="(?<=-)|(?=-)|";
		String condregexp4 = "((?<=([+]))|(?=[+]))|";
		String condregexp5 = "((?<=([$]))|(?=[$]))|";
		String condregexp6 = "((?<=([(]))|(?=[(]))|";
		String condregexp7 = "((?<=([)]))|(?=[)]))|";
		String condregexp8 = "(\\s+)";
		String[] splittedString = str.split(condregexp1+condregexp2+ condregexp3+ condregexp4+condregexp5+ condregexp6+condregexp7+condregexp8);		
		for (int k=0 ; k<splittedString.length ; k++) 
		{
				//System.out.println("STRING"+k+" : " + splittedString[k]);
				this.inputArray.add(splittedString[k]);	
		}
		return this.inputArray;
	}
	//
	private void gotParen(String ch) {
		while( !theStack.isEmpty() )
		{
			String chx = theStack.pop();
			if( chx.equals("(") ) {
				break;
			} else {
				//output = output + chx; 
				output = output + " "+ chx; 
		    } 
		} 
	}
	private void gotOper(String ch, int prec1) {
		
		while( !theStack.isEmpty() )
		{
			String opTop = theStack.pop();
			if ( opTop.equals("(")  ) {
				theStack.push(opTop);
				break;
		    } else {
		    	int prec2 ;		    	
		    	if(opTop.equals("+") || opTop.equals("-") )
		    	{
		    		prec2 = 1;
		    	} else {
		    	    prec2 = 2;
		    	}		    	
		    	if(prec2 < prec1) {
		    		theStack.push(opTop);
		    		break;
		    	} else {
		    		//output = output + opTop;
		    		output = output + " "+ opTop; 
		    	}
		    }
		}
		theStack.push(ch);	
	}
	//-------------------do translation to postfix-----------------------------
	public String doTrans()
	{
		for (int j=0;j<inputArray.size();j++)
		{
			String ch = inputArray.get(j);
			theStack.displayStack("For "+ch+" "); 
			switch(ch)
			{
			case "+":
			case "-":
				gotOper(ch, 1);
				break;
			case "*":
	        case "/":
	        //case "$": 
	        	gotOper(ch, 2);
	            break;
	        case "$":
	        	gotOper(ch, 3);
	        	break;
	        case "(":
	        	theStack.push(ch);
	        	break;
	        case ")":
	        	gotParen(ch);
	            break;
	        default:
	        	output = output + " " + ch; 
	            break;
	       } 
	   } 
	   while( !theStack.isEmpty() )
	   {
	       output = output + theStack.pop(); 
	   }
	   return output.replaceAll("\\s+", " ");
	} 
}
