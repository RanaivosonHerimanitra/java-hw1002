
//Pour chacun des trajets associés au chauffeur, 
//on veut conserver la ville de départ, la ville d’arrivée, 
//le kilométrage au départ, 
//le kilométrage à l’arrivée et la limousine utilisée pour le trajet.

public class Chauffeur 
{
	private static String nom;
	private static String prenom;
	private static String anneeEmbauche;
	private static String adresse;
	//est-ce qu'il faut ca:??
	private static 	String [] trajetList;
	private static String identifiant;
	private static int n; 
	
	//constructeur
    public Chauffeur (String nom, String prenom, String annee, String mytrajet)
    {
    	//implemente le calcul de l'identitifiant: est ce que ca doit etre sensible à la casse?
    	identifiant= nom.substring(0,2) + prenom.substring(0) + annee.substring(2,3) ;
    	n=0;
    	trajetList[0]=mytrajet;
    	n++;
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
	//il faudrait aussi ajouter les limousines deja conduit par un chauffeur
	public void updateProfile(String mytrajet)
	{
		trajetList[n]=mytrajet;
    	n++;
    	
	}
	
}
