//*****************************************************************************
// Ecole.java              Auteur: Herimanitra RANAIVOSON, COURS:INF1002-HW2
//Réalisation d'une classe Ecole avec des methodes
//*****************************************************************************


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ecole {
	// variable d instance:
	private static String nom;
	private static String ville;
	private static int nbEleve;
	private static Date annee;
	enum Type  {primaire, secondaire, specialise}
	//
	//---------------------------------
	//Constructeur pour la classe Ecole:
	//---------------------------------
	public Ecole() throws ParseException  {
		nom = "uqtr";
		ville="trois-rivieres";
		nbEleve=10000;
		SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd");
		annee= DateFormat.parse("2016-01-01");
		Type mytype = Type.secondaire;
	}
	
	//--------------------------
	//Mutateur pour le nom de l'ecole
	//-------------------------
	public void setNom (String value) {
		nom= value;
	}
		
	//--------------------------
	//Accesseur pour le nom d'ecole
	//------------------------
	public String getNom() {
		return nom;
	}
	
	//--------------------------
	//Mutateur pour le nom de ville
	//-------------------------
	public void setVille (String value) {
		ville= value;
	}
	
	//--------------------------
	//Accesseur pour le nom de la ville
	//------------------------
	public String getVille() {
		return ville;
	}
		
	//--------------------------
	//Mutateur pour le Nb. Elèves
	//-------------------------
	public void setNbEleve (int value) {
		nbEleve= value;
	}
	
	//--------------------------
	//Accesseur pour le Nb. Elèves
	//------------------------
	public int getNbEleve() {
		return nbEleve;
	}
	
	
	//-------------------------
	//Accesseur pour la variable: annee
	//-------------------------
	public Date getAnnee() {
		return annee;
	}
	
	
	
	//-------------------------------
	// méthode conversion en string:
	//-------------------------------
	public String toString (int input) {
		return String.valueOf(input);
	}
	
	//Test des methodes de la classe:
	public static void main(String[] args) throws ParseException {
		Ecole myecole = new Ecole();
		System.out.println( myecole.toString(10) );
		System.out.println( myecole.getAnnee() );
		myecole.setNbEleve(15000) ;
		System.out.println(myecole.getNbEleve() );
	}
}
