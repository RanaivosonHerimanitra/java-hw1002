
public class Limousine {
	private static String immatriculation;
	private static double reservoir;
	private static int nbPassager;
	private static String couleur;
	private static double kmDepart;
	
	private static double kmArrive;
    
	// Constructeur:
	//tokony objet chauffeur ve??
	public Limousine (String idChauffeur, String imm)
	{
		String id = idChauffeur;
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
	// UTILE, s'il faut faire le plein d'essence par exemple:
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
	

}
