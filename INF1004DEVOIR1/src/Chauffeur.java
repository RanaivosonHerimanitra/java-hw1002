
//Pour chacun des trajets associés au chauffeur, 
//on veut conserver la ville de départ, la ville d’arrivée, 
//le kilométrage au départ, 
//le kilométrage à l’arrivée et la limousine utilisée pour le trajet.

public class Chauffeur 
{
	private static String nom;
	private static String prenom;
	private static int anneeEmbauche;
	private static String adresse;
	//est-ce qu'il faut ca:??
	private static 	String [] trajetList;
	private static String identifiant;
	
	//constructeur
    public Chauffeur (String nom, String prenom, int anneeEmbauche)
    {
    	//implemente le calcul de l'identitifiant: est ce que ca doit etre sensible à la casse?
    	String anneeString = String.valueOf(anneeEmbauche);
    	identifiant= nom.substring(0,2) + prenom.substring(0) + anneeString.substring(2,3) ;
    }
	//ecrit le nom du chauffeur
	public static void setNom(String value)
	{
		nom= value;
	}
	//puis son prenom:
	public static void setPrenom(String value)
	{
		prenom= value;
	}
	public String getIdentifiant ()
	{
		return identifiant;
	}
	//un tableau doit s'accumuler au fur et à mesure qu'un chauffeur est appelé à conduire
	//une limousine donnee:
	//methode qui permet au chauffeur d'effectuer le trajet
	public void conduit()
	{
			//doit enregistrer l'historique de conduite du chauffeur??
	}
	
}
