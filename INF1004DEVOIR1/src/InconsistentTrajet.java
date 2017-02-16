/*
 * Exception si la longeur du trajet est null ou negatif
 */
public class InconsistentTrajet extends Exception {
	
	private static final long serialVersionUID = 8661256727630908288L;

	public  InconsistentTrajet()
	{
		System.out.println("La longeur du trajet ne peut etre zero ou inferieur");
	}
}
