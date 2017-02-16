/*
 * Test.java,  par Herimanitra RANAIVOSON
 * permet de tester les specs du devoir1 INF1004
 * avec les exceptions definies a Compagnie.java
 */
public class CompagnieTest {

	public static void main(String[] args) throws InconsistentTrajet, ImmatriculationNullException 
	{
		Compagnie compagnie;
		try {
			compagnie = new Compagnie();
			compagnie.makeReservation();
			compagnie.makeTrip();
			compagnie.displayConfirmationMsg();
			
			System.out.println("******************************************************************");
			System.out.println("Test de la recherche Limousine avec quelques chauffeurs par defaut");
			
			System.out.println("******************************************************************");
			System.out.println("Cherche la limousine du chauffeur qui a ete defini par defaut:");
			compagnie.findLimousineByChauffeur("Eric", "Jean","2012");
			System.out.println("******************************************************************");
			
			System.out.println("Cherche un meme nom prenom qu\'un chauffeur dans la base mais different annees embauches:");
			compagnie.findLimousineByChauffeur("Eric", "Jean","2011");
			System.out.println("******************************************************************");
			
			System.out.println("Cherche nom et prenom qui ne sont pas encore enregistre:");
			compagnie.findLimousineByChauffeur("Xavier", "peter","2011");
			System.out.println("******************************************************************");
			
			System.out.println("Cherche la limousine du chauffeur qui vient d etre entre au clavier");
			compagnie.findLimousineByChauffeur(compagnie.getLastEnteredNom(),compagnie.getLastEnteredPrenom(),compagnie.getLastEnteredAnneeEmbauche());
			
			
			System.out.println("************************************************************");
			System.out.println("************CARACTERISTIQUES DES TRAJETS EFFECTUES**********");
			compagnie.getAllTrajet();
			
		} 
		catch (EmptyLimousineException e1) {			
			e1.printStackTrace();
		}
		catch (InconsistentYear e2) {
			e2.printStackTrace();
		}
		catch (InconsistentTrajet e3) {
			e3.printStackTrace();
		}
		catch (ImmatriculationNullException e4) {
			e4.printStackTrace();
		}
	}
}
