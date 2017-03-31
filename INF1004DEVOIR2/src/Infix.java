/*
 * Copie de infix.java du listing 4.7, par Herimanitra RANAIVOSON, INF1004-Devoir2
 */
public class Infix {
	private int maxSize;
	private String[] stackArray;
	private int top;
	
	//-----------------------Constructor----------------------------
	public Infix(int s)
	{
		maxSize = s;
		stackArray = new String[maxSize];
		top = -1;
	}
	//--------------------put item on top of stack------------------
	public void push(String ch)  
	{ 
		stackArray[++top] = ch; 
	}
	//----------------------take/remove item from top of stack-------------
	public String pop()
	{
		return stackArray[top--];
	}
	//----------------------peek at top of stack---------------------
	public String peek() 
	{ 
		return stackArray[top]; 
	}
	//-----------------------true if stack is empty------------------
	public boolean isEmpty() 
	{ 
		return (top == -1); 
	}
	//------------------------ return size---------------------------
	public int size()
	{ 
		return top+1; 
	}
	//------------------------return item at index n------------------
	public String peekN(int n) 
	{ 
		return stackArray[n]; 
	}
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
		System.out.println("");
	}

}
