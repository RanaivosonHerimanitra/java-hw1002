/*
 * Chauffeur.java créée par Herimanitra RANAIVOSON pour le DEVOIR1 INF1004
 * Son constructeur implemente  l'assignation de l'identifiant
 */

public class Chauffeur 
{
	private static String nom;
	private static String prenom;
	private static String anneeEmbauche;
	private static String adresse;
	private static String identifiant;
	private static String trajet;
	
	//constructeur
    public Chauffeur (String nom, String prenom, String annee, String mytrajet)
    {
    	identifiant= nom.substring(0,3) + prenom.substring(1) + annee.substring(2,4) ;
    	setNom(nom);
    	setPrenom(prenom);
    	setAnnee(annee);
    	setTrajet(mytrajet);
    	
    }
	//setters:
	public static void setNom(String value)
	{
		nom= value;
	}
	public static void setPrenom(String value)
	{
		prenom= value;
	}
	public static void setAnnee(String value)
	{
		anneeEmbauche= value;
	}
	//les getters:
	public String getIdentifiant ()
	{
		return identifiant;
	}
	public String getNom ()
	{
		return nom;
	}
	public String getPrenom ()
	{
		return prenom;
	}
	public String getAnneeEmbauche ()
	{
		return anneeEmbauche;
	}
	public String getAdresse ()
	{
		return adresse;
	}
	public static String getTrajet() {
		return trajet;
	}
	public static void setTrajet(String trajet) {
		Chauffeur.trajet = trajet;
	}
	
}
