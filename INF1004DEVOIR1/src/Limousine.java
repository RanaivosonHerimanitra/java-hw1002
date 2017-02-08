/*
 * Limousine.java  créée par Herimanitra RANAIVOSON pour le DEVOIR1 INF1004
 */
public class Limousine {
	private static String immatriculation;
	private static double reservoir;
	private static String couleur;
	private static double compteur;
	private static double longTrajet;
	
	// Constructeur:
	public Limousine (String imm,double re, String color,double lgTrajet)
	{
		immatriculation = imm;
		reservoir = re;
		couleur= color;
		longTrajet = lgTrajet;
		setCompteur(getCompteur() + longTrajet) ;		
	}
	
	// les getters de la classe:
	public String getImmatriculation()
	{
		return immatriculation;
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
}
