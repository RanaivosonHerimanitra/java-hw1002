/*
 * Pays.java , 
 * Pays implémente interface  built-in Comparable de java
 * Auteur: Herimanitra RANAIVOSON, INF1002-Devoir3
 */

public class Pays implements Comparable<Pays> {
	private String nom;
	private double nbHabitant;
	private double superficie;
	private double pib;
	
	// constructeur:
	public Pays(String name, double nb, double area, double gdp)
	{
		setNom(name);
		setNbHabitant(nb);
		setSuperficie(area);
		setPib(gdp);
	}
	
	//mutateur du PIB:
	public void setPib(double val)
	{
		pib=val;
	}
	public double getPib()
	{
		return (pib);
	}
	
	//mutateur nombre habitants
	public void setNbHabitant(double val)
	{
		nbHabitant=val;
		
	}
	//mutateur du nom:
	public void setNom(String name) {
		nom = name;
	}
	
	//mutateur superficie
	public void setSuperficie(double superf) {
		superficie = superf;
	}
	
	//accesseur pour le nombre d'habitants:
	public double getNbHabitant()
	{
		return nbHabitant;
	}
	
	// accesseur superficie
	public double getSuperficie() {
		return superficie;
	}
	
	//accesseur nom
	public String getNom() {
		return nom;
	}

	
	//redefinition des 02 methodes issues de Comparable:
	public boolean equals(Pays p) {
		return Math.abs(pib-p.pib)<0.000001;
	}
	
	public int compareTo(Pays p) 
	{
		int output=0 ;
		if ( (pib - p.pib)<0. )
		{
			output = -1;
		}
		if ( (pib - p.pib)>0. )
		{
			output = 1;
		}
		if ( equals(p) )
		{
			output = 0;
		}
		return output;
	}
	// methode toString comme demande dans les specs devoir3
	public String toString()
	{
		String myMsg="Nom du pays: "+ getNom() + "\n";
		myMsg +="Sa superficie: "+ getSuperficie() + "\n";
		myMsg += "Nb. Habitant: "+ getNbHabitant()+ "\n";
		myMsg += "Son PIB est de: "+ getPib()+ "\n";
		return myMsg;
	}
	
	//Englobe leur implementation dans une methode compareWith
	public  void compareWith(Pays p) 
	{
		if ( compareTo(p)<0 )
		{
			System.out.println("* PIB de "+ getNom()+ " est inferieur a celui de "+p.getNom());
		}
		
		if ( compareTo(p)==0 )
		{
			System.out.println("PIB de "+ getNom()+ " est egal a celui de "+p.getNom());
		}
		
		if ( compareTo(p)>0 )
		{
			System.out.println("PIB de "+ getNom()+ " est superieur a celui de "+p.getNom());
		}
	}
}
