/*
 * Limousine.java  créée par Herimanitra RANAIVOSON pour le DEVOIR1 INF1004
 * Cette classe contient une méthode pour faire le plein d'essence:
 * Et une methode updateInfo() permettant de mettre à jour le kilometrage du vehicule 
 * à la fin de chaque trajet
 */
public class Limousine {
	private static String immatriculation;
	private static double reservoir;
	private static int nbPassager;
	private static String couleur;
	private static double kmDepart;
	private static double kmArrive;
	private static String [] chauffeurList; 
	private static int n;
    
	// Constructeur:
	public Limousine (String idChauffeur, String imm)
	{
		n=0;
		chauffeurList = new String [500];
		chauffeurList[n]= idChauffeur;
		n++;
		immatriculation = imm;
		
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
	public int getNbPassager()
	{
		return nbPassager;
	}
	
	//Les setters de la classe
	public void setNbPassager(int value)
	{
		nbPassager= value;
	}
	public void setCapaciteReservoir(double value)
	{
		reservoir= value;
	}
	public static void setKmDepart( double value) {
		kmDepart += value;
	}
	public static double getKmDepart() {
		return kmDepart ;
	}
	public static double getKmArrive() {
		return kmArrive ;
	}
	public static String getCouleur() {
		return couleur ;
	}
	public void updateInfo(String idChauffeur) {
		chauffeurList[n] = idChauffeur;
		n++;
		double kmBeforeDepart= Limousine.getKmDepart() ;
		Limousine.setKmDepart(kmBeforeDepart + Trajet.getLongueurTrajet() ) ;
		kmArrive = kmBeforeDepart + Trajet.getLongueurTrajet();
	}
	

}
