/*
 * Trajet.java créée par Herimanitra RANAIVOSON pour le DEVOIR1 INF1004

 */

//Est-ce qu'il faut aussi conserver
//les voitures qui ont fait le trajet??

public class Trajet {
	private static String lieuDepart;
	private static String lieuDestination;
	private static double longeurTrajet; 
	private static String idChauffeur;
	
	//constructeur 
	public Trajet (String id, String myLieuDepart, String myLieuDestination)
	{
		setIdChauffeur(id);
		lieuDepart= myLieuDepart;
		lieuDestination=myLieuDestination;
	}
	// getters:
	public  static double getLongueurTrajet()
	{
		return longeurTrajet;
	}
	public  static String getLieuDepart()
	{
		return lieuDepart;
	}
	public  static String getLieuDestination()
	{
		return lieuDestination;
	}
	
	public static String getIdChauffeur() {
		return idChauffeur;
	}
	public static void setIdChauffeur(String idChauffeur) {
		Trajet.idChauffeur = idChauffeur;
	}

}
