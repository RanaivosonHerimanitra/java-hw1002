import java.util.ArrayList;
import java.util.List;

/*
 * Trajet.java creee par Herimanitra RANAIVOSON pour le DEVOIR1 INF1004
 */

public class Trajet {
	private  ArrayList<String> lieuDepart= new ArrayList<>();
	private  ArrayList<String> lieuDestination= new ArrayList<>();
	private  List<Double> longeurTrajet= new ArrayList<Double>();
	private  ArrayList<String> idChauffeur= new ArrayList<>();
	
	//constructeur 
	public Trajet (String idChauff, String myLieuDepart, String myLieuDestination,double lgtrajet)
	{
		setIdChauffeur(idChauff);
		lieuDepart.add(myLieuDepart);
		lieuDestination.add(myLieuDestination);
		longeurTrajet.add(lgtrajet);
	}
	// getters:
	public   List<Double> getLongueurTrajet()
	{
		return longeurTrajet;
	}
	public   ArrayList<String> getLieuDepart()
	{
		return lieuDepart;
	}
	public   ArrayList<String> getLieuDestination()
	{
		return lieuDestination;
	}
	
	public ArrayList<String> getIdChauffeur() {
		return idChauffeur;
	}
	public  void setIdChauffeur(String id) {
		idChauffeur.add(id);
	}

}
