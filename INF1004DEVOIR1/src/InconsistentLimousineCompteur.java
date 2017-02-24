
public class InconsistentLimousineCompteur extends Exception {
	
	private static final long serialVersionUID = 7244153468126425335L;

	/*
	 * Exception si le compteur de la limousine est negatif
	 */
	public  InconsistentLimousineCompteur()
	{
		System.out.println("Le compteur de la limousine ne peut pas etre negatif");
	}
}
