import java.util.Scanner;

/*
 * Test.java,  par Herimanitra RANAIVOSON
 * permet de tester les specs du devoir1 INF1004
 * avec les exceptions definies dans Compagnie.java
 */
public class CompagnieTest {
	private static Scanner scan;
	public static void main(String[] args) throws InconsistentTrajet, ImmatriculationNullException, EmptyLimousineException, InconsistentYear 
	{
		Compagnie compagnie;
		compagnie = new Compagnie();
		boolean record= true;
		while (record)
		{
			try 
			{
				compagnie.makeReservation("");
				compagnie.makeTrip();
				compagnie.displayConfirmationMsg();				
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
			
			///////////////////////////////////////////////////////////////////////
			System.out.println("Voulez-vous chercher un chauffeur pour connaitre\n les limousines qu\'il a conduit? (Oui:o ou Non:n)");
			scan = new Scanner(System.in);
			String lookUp= scan.nextLine();
			if ( lookUp.equals("o") )
			{
				System.out.println("Entrez le nom du chauffeur: "); 
				String name = scan.nextLine();	
				System.out.println("Entrez son prenom: "); 
				String prenom = scan.nextLine();	
				System.out.println("Entrez sa date embauche: "); 
				String mydate =scan.nextLine();
				compagnie.findLimousineByChauffeur(name,prenom,mydate);
			}
			//caracteristiques trajet /////////////////////////////////////////////
			System.out.println("Voulez-vous afficher toutes les caractéristiques des trajets effectués\n ainsi que les caractéristiques des limousines utilisées? (Oui:o ou Non:n)");
			scan = new Scanner(System.in);
			String charact= scan.nextLine();
			if ( charact.equals("o") )
			{
				compagnie.getAllTrajet();
			}
			//
			System.out.println("Voulez-vous assigner un chauffeur existant pour un trajet?(Oui:o ou Non:n)");
			String assignChauffDecision= scan.nextLine();
			switch (assignChauffDecision) {
			case "o":
				compagnie.getListChauffeur();
				String indexChauff= scan.nextLine();
				try 
				{
					compagnie.makeReservation(indexChauff);
					compagnie.makeTrip();
					compagnie.displayConfirmationMsg();				
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
				break;
			case "n":
				break;
			}
			//caracteristiques trajet /////////////////////////////////////////////
			System.out.println("Voulez-vous afficher toutes les caractéristiques des trajets effectués\n ainsi que les caractéristiques des limousines utilisées? (Oui:o ou Non:n)");
			scan = new Scanner(System.in);
			charact= scan.nextLine();
			if ( charact.equals("o") )
			{
				compagnie.getAllTrajet();
			}
			//
			
			/////////////////// nouvel enregistrement ////////////////////////////////////
			System.out.println("Voulez-vous continuer à ajouter (attribution d\'un chauffeur et d\'un trajet)? (Oui:o ou Non:n)");
			scan = new Scanner(System.in);
			String decision= scan.nextLine();
			switch (decision) {
			case "o":
				record=true;
				break;
			case "n":
				record= false;	
				System.out.println("MERCI!FIN DU PROGRAMME!");
				break;
			}
			
		} 
	}
}
