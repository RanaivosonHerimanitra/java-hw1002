/*
 * Trajet.java , par Herimanitra RANAIVOSON pour le DEVOIR1 INF1004
 * les primitives sont de type ArrayList pour pouvoir repondre a la derniere
 * specification du devoir
 */

import java.util.ArrayList;
import java.util.List;


public class Trajet {
	private  ArrayList<String> lieuDepart= new ArrayList<>();
	private  ArrayList<String> lieuDestination= new ArrayList<>();
	private  List<Double> longeurTrajet= new ArrayList<Double>();
	private  ArrayList<String> idChauffeur= new ArrayList<>();
	private  ArrayList<Double> kmDepart= new ArrayList<>();
	private  ArrayList<Double> kmArrive= new ArrayList<>();
	
	//constructeur 
	public Trajet (String idChauff, String myLieuDepart, String myLieuDestination,double kmDep, double lgtrajet) throws InconsistentTrajet
	{
		if ( (lgtrajet<=0) || myLieuDepart.equals(myLieuDestination) ) {
			throw new InconsistentTrajet();
		} else {
			setIdChauffeur(idChauff);
			lieuDepart.add(myLieuDepart);
			lieuDestination.add(myLieuDestination);
			longeurTrajet.add(lgtrajet);
			kmDepart.add(kmDep);
			kmArrive.add( kmDep +lgtrajet);
	    }
	}
	// getters:
	public   List<Double> getLongueurTrajet()
	{
		return longeurTrajet;
	}
	//new getters pour suivre km depart et arrivee:
	public   List<Double> getkmDepart()
	{
		return kmDepart;
	}
	public   List<Double> getkmArrive()
	{
		return kmArrive;
	}
	//
	public   ArrayList<String> getLieuDepart()
	{
		return lieuDepart;
	}
	
	public   ArrayList<String> getLieuDestination()
	{
		return lieuDestination;
	}
	
	public ArrayList<String> getIdChauffeur() 
	{
		return idChauffeur;
	}
	
	public  void setIdChauffeur(String id) 
	{
		idChauffeur.add(id);
	}

}
