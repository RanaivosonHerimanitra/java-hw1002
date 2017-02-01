/*
 * Chauffeur.java créée par Herimanitra RANAIVOSON pour le DEVOIR1 INF1004
 * Son constructeur implemente  l'assignation de l'identifiant
 * Elle comprend notamment une methode updateProfile() qui permet de conserver l'historique 
 * des trajets effectués par un chauffeur donné
 */

public class Chauffeur 
{
	private static String nom;
	private static String prenom;
	private static String anneeEmbauche;
	private static String adresse;
	private static 	String [] trajetList;
	private static String identifiant;
	private static int n; 
	
	//constructeur
    public Chauffeur (String nom, String prenom, String annee, String mytrajet)
    {
    	identifiant= nom.substring(0,2) + prenom.substring(0) + annee.substring(2,3) ;
    	n=0;
    	trajetList = new String [500];
    	trajetList[n]=mytrajet;
    	n++;
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
	//
	public void updateProfile(String mytrajet)
	{
		trajetList[n]=mytrajet;
    	n++;	
	}
}
