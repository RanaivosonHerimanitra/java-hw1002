/*
 * Compagnie.java representation de la Compagnie , par Herimanitra RANAIVOSON IINF1004-Devoir1
 * possede une liste de chauffeurs,
 * limousines et historiques de ses activites(trajets)
 * les donnees de nouvelles reservations sont entrees au clavier
 * 03 exceptions definies:
 * (1) si l'annee d'embauche superieure a l'annee courante
 * (2a) si le reservoir de la limousine est vide (=0.)
 * (2b) si le lieu de depart egal au lieu d arrivee
 * (3) l immatriculation ne doit pas etre laisser vide
*/
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Compagnie {
	
	private  String chauffeurNom;
	private  String chauffeurPrenom;
	private  String anneeEmbauche;
	private  String lieuDepart;
	private  String immatriculation;
	private  String color;
	private  Scanner scan;
	private  String lieuDestination;
	private double reservoir,kmDep, longTrjet;
	private int nbpass;
	
	ArrayList<Chauffeur> chauffeurList ;
	Chauffeur chauffeur;
	ArrayList<Limousine> limousineList ;
	Limousine limousine;
	ArrayList<Trajet> trajetHistorique;
	Trajet trajet;
	
	public Compagnie () throws EmptyLimousineException , InconsistentYear, InconsistentTrajet
	{
		// initialisation pour tester les specs du devoir:
		chauffeur = new Chauffeur("Eric","Jean","2012","2900 Fortin");
		trajet = new Trajet(chauffeur.getIdentifiant(),"shawinigan","Quebec city",50000,10.);
		limousine = new Limousine(chauffeur.getIdentifiant(),"5619TBC",95,"bleu",2,10);
		
		limousineList= new ArrayList<Limousine>();
		trajetHistorique= new ArrayList<Trajet>();		
		chauffeurList = new ArrayList<Chauffeur>();
		
		//insertion dans la BD de la compagnie:
		chauffeurList.add(chauffeur);
		trajetHistorique.add(trajet);
		limousineList.add(limousine);
		
	}
	
	//----------------------------------------------
	//allow us to enter data from a user reservation
	//----------------------------------------------
	public void makeReservation() throws ImmatriculationNullException 
	{
		
		scan = new Scanner(System.in);  
		System.out.println("Entrez le nom du chauffeur (pour la reservation): "); 
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
		if (immatriculation.isEmpty() || immatriculation.equals("") )
		{
			throw new ImmatriculationNullException();
		}
		System.out.println("Entrez la couleur de la limousine: "); 
		color = scan.nextLine();	
		System.out.println("Entrez le kilometrage de la limousine: "); 
		kmDep = Double.parseDouble(scan.nextLine());	
		System.out.println("Entrez la capacite du reservoir: "); 
		reservoir =Double.parseDouble( scan.nextLine());
		System.out.println("Entrez la longeur du trajet en km: "); 
		longTrjet =Double.parseDouble( scan.nextLine());	
		System.out.println("Entrez le nombre de passagers: "); 
		nbpass =Integer.parseInt( scan.nextLine());	
	}
	
	//----------------------------------------------
	// message to confirm reservation
	//----------------------------------------------
	public void displayConfirmationMsg()
	{
		String msgReservation = "Le chauffeur : " + chauffeurNom + " " + chauffeurPrenom + " est reserve pour le trajet de ";
		msgReservation += lieuDepart + " a " + lieuDestination;
		System.out.println(msgReservation);
	}
	
	//----------------------------------------------
	// run the actual trip!
	//----------------------------------------------
	public void makeTrip() throws InconsistentYear, InconsistentTrajet
	{
		Chauffeur chauffeur = new Chauffeur(chauffeurNom,chauffeurPrenom,anneeEmbauche,lieuDestination);
		String identifiantChauffeur = chauffeur.getIdentifiant(); 
		//attribution du trajet au chauffeur:
		Trajet trajet = new Trajet(identifiantChauffeur,lieuDepart, lieuDestination,kmDep,longTrjet);
		try {
			Limousine limousine = new Limousine(identifiantChauffeur,immatriculation, reservoir, color,nbpass, longTrjet);	
			//save trip data:
			chauffeurList.add(chauffeur);
			trajetHistorique.add(trajet);
			limousineList.add(limousine);
		}
		catch (EmptyLimousineException e1)
		{
			System.out.println(e1);
		}
		
	}
	
	//-----------------------------------
	//get last entered chauffeurNom (for testing purpose)
	//-----------------------------------
	public String getLastEnteredNom()
	{
		return chauffeurNom;
	}
	//-----------------------------------
	// get last entered chauffeurPrenom (for testing purpose)
	//-----------------------------------
	public String getLastEnteredPrenom()
	{
		return chauffeurPrenom;
	}
	//-----------------------------------
	// get annee embauche (for testing purpose)
	//-----------------------------------
	public String getLastEnteredAnneeEmbauche()
	{
		return anneeEmbauche;
	}
	
	//-----------------------------------
	// retrieve historic of all Limousine
	//-----------------------------------
	public void findLimousineByChauffeur(String nom, String prenom, String annee)
	{
		//construction de ID:
		String idChauff=nom.substring(0,3) + prenom.charAt(0) + annee.substring(2,4) ;
		boolean hasDrived=false;
		for ( int k=0; k<limousineList.size();k++)
		{
			Limousine X = limousineList.get(k);
			ArrayList<String> chauffeur = X.getIdChauffeur();
			ArrayList<String> immatriculation = X.getImmatriculation();
			int mysize = immatriculation.size();
			for ( int u=0; u<mysize; u++) 
			{
				if ( chauffeur.get(u).equals(idChauff) ) 
				{
					System.out.println(idChauff+ " a conduit la limousine d\'immatriculation: " +  immatriculation.get(u) );
					hasDrived=true;
				} 
			}
		}
		if (hasDrived == false )
		{
			System.out.println("Aucune historique de trajets pour: " + idChauff);
		}
	}
	
	//----------------------------------------------
	//retrieve data related to a given Trajet ....
	//----------------------------------------------
	public void getAllTrajet()
	{
		for ( int k=0; k<trajetHistorique.size();k++)
		{
			ArrayList<String> chauff = trajetHistorique.get(k).getIdChauffeur();
			ArrayList<String> lieuDep=  trajetHistorique.get(k).getLieuDepart();
			ArrayList<String> lieuDest=  trajetHistorique.get(k).getLieuDestination();
			List<Double> longr = trajetHistorique.get(k).getLongueurTrajet();
			List<Double> kDep = trajetHistorique.get(k).getkmDepart();
			List<Double> kArr = trajetHistorique.get(k).getkmArrive();
			int mysize = chauff.size();
			for (int u=0; u<mysize ;u++)
			{
				String mymsg="Le trajet de " + lieuDep.get(u) + " a " + lieuDest.get(u);
				mymsg += " d\'une longueur de " + longr.get(u) + " km";
				mymsg += " a ete effectue par le chauffeur ID: " + chauff.get(u) ;
				mymsg += ", le kilometrage de depart de la limousine etait de: " + kDep.get(u);
				mymsg +=", apres ce trajet, il est de: "+ kArr.get(u);
				System.out.println(mymsg);
			}
		}
	}
}
