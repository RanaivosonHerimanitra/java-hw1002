//Pour chacun des trajets associés au chauffeur, 
//on veut conserver la ville de départ, la ville d’arrivée, 
//le kilométrage au départ, 
//le kilométrage à l’arrivée et la limousine utilisée pour le trajet.

public class Trajet {
	private static String lieuDepart;
	private static String lieuDestination;
	private static double longeurTrajet; //pour pouvoir calculer le km à l'arrivée. 
	
	//constructeur
	public Trajet (String idChauffeur, String myLieuDepart, String myLieuDestination)
	{
		String id = idChauffeur;
		lieuDepart= myLieuDepart;
		lieuDestination= myLieuDestination;
	}
	public  double getLongueurTrajet()
	{
		return longeurTrajet;
	}
	//apres un trajet, met à jour le kilometrage de la limousine:
	public static void commit()
	{
		//quand le trajet est termine should update kilometrage de la limousine
		// pour la limousine en question , donc il faudrait au préalable chercher
		//son numero d'immatriculation avant de la 
		double kmBefore= Limousine.getKmDepart() ;
		Limousine.setKmDepart(kmBefore + longeurTrajet) ;
	}

}
