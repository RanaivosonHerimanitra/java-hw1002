import java.util.ArrayList;
import java.util.Scanner;

/*
 * Compagnie.java Compagnie representation, par Herimanitra RANAIVOSON
 * possède une liste de chauffeur, une liste de voiture, un historique de trajets
*/

public class Compagnie {
	
	private static String chauffeurNom;
	private static String chauffeurPrenom;
	private static String anneeEmbauche;
	private static String lieuDepart;
	private  String immatr;
	private static String color;
	private static Scanner scan;
	private static String lieuDestination;
	private double reservoir,longTrjet;
	
	ArrayList<Chauffeur> chauffeurList ;
	Chauffeur chauffeur;
	ArrayList<Limousine> limousineList ;
	Limousine limousine;
	ArrayList<Trajet> trajetHistorique;
	Trajet trajet;
	
	public Compagnie () {
		
		// initialisation:
		chauffeur = new Chauffeur("Eric","Jean","2012","2900 Fortin");
		trajet = new Trajet(chauffeur.getIdentifiant(),"shawinigan","Quebec city");
		limousine = new Limousine("5619TBC",95,"bleu",12);
		
		limousineList= new ArrayList<Limousine> ();
		trajetHistorique= new ArrayList<Trajet>();		
		chauffeurList = new ArrayList<Chauffeur>();
		
		//insertion dans la BD de la compagnie:
		trajetHistorique.add(trajet);
		limousineList.add(limousine);
		chauffeurList.add(chauffeur);
		
	}
	public void makeReservation()
	{
		//scan inputs:
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
		immatr = scan.nextLine();	
		System.out.println("Entrez la couleur de la limousine: "); 
		color = scan.nextLine();	
		System.out.println("Entrez la capacite du reservoir: "); 
		reservoir =Double.parseDouble( scan.nextLine());	
		System.out.println("Entrez la duree du trajet: "); 
		longTrjet =Double.parseDouble( scan.nextLine());	
	}
	public void makeTrip() {
		
		Chauffeur chauffeur = new Chauffeur(chauffeurNom,chauffeurPrenom,anneeEmbauche,lieuDestination);
		String identifiantChauffeur = chauffeur.getIdentifiant(); 
		Trajet trajet = new Trajet(identifiantChauffeur,lieuDepart, lieuDestination);
		Limousine limousine = new Limousine(identifiantChauffeur, reservoir, color,longTrjet);
		String msgReservation = "Le chauffeur d\'ID: " + identifiantChauffeur + " est réservé pour le trajet de ";
		msgReservation += lieuDepart + " à " + lieuDestination;
		System.out.println(msgReservation);
		
		chauffeurList.add(chauffeur);
		trajetHistorique.add(trajet);
		limousineList.add(limousine);
	}
	public void getLimousineByChauffeur(String name)
	{
		for ( int k=0; k<limousineList.size();k++)
		{
			Limousine X = limousineList.get(k);
			System.out.println(X.getImmatriculation());
			System.out.println(X.getCompteur());
			System.out.println(X.getCouleur());
		}
	}
	

}
