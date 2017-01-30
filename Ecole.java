//*****************************************************************************
// Ecole.java              Auteur: Herimanitra RANAIVOSON, COURS:INF1002-HW2
//Réalisation d'une classe Ecole avec des methodes et tests de ces methodes
//*****************************************************************************


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ecole {
	// variable d'instance:
	private static String nomEcole;
	private static String nomVille;
	private static int nbEleve;
	private static Date anneeCreation;
	private enum Type  {primaire, secondaire, specialise};
	private Type type;
	private Ecole myecole;    
	
	//---------------------------------------------------------------
	//Constructeur pour la classe Ecole:
	//---------------------------------------------------------------
	public Ecole() throws ParseException  {
		nomEcole = "uqtr";
		nomVille="trois-rivieres";
		nbEleve=10000;
		SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-mm-dd");
		anneeCreation= DateFormat.parse("2016-01-01");
		type = Type.secondaire;
	}
	
	//-------------------------------------------------------------------
	//Mutateur pour le Nb. Elèves
	//-------------------------------------------------------------------
	public void setNbEleve (int value) {
		nbEleve= value;
	}
	
	//--------------------------------------------------------------------
	//Accesseur pour le Nb. Elèves (pour tester dans Main)
	//--------------------------------------------------------------------
	public int getNbEleve() {
			return nbEleve;
	}	
		
	//--------------------------------------------------------------------
	//Accesseur pour Année de creation
	//--------------------------------------------------------------------
	public Date getAnneeCreation() {
		return anneeCreation;
	}	
	
	//--------------------------------------------------------------------
	// méthode conversion en String de n'importe quelle var.
	//--------------------------------------------------------------------
	public String toString () {
		//est-ce correct?
		try {
			this.myecole = new Ecole();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String myMsg="Nom de l\'Ecole: "+ myecole.getNomEcole() + "\n";
		myMsg +="Nom de la Ville: "+ myecole.getNomVille() + "\n";
		myMsg += "Conversion Type Etab.: "+ myecole.type + "\n";
		myMsg += "Conversion Annee Crea.: "+ myecole.getAnneeCreation();
		return myMsg;
	} 
	
	//--------------------------------------------------------------------
	//accesseur noms Ecole,Ville pour pouvoir tester après:
	//--------------------------------------------------------------------
	public String getNomEcole() {
		return nomEcole;
	}
	public String getNomVille() {
		return nomVille;
	}
	
	//Test des méthodes de la classe:
	//--------------------------------------------------------------------
	public static void main(String[] args) throws ParseException {
		Ecole myecole = new Ecole();
		
		//accesseur annee creation:
		System.out.println("Annee de creation(accesseur): " + myecole.getAnneeCreation() );
		
		//voir valeur par defaut:
		System.out.println("Nb. Eleve par defaut: " + myecole.getNbEleve()) ;
		
		//mutateur pour le Nb Eleve:
		myecole.setNbEleve(15000) ;
		
		//voir le changement:
		System.out.println("Nb. Eleve apres mutation: " + myecole.getNbEleve()) ;
		
		//test de la methode toString:
		System.out.println(myecole.toString());

		
	}
}

