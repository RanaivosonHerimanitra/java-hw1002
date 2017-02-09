import java.util.ArrayList;

/*
 * Limousine.java  par Herimanitra RANAIVOSON pour le DEVOIR1 INF1004
 * 
 */
public class Limousine {
	private  ArrayList<String> numero = new ArrayList<>();
	private static double reservoir;
	private static String couleur;
	private static double compteur;
	private static double longTrajet;
	private int nbPassager;
	private  ArrayList<String> idChauffeur = new ArrayList<>();
	 
	// Constructor:
	public Limousine (String idChauff,String num,double re, String color,int nb,double lgTrajet) throws EmptyLimousineException
	{
		idChauffeur.add(idChauff);
		numero.add(num);
		if (re==0.)
		{
			throw new EmptyLimousineException();
		} else {
			reservoir = re;
			couleur= color;
			setNbPassager(nb);
			longTrajet = lgTrajet;
			setCompteur(getCompteur() + longTrajet) ;
		}
	}
	// les getters de la classe:
	public ArrayList<String> getIdChauffeur() 
	{
		return idChauffeur;
		
	}
	public ArrayList<String> getImmatriculation()
	{
		return numero;
	}
	
	public double getCapaciteReservoir()
	{
		return reservoir;
	}
	
	public String getCouleur() {
		return couleur ;
	}

	public double getCompteur() {
		return compteur;
	}
	
	public int getNbPassager() {
		return nbPassager;
	}
	
	//Les setters de la classe
	public void setCapaciteReservoir(double value)
	{
		reservoir= value;
	}
	
	public static void setCompteur(double compteur) {
		Limousine.compteur = compteur;
	}

	public void setNbPassager(int nbPassager) {
		this.nbPassager = nbPassager;
	}
}
