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
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

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
		String id = "Eric".substring(0,3) + "Jean".charAt(0) + "2012".substring(2,4);
		trajet = new Trajet(id,"shawinigan","Quebec city",50000,10.);
		limousine = new Limousine(id,"5619TBC",95,"bleu",2,10);
		
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
	public void makeReservation(String indexChauff) throws ImmatriculationNullException 
	{
		
		scan = new Scanner(System.in);  
		
		//si chauffeur entre au clavier:
		if ( indexChauff.equals("") )
		{
			System.out.println("Entrez le nom du chauffeur (pour la reservation): "); 
			chauffeurNom = scan.nextLine();
			System.out.println("Entrez le prenom du chauffeur: "); 
			chauffeurPrenom = scan.nextLine();
			System.out.println("Entrez l\'annee d`'embauche du chauffeur: "); 
			anneeEmbauche = scan.nextLine() ;
		//sinon recuperation d'un chauffeur existant:
		//puis assignation au trajet qui doit etre defini:
		} else {
			chauffeurNom=getchauffeurNomById(indexChauff);
			chauffeurPrenom=getchauffeurPrenomById(indexChauff);
			anneeEmbauche=getchauffeurAnneeEmbaucheById(indexChauff);
			System.out.println(chauffeurNom + " " + chauffeurPrenom + " " + anneeEmbauche );
		}
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
	// get prenom chauffeur by Id 
	private String getchauffeurPrenomById(String indexChauff) {
		
		ArrayList<String> idList=new ArrayList<>();
		ArrayList<String> prenomList=new ArrayList<>();
		int myindex=-1;
		for ( int k=0; k<chauffeurList.size();k++)
		{
			idList = chauffeurList.get(k).getIdentifiant();
			prenomList = chauffeurList.get(k).getPrenom();
			for (int p =0; p<idList.size();p++)
			{
				if (idList.get(p).equals(indexChauff))
				{
					myindex=p;
					break; 
				}
			}
		}
		return prenomList.get(myindex);
	}
    // get nom chauffeur by Id chauff:
	private String getchauffeurNomById (String indexChauff) {
		ArrayList<String> idList=new ArrayList<>();
		ArrayList<String> nomList=new ArrayList<>();
		int myindex=-1;
		for ( int k=0; k<chauffeurList.size();k++)
		{
			idList = chauffeurList.get(k).getIdentifiant();
			nomList=chauffeurList.get(k).getNom();
			for (int p =0; p<idList.size();p++)
			{
				if (idList.get(p).equals(indexChauff))
				{
					myindex=p;
					break; 
				}
			}
		}
		return nomList.get(myindex);
	}
    // get annee embauche by id chauffeur:
	private String getchauffeurAnneeEmbaucheById(String indexChauff) {
		ArrayList<String> idList=new ArrayList<>();
		ArrayList<String> annee=new ArrayList<>();
		
		int myindex=-1;
		for ( int k=0; k<chauffeurList.size();k++)
		{
			idList = chauffeurList.get(k).getIdentifiant();
			annee=chauffeurList.get(k).getAnneeEmbauche();
			for (int p =0; p<idList.size();p++)
			{
				if (idList.get(p).equals(indexChauff) )
				{
					myindex=p;
					break; 
				}
			}
		}
		return annee.get(myindex);
	}

	//----------------------------------------------
	// message to confirm reservation
	//----------------------------------------------
	public void displayConfirmationMsg()
	{
		String msgReservation = "*Le chauffeur : " + chauffeurNom + " " + chauffeurPrenom + " est reserve pour le trajet de ";
		msgReservation += lieuDepart + " a " + lieuDestination;
		System.out.println(msgReservation);
	}
	
	//----------------------------------------------
	// run the actual trip!
	//----------------------------------------------
	public void makeTrip() throws InconsistentYear, InconsistentTrajet
	{
		Chauffeur chauffeur = new Chauffeur(chauffeurNom,chauffeurPrenom,anneeEmbauche,lieuDestination);
		String identifiantChauffeur = chauffeurNom.substring(0,3) + chauffeurPrenom.charAt(0) + anneeEmbauche.substring(2,4);
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
			System.out.println("*Aucune historique de trajets pour: " + idChauff);
		}
	}
	//
	// retrieve List of existing  chauffeur
	//
	public void getListChauffeur()
	{
		ArrayList<String> chauff=new ArrayList<>();
		ArrayList<String> Allchauff=new ArrayList<>();
		for ( int k=0; k<trajetHistorique.size();k++)
		{
			chauff = trajetHistorique.get(k).getIdChauffeur();
			for (int i=0;i < chauff.size(); i++)
			{
				Allchauff.add(chauff.get(i));
			}
		}
		//unique:
		Set<String> chauffUnique = new HashSet<>(Allchauff);
		List<String> mylistchauff = new ArrayList<>(chauffUnique);
		for ( int i=0; i<mylistchauff.size();i++)
		{
		System.out.println("Taper "+ mylistchauff.get(i) + " au clavier pour le chauffeur d\'ID " + mylistchauff.get(i) );	
		}
		
		
	}
	//----------------------------------------------
	//retrieve data related to a given Trajet ....
	// and display nice message to the screen
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
				String mymsg="*Le trajet de " + lieuDep.get(u) + " pour " + lieuDest.get(u) +"\n";
				mymsg += " d\'une longueur de " + longr.get(u) + " km" +"\n";
				mymsg += " a ete effectue par le chauffeur ID: " + chauff.get(u) +"\n" ;
				mymsg += ", le kilometrage de depart de la limousine etait de: " + kDep.get(u) +"\n";
				mymsg +=", apres ce trajet, il est de: "+ kArr.get(u) +"\n";
				System.out.println(mymsg);
			}
		}
	}
}
