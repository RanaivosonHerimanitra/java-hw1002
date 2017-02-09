//*****************************************************************************
// Ecole.java              Auteur: Herimanitra RANAIVOSON, COURS:INF1002-HW2
//Réalisation d'une classe Ecole avec des methodes getters and setters
//*****************************************************************************

public class Ecole {
	
	private  String nomEcole;
	private  String nomVille;
	private  int nbEleve;
	private  int anneeCreation;
	private enum Type  {primaire, secondaire, specialise};
	private Type type;  
	
	//---------------------------------------------------------------
	//Constructeur
	//---------------------------------------------------------------
	public Ecole()   {
		nomEcole = "uqtr";
		nomVille="trois-rivieres";
		nbEleve=10000;
		anneeCreation= 2015;
		type = Type.secondaire;
	}
	
	//-------------------------------------------------------------------
	//Mutateur pour le nom d Ecole
	//-------------------------------------------------------------------
	public void setNomEcole (String value) {
		nomEcole= value;
	}
	
	//-------------------------------------------------------------------
	//Mutateur pour le nom de Ville
	//-------------------------------------------------------------------
	public void setNomVille (String value) {
		nomVille= value;
	}
	
	//-------------------------------------------------------------------
	//Mutateur pour annee de creation
	//-------------------------------------------------------------------
	public void setAnneeCreation (int value) {
		anneeCreation= value;
	}
	
	//-------------------------------------------------------------------
	//Mutateur pour le type Etablissement
	//-------------------------------------------------------------------
	public void setType (String value) {
		this.type= Type.valueOf(value);
	}
		
	//-------------------------------------------------------------------
	//Mutateur pour le Nb. Elèves
	//-------------------------------------------------------------------
	public void setNbEleve (int value) {
		nbEleve= value;
	}
	
	//--------------------------------------------------------------------
	//Accesseur pour le Nb. Elèves pour le test
	//--------------------------------------------------------------------
	public int getNbEleve() {
			return nbEleve;
	}	
		
	//--------------------------------------------------------------------
	//Accesseur pour Année de creation
	//--------------------------------------------------------------------
	public int getAnneeCreation() {
		return anneeCreation;
	}
	
	//--------------------------------------------------------------------
	//accesseur noms Ecole,Ville pour le test
	//--------------------------------------------------------------------
	public String getNomEcole() {
		return nomEcole;
	}
	public String getNomVille() {
		return nomVille;
	}
	
	//--------------------------------------------------------------------
	// méthode pour obtenir des infos de cette classe
	//--------------------------------------------------------------------
	public String toString () {
		String myMsg="Nom de l\'Ecole: "+ nomEcole + "\n";
		myMsg +="Nom de la Ville: "+ nomVille + "\n";
		myMsg += "Type Etablissement (primaire-secondaire-specialise): "+ type + "\n";
		myMsg += "Nombre d\'eleves: "+ nbEleve + "\n";
		myMsg += "Annee Creation: "+ anneeCreation;
		return myMsg;
	} 
}

