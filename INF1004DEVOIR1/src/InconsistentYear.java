/*
 * Appel de cette exception en cas d'inconsistence 
 */
public class InconsistentYear extends Exception {

	private static final long serialVersionUID = 4542135047806026227L;
	
	public InconsistentYear()
	{
		System.out.println("Impossible d\'avoir une annee embauche superieure a l\'annee courante ou inferieur a 1960");
	}

}
