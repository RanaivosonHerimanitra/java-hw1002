//*****************************************************************************
// Heures.java              Auteur: Herimanitra RANAIVOSON, COURS:INF1002-HW1
//lecture du nombre de secondes et affichage en hh-mn-sec 
//*****************************************************************************

import java.util.Scanner;

public class Heures {
	
	//declaration des variables:
	private static Scanner reader;
	static long heures;
	static double Nbtemp;
	static long minutes;
	static int secondes;
	static String monMessage;
	public static final double  SECONDS = 3600.;  
	
	
	
	public static void main(String[] args) {
		//lecture input de l'user:
		reader = new Scanner(System.in);  
		System.out.println("Enter a number: "); 
		int nb = reader.nextInt();
		double nb_h= nb/SECONDS;
		
		//separe heure(s) et minute(s):
		heures = (long) nb_h;
		
		//récupère minute(s)
		Nbtemp = 60*(nb_h - heures);
		
		//sépare minute(s) et seconde(s):
		minutes = (long) Nbtemp;
		
		//récupère et arrondi seconde(s):
		secondes = (int) Math.round(60*(Nbtemp - minutes));
		
		
		//affichage du resultat:
		monMessage = nb + " secondes contiennent ";
		monMessage += heures + " heure(s), "+ minutes + " minute(s), " + secondes + " seconde(s)";
		System.out.println(monMessage);
	}
	
}
