/*
 * Chauffeur.java, par Herimanitra RANAIVOSON pour le DEVOIR1 INF1004
 * Son constructeur implemente  l'assignation de l'identifiant 
 * avec setIdentifiant
 */

import java.util.Calendar;

public class Chauffeur 
{
	private  String nom;
	private  String prenom;
	private  String anneeEmbauche;
	private  String adresse;
	private  String identifiant;
	private  String trajet;
	private final int MINYEAR=1960;
	
	//constructor
    public Chauffeur (String nom, String prenom, String annee, String mytrajet) throws InconsistentYear
    {
    	Calendar now = Calendar.getInstance();   
    	int currentYear = now.get(Calendar.YEAR);       
    	setNom(nom);
    	setPrenom(prenom);
    	setAnnee(annee);
    	setTrajet(mytrajet);
    	if ( Integer.valueOf(annee)>currentYear || Integer.valueOf(annee)<MINYEAR)
    	{
    		throw new InconsistentYear();
    	} else  {
    		setIdentifiant(nom, prenom, annee);	
    	}
    	
    	
    }
	//setters:
	public void setNom(String value)
	{
		nom= value;
	}
	public void setPrenom(String value)
	{
		prenom= value;
	}
	public void setAnnee(String value)
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
	public  String getTrajet() {
		return trajet;
	}
	public void setTrajet(String traj) {
		trajet = traj;
	}
	
}
