/*
 * Test.java,  par Herimanitra RANAIVOSON
 * permet de tester les specs du devoir1 INF1004
 * notamment les exceptions:
 * si annee embauche superieure a l'annee courante;
 * si le reservoir est vide
 */
public class Test {

	public static void main(String[] args) 
	{
		Compagnie compagnie;
		try {
			compagnie = new Compagnie();
			compagnie.makeReservation();
			compagnie.makeTrip();
			compagnie.displayConfirmationMsg();
			System.out.println("************Test de FindLimousineByChauffeur avec quelques valeurs by default************");
			compagnie.findLimousineByChauffeur("Eric", "Jean","2012");
			compagnie.findLimousineByChauffeur("Xavier", "peter","2011");
			System.out.println("****************************************************************************");
			System.out.println("************CARACTERISTIQUES DES TRAJETS EFFECTUES************");
			compagnie.getAllTrajet();
			
		} 
		catch (EmptyLimousineException e1) {			
			e1.printStackTrace();
		}
		catch (InconsistentYear e2) {
			e2.printStackTrace();
		}
	}
}
