/*
 * Copie de Postfix.java, Listing 4.8 par Herimanitra RANAIVOSON, INF1004-Devoir2
 * Sans modification!
 */
public class Postfix {
	private int maxSize;
	private double[] stackArray;
	private int top;
	//--------------------------------------------------------------
	public Postfix(int size)
	{
		maxSize = size;
		stackArray = new double[maxSize];
		top = -1;
	}
	//--------------// put item on top of stack----------------------------
	public void push(double interAns)
	{ 
		stackArray[++top] = interAns; 
	}
	
	//-------------// take item from top of stack----------------------------------
	public double pop()
	{ 
		return stackArray[top--]; 
	}
	
	//--------------// peek at top of stack---------------------------------
	public double peek()
	{ 
		return stackArray[top]; 
	}
	
	//---------------// true if stack is empty---------------------------------
	public boolean isEmpty()
	{ 
		return (top == -1); 
	}
	
	//-----------------// true if stack is full------------------------------------
	public boolean isFull()
	{ 
		return (top == maxSize-1); 
	}
	
	//----------------------// return size--------------------------------
	public int size()
	{ 
		return top+1; 
	}
	
	//-----------------------// peek at index n-----------------------------
	public double peekN(int n)
	{ 
		return stackArray[n]; 
	}
	//--------------------------------------------------------------
	//--------------------------------------------------------------
	public void displayStack(String s)
	{
		System.out.print(s);
		System.out.print("Stack (bottom-->top): ");
		for(int j=0; j<size(); j++) 
		{
			System.out.print( peekN(j) );
			System.out.print(" ");
		}
		System.out.print("");
	}
}
