/*
 * Test.java,  par Herimanitra RANAIVOSON
 * permet de tester les specs du devoir1 INF1004
 * notamment les exceptions
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
			System.out.println("************Test de FindLimousineByChauffeur avec val by default************");
			compagnie.findLimousineByChauffeur("Eric", "Jean","2012");
			compagnie.findLimousineByChauffeur("Xavier", "peter","2011");
			System.out.println("****************************************************************************");
			System.out.println("************CARACTERISTIQUES DES TRAJETS EFFECTUES************");
			compagnie.getAllTrajet();
			//exception si année d'embauche supérieure à l'année courante;
		} 
		catch (EmptyLimousineException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		catch (InconsistentYear e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
	}
}
