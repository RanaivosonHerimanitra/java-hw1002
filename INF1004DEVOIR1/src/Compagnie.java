
import java.util.Scanner;

public class Compagnie {
	private static String chauffeurNom;
	private static String chauffeurPrenom;
	private static String anneeEmbauche;
	private static String lieuDepart ;
	private static String lieuDestination;
	private static String immmatriculation ;
	private static Scanner scan;
	
	public static void makeReservation()
	{
		        //recupere les inputs:
				scan = new Scanner(System.in);  
				System.out.println("Entrez le nom du chauffeur: "); 
				chauffeurNom = scan.nextLine();
				System.out.println("Entrez le prénom du chauffeur: "); 
				chauffeurPrenom = scan.nextLine();
				System.out.println("Entrez l\'année d`'embauche du chauffeur: "); 
				anneeEmbauche = scan.nextLine() ;
				System.out.println("Entrez le lieu de départ: "); 
				lieuDepart = scan.nextLine();		
				System.out.println("Entrez le lieu de destination: "); 
				lieuDestination = scan.nextLine();
				System.out.println("Entrez le numero d\'immatriculation de la limousine: "); 
				immmatriculation = scan.nextLine();
	}
	public static void makeTrip ()
	{
		       //méthode qui permet d'associer un chauffeur à une limousine pour un trajet donné
				//checkin approach , coherence verification?
				//faut il prendre en compte le retour??
				// ie est ce qu'on suppose que si la compagnie active la reservation
				//cela suppose qu'on est dans l'entrepot?
				
				Chauffeur chauffeur = new Chauffeur(chauffeurNom,chauffeurPrenom,anneeEmbauche,lieuDestination);
				String identifiantChauffeur = chauffeur.getIdentifiant(); 
				Trajet trajet = new Trajet(identifiantChauffeur,lieuDepart, lieuDestination);
				Limousine limousine = new Limousine(identifiantChauffeur, immmatriculation);
				String msgReservation = "Le chauffeur d\'ID: " + identifiantChauffeur + " est réservé pour le trajet de ";
				msgReservation += lieuDepart + " à " + lieuDestination;
				System.out.println(msgReservation);
				limousine.updateInfo(identifiantChauffeur);
				trajet.commit(identifiantChauffeur);	
		
	}	
	public static void main(String[] args)
	{
		Compagnie.makeReservation();
		Compagnie.makeTrip();
		
	}
}
