import java.util.ArrayList;

/*
 * Limousine.java  par Herimanitra RANAIVOSON pour le DEVOIR1 INF1004
 * 
 */
public class Limousine {
	private final ArrayList<String> numero = new ArrayList<>();
	private static double reservoir;
	private static String couleur;
	private static double compteur;
	private static double longTrajet;
	private int nbPassager;
	private final ArrayList<String> idChauffeur = new ArrayList<>();
	 
	// Constructeur:
	public Limousine (String idChauff,String num,double re, String color,int nb,double lgTrajet)
	{
		idChauffeur.add(idChauff);
		numero.add(num);
		reservoir = re;
		couleur= color;
		setNbPassager(nb);
		longTrajet = lgTrajet;
		setCompteur(getCompteur() + longTrajet) ;
		
	}
	
	public ArrayList<String> getIdChauffeur() 
	{
		return idChauffeur;
		
	}

	// les getters de la classe:
	public ArrayList<String> getImmatriculation()
	{
		return numero;
	}
	
	public double getCapaciteReservoir()
	{
		return reservoir;
	}
	
	//Les setters de la classe
	public void setCapaciteReservoir(double value)
	{
		reservoir= value;
	}
	
	public String getCouleur() {
		return couleur ;
	}

	public double getCompteur() {
		return compteur;
	}

	public static void setCompteur(double compteur) {
		Limousine.compteur = compteur;
	}

	public int getNbPassager() {
		return nbPassager;
	}

	public void setNbPassager(int nbPassager) {
		this.nbPassager = nbPassager;
	}
}
