
import java.util.Scanner;

public class Compagnie {
	private static String chauffeurNom;
	private static String chauffeurPrenom;
	private static String anneeEmbauche;
	private static String lieuDepart ;
	private static String lieuDestination;
	private static String immmatriculation ;
	private static Scanner scan;
	
	
	public static void reservation ()
	{
		//methode qui permet d'associer un chauffeur(dispo?) à une limousine (dispo?) pour un trajet donné
		//checkin approach , coherence verification?
		//initialise une instance chauffeur:
		//recupère son identifiant:
		//initialise une instance de trajet:
		//faut il prendre en compte le retour??
		// ie est ce qu'on suppose que si la compagnie active la reservation
		//cela suppose qu'on est dans l'entrepot?
		
		Chauffeur chauffeur = new Chauffeur(chauffeurNom,chauffeurPrenom,anneeEmbauche,lieuDestination);
		String identifiantChauffeur = chauffeur.getIdentifiant(); 
		Trajet trajet = new Trajet(identifiantChauffeur,lieuDepart, lieuDestination);
		Limousine limousine = new Limousine(identifiantChauffeur, immmatriculation);
		chauffeur.updateProfile(lieuDestination);
		limousine.updateInfo(identifiantChauffeur);
		trajet.commit(identifiantChauffeur);
		
	}
	
	public static void main(String[] args)
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
		
		Compagnie.reservation();
	}
}
