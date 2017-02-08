import java.util.ArrayList;
import java.util.Scanner;

/*
 * Compagnie.java representation de la Compagnie , par Herimanitra RANAIVOSON
 * possede une liste de chauffeurs,limousines et historiques de ses activites(trajets)
 * les donnees de nouvelles reservations sont entrees au clavier
*/

public class Compagnie {
	
	private static String chauffeurNom;
	private static String chauffeurPrenom;
	private static String anneeEmbauche;
	private static String lieuDepart;
	private  String immatriculation;
	private static String color;
	private static Scanner scan;
	private static String lieuDestination;
	private double reservoir,longTrjet;
	private int nbpass;
	
	ArrayList<Chauffeur> chauffeurList ;
	Chauffeur chauffeur;
	ArrayList<Limousine> limousineList ;
	Limousine limousine;
	ArrayList<Trajet> trajetHistorique;
	Trajet trajet;
	
	public Compagnie () 
	{
		// initialisation:
		chauffeur = new Chauffeur("Eric","Jean","2012","2900 Fortin");
		trajet = new Trajet(chauffeur.getIdentifiant(),"shawinigan","Quebec city");
		limousine = new Limousine(chauffeur.getIdentifiant(),"5619TBC",95,"bleu",2,10);
		
		limousineList= new ArrayList<Limousine>();
		trajetHistorique= new ArrayList<Trajet>();		
		chauffeurList = new ArrayList<Chauffeur>();
		
		//insertion dans la BD de la compagnie:
		chauffeurList.add(chauffeur);
		trajetHistorique.add(trajet);
		limousineList.add(limousine);
		
	}
	
	public void makeReservation()
	{
		//entre les inputs:
		scan = new Scanner(System.in);  
		System.out.println("Entrez le nom du chauffeur: "); 
		chauffeurNom = scan.nextLine();
		System.out.println("Entrez le prenom du chauffeur: "); 
		chauffeurPrenom = scan.nextLine();
		System.out.println("Entrez l\'annee d`'embauche du chauffeur: "); 
		anneeEmbauche = scan.nextLine() ;
		System.out.println("Entrez le lieu de depart: "); 
		lieuDepart = scan.nextLine();		
		System.out.println("Entrez le lieu de destination: "); 
		lieuDestination = scan.nextLine();
		System.out.println("Entrez le numero d\'immatriculation de la limousine: "); 
		immatriculation = scan.nextLine();	
		System.out.println("Entrez la couleur de la limousine: "); 
		color = scan.nextLine();	
		System.out.println("Entrez la capacite du reservoir: "); 
		reservoir =Double.parseDouble( scan.nextLine());	
		System.out.println("Entrez la longeur du trajet en km: "); 
		longTrjet =Double.parseDouble( scan.nextLine());	
		System.out.println("Entrez le nombre de passagers: "); 
		nbpass =Integer.parseInt( scan.nextLine());	
	}
	public void displayConfirmationMsg()
	{
		String msgReservation = "Le chauffeur : " + chauffeurNom + " " + chauffeurPrenom + " est reserve pour le trajet de ";
		msgReservation += lieuDepart + " a  " + lieuDestination;
		System.out.println(msgReservation);
	}
	public void makeTrip() 
	{
		Chauffeur chauffeur = new Chauffeur(chauffeurNom,chauffeurPrenom,anneeEmbauche,lieuDestination);
		String identifiantChauffeur = chauffeur.getIdentifiant(); 
		//attribution du trajet au chauffeur:
		Trajet trajet = new Trajet(identifiantChauffeur,lieuDepart, lieuDestination);
		Limousine limousine = new Limousine(identifiantChauffeur,immatriculation, reservoir, color,nbpass, longTrjet);		
		//save trip data:
		chauffeurList.add(chauffeur);
		trajetHistorique.add(trajet);
		limousineList.add(limousine);
	}
	
	public void findLimousineByChauffeur(String nom, String prenom, String annee)
	{
		String nameChauff=nom.substring(0,3) + prenom.substring(1) + annee.substring(2,4) ;
		for ( int k=0; k<limousineList.size();k++)
		{
			Limousine X = limousineList.get(k);
			ArrayList<String> chauffeur = X.getIdChauffeur();
			ArrayList<String> immatriculation = X.getImmatriculation();
			int mysize = immatriculation.size();
			boolean hasDrived=false;
			for ( int u=0; u<mysize; u++) 
			{
				if ( chauffeur.get(u).equals(nameChauff) ) 
				{
					System.out.println(nameChauff+ " a conduit la limousine d\'immatriculation: " +  immatriculation.get(u) );
					hasDrived=true;
				} 
			}
			if (hasDrived == false )
			{
				System.out.println("Aucune historique de trajets pour: " + nameChauff);
			}
		}
	}
}
