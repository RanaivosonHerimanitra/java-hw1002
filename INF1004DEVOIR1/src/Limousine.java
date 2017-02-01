
public class Limousine {
	private static String immatriculation;
	private static double reservoir;
	private static int nbPassager;
	private static String couleur;
	private static double kmDepart;
	private static double kmArrive;
	private static String [] chauffeurList; //tous les Id des chauffeurs qui font conduit cette limousine
	private static int n=0;
    
	// Constructeur:
	public Limousine (String idChauffeur, String imm)
	{
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
	public static String getCouleur() {
		return couleur ;
	}
	// il faudrait aussi compter les trajet effectue par la limousine
	public void updateInfo(String idChauffeur) {
		chauffeurList[n] = idChauffeur;
		n++;
		double kmBefore= Limousine.getKmDepart() ;
		Limousine.setKmDepart(kmBefore + Trajet.getLongueurTrajet() ) ;
	}
	

}
