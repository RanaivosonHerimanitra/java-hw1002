/*
 * Exception si Numero d'immatriculation vide
 */
public class ImmatriculationNullException extends Exception {
	
	private static final long serialVersionUID = 2461206410405552709L;

	public ImmatriculationNullException()
	{
		System.out.println("L\'immatriculation ne doit pas etre laisser vide!");
	}

}
