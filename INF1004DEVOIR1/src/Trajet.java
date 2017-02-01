/*
 * Trajet.java créée par Herimanitra RANAIVOSON pour le DEVOIR1 INF1004
 * Cette classe possède entre autre une méthode commit() pour enregistrer les chauffeurs
 * qui ont déjà fait un trajet donné
 */

//Est-ce qu'il faut aussi conserver
//les voitures qui ont fait le trajet??

public class Trajet {
	private static String lieuDepart;
	private static String lieuDestination;
	private static double longeurTrajet; 
	private static String [] chauffeurList; 
	private static int n;
	
	//constructeur 
	public Trajet (String idChauffeur, String myLieuDepart, String myLieuDestination)
	{
		n=0;
		chauffeurList = new String[500];
		chauffeurList[n]= idChauffeur;
		n++;
		lieuDepart= myLieuDepart;
		lieuDestination= myLieuDestination;
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
	//
	public  void commit(String idChauffeur)
	{
		chauffeurList[n]= idChauffeur;
		n++;
	}

}
