/*
 * Chauffeur.java, par Herimanitra RANAIVOSON pour le DEVOIR1 INF1004
 * Son constructeur implemente  l'assignation de l'identifiant 
 * avec setIdentifiant
 */

import java.util.ArrayList;
import java.util.Calendar;

public class Chauffeur 
{
	private  ArrayList<String> nom= new ArrayList<>();
	private  ArrayList<String> prenom= new ArrayList<>();
	private  ArrayList<String>  anneeEmbauche= new ArrayList<>();
	private  String adresse;
	private  ArrayList<String> identifiant= new ArrayList<>();
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
		nom.add(value);
	}
	public void setPrenom(String value)
	{
		prenom.add(value);
	}
	public void setAnnee(String value)
	{
		anneeEmbauche.add(value);
	}
	public void setIdentifiant (String nom, String prenom, String annee)
	{
		identifiant.add(nom.substring(0,3) + prenom.charAt(0) + annee.substring(2,4));
	}
	//les getters:
	public ArrayList<String> getIdentifiant ()
	{
		return identifiant;
	}
	public ArrayList<String> getNom ()
	{
		return nom;
	}
	public ArrayList<String> getPrenom ()
	{
		return prenom;
	}
	public ArrayList<String> getAnneeEmbauche ()
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
