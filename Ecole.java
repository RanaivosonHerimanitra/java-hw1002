import java.util.Date;

public class Ecole {
	private String nom;
	private String ville;
	private int nbeleve;
	private Date annee;
	enum Type  {primaire, secondaire, specialise}

	//--------------------
	//Constructeur pour la classe Ecole:
	//--------------------
	public Ecole Ecole() {
		nom = "uqtr";
		ville="trois-rivieres";
		nbeleve=10000;
		annee="1985/12/12";
		Type="3";
	}
	//------------------
	//Mutateur pour le Nb Elèves
	//------------------
	public void setNbEleve (int value) {
		nbeleve= value;
	}
	//
	//
	//
	public Date getAnnee() {
		return annee;
	}

	public String toString (int input) {
		return String.valueOf(input);
	}

}
//Écrire un programme qui teste toutes les méthodes de la classe.
