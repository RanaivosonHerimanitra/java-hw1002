//Pour chacun des trajets associés au chauffeur, 
//on veut conserver la ville de départ, la ville d’arrivée, 
//le kilométrage au départ, 
//le kilométrage à l’arrivée et la limousine utilisée pour le trajet.

public class Trajet {
	private static String lieuDepart;
	private static String lieuDestination;
	private static double longeurTrajet; //pour pouvoir calculer le km à l'arrivée. 
	private static String [] chauffeurList; //tous les Id des chauffeurs qui fait ce trajet
	private static int n;
	//constructeur qui enregistre entre autre les chauff assignes à ce trajet
	public Trajet (String idChauffeur, String myLieuDepart, String myLieuDestination)
	{
		n=0;
		chauffeurList[n]= idChauffeur;
		n++;
		lieuDepart= myLieuDepart;
		lieuDestination= myLieuDestination;
		//apres il faudrait une methode next!!!
	}
	
	public  static double getLongueurTrajet()
	{
		return longeurTrajet;
	}
	
	//apres un trajet, met à jour le kilometrage de la limousine:
	//quand le trajet est termine should update kilometrage de la limousine
	// pour la limousine en question , donc il faudrait au préalable chercher
	//son numero d'immatriculation avant de la 
	public static void commit(String idChauffeur)
	{
		chauffeurList[n]= idChauffeur;
		n++;
	}

}
