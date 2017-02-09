import java.util.Calendar;

/*
 * Chauffeur.java, par Herimanitra RANAIVOSON pour le DEVOIR1 INF1004
 * Son constructeur implemente  l'assignation de l'identifiant avec setIdentifiant
 */

public class Chauffeur 
{
	private static String nom;
	private static String prenom;
	private static String anneeEmbauche;
	private static String adresse;
	private static String identifiant;
	private static String trajet;
	
	//constructor
    public Chauffeur (String nom, String prenom, String annee, String mytrajet) throws InconsistentYear
    {
    	Calendar now = Calendar.getInstance();   
    	int currentYear = now.get(Calendar.YEAR);       
    	setNom(nom);
    	setPrenom(prenom);
    	setAnnee(annee);
    	setTrajet(mytrajet);
    	if ( Integer.valueOf(annee)>currentYear)
    	{
    		throw new InconsistentYear();
    	} else  {
    		setIdentifiant(nom, prenom, annee);	
    	}
    	
    	
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
	public void setIdentifiant (String nom, String prenom, String annee)
	{
		identifiant= nom.substring(0,3) + prenom.charAt(0) + annee.substring(2,4) ;
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
