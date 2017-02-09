/*
 * Exception si la limousine n'a pas d'essence
 */
public class EmptyLimousineException extends Exception {
	
	private static final long serialVersionUID = -102923688907400652L;

	public  EmptyLimousineException()
	{
		System.out.println("Cette limousine ne peut pas rouler sans essence!");
	}
}
