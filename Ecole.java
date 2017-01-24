//*****************************************************************************
// Ecole.java              Auteur: Herimanitra RANAIVOSON, COURS:INF1002-HW2
//Réalisation d'une classe Ecole avec des methodes
//*****************************************************************************


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ecole {
	// variable d'instance:
	private static String nomEcole;
	private static String nomVille;
	private static int nbEleve;
	private static Date anneeCrea;
	public enum Type  {primaire, secondaire, specialise};
	private static Type type;    
	//
	//---------------------------------
	//Constructeur pour la classe Ecole:
	//---------------------------------
	public Ecole() throws ParseException  {
		nomEcole = "uqtr";
		nomVille="trois-rivieres";
		nbEleve=10000;
		SimpleDateFormat DateFormat = new SimpleDateFormat("yyyy-MM-dd");
		anneeCrea= DateFormat.parse("2016-01-01");
		type = Type.secondaire;
	}
	
	//------------------------------------------------------------------------------
	//Mutateur pour le nom de l'ecole
	//-----------------------------------------------------------------------------
	public void setNomEcole (String value) {
		nomEcole= value;
	}
		
	//------------------------------------------------------------------------------
	//Accesseur pour le nom d'ecole
	//----------------------------------------------------------------------------
	public String getNomEcole() {
		return nomEcole;
	}
	
	//------------------------------------------------------------------------------
	//Mutateur pour le nom de ville
	//-----------------------------------------------------------------------------
	public void setNomVille (String value) {
		nomVille= value;
	}
	
	//------------------------------------------------------------------------------
	//Accesseur pour le nom de la ville
	//----------------------------------------------------------------------------
	public String getNomVille() {
		return nomVille;
	}
		
	//------------------------------------------------------------------------------
	//Mutateur pour le Nb. Elèves
	//-----------------------------------------------------------------------------
	public void setNbEleve (int value) {
		nbEleve= value;
	}
	
	//------------------------------------------------------------------------------
	//Accesseur pour le Nb. Elèves
	//----------------------------------------------------------------------------
	public int getNbEleve() {
		return nbEleve;
	}
	
	//Il faudrait un setAnneeCrea pour tester....
	
	//-----------------------------------------------------------------------------
	//Accesseur pour la variable: annee de creation
	//-----------------------------------------------------------------------------
	public Date getAnneeCrea() {
		return anneeCrea;
	}
	
	
	
	//------------------------------------------------------------------------------
	// méthode conversion en string: (A REVOIR CAR DEVRAIT PRENDRE TOUS LES VAR)
	//------------------------------------------------------------------------------
	public String toString (int input) {
		return String.valueOf(input);
	}
	
	//-----------------------------------------------
	// Accesseur pour le Type de programme de l'école
	//-----------------------------------------------
	public Type getType() {
		return type; 
	}
	public void setType(Type type) {
		Ecole.type = type;
	}   
	
	//Test des methodes de la classe:
	public static void main(String[] args) throws ParseException {
		Ecole myecole = new Ecole();
		System.out.println( myecole.toString(10) );
		System.out.println( myecole.getAnneeCrea() );
		myecole.setNbEleve(15000) ;
		System.out.println(myecole.getNbEleve() );
		System.out.println( myecole.getType() );
		myecole.setType(Type.primaire);
		System.out.println( myecole.getType() );
	}
}
