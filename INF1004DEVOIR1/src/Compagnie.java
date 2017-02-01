
import java.util.Scanner;

public class Compagnie {
	
	private static Scanner scan;

	//methode qui permet d'associer un chauffeur(dispo?) à une limousine (dispo?) pour un trajet donné
	public static void reservation (Chauffeur chauffeur, Trajet trajet, Limousine limousine)
	{
		//checkin approach , coherence verification?
	}
	//PROCESS: entrée des données par l'user, reservation, conduit, trajet terminé
	public static void main(String[] args)
	{
		
		scan = new Scanner(System.in);  
		
		//Nom du chauffeur:
		System.out.println("Entrez le nom du chauffeur: "); 
		String chauffeurNom = scan.toString();
		
		
		//Prenom du chauffeur:
		System.out.println("Entrez le prénom du chauffeur: "); 
		String chauffeurPrenom = scan.toString();
		
		
		//Date  chauffeur:
		System.out.println("Entrez l\'année d`'embauche du chauffeur: "); 
		int anneeEmbauche = scan.nextInt();
		//initialise une instance chauffeur:
		Chauffeur chauffeur = new Chauffeur(chauffeurNom,chauffeurPrenom,anneeEmbauche);
		
		//recupère l\'identifiant du chauffeur:
		String identifiantChauffeur = chauffeur.getIdentifiant(); 
		//Lieu de départ:
		System.out.println("Entrez le lieu de départ: "); 
		String lieuDepart = scan.toString();		
		//Lieu  destination:
		System.out.println("Entrez le lieu de destination: "); 
		String lieuDestination = scan.toString();
		//initialise une instance de trajet:
		Trajet trajet = new Trajet(identifiantChauffeur,lieuDepart, lieuDestination);
		
		//Numero d\'immatriculation de la limousine:
		System.out.println("Entrez le numero d\'immatriculation de la limousine: "); 
		String immmatriculation = scan.toString();
		Limousine limousine = new Limousine(identifiantChauffeur, immmatriculation);
		
		
		Compagnie.reservation(chauffeur, trajet, limousine);
		chauffeur.conduit();
		trajet.commit();
		//faut il prendre en compte le retour??
		// ie est ce qu'on suppose que si la compagnie active la reservation
		//cela suppose qu'on est dans l'entrepot?
	}
}
