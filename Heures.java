//*****************************************************************************
// Heures.java              Auteur: Herimanitra RANAIVOSON, COURS:INF1002-HW1
//lecture du nombre de secondes et affichage en hh-mn-sec 
//*****************************************************************************

import java.util.Scanner;

public class Heures {
	
	//declaration des variables:
	private static Scanner reader;
	private static long heures;
	private static double nbTemp;
	private static long minutes;
	private static int secondes;
	private static String monMessage;
	private static final double  NBSECONDS = 3600.;  
	
	
	
	public static void main(String[] args) {
		//lecture input de l'user:
		reader = new Scanner(System.in);  
		System.out.println("Entrez le nombre de secondes: "); 
		int input = reader.nextInt();
		double nb_h= input/NBSECONDS;
		
		//separe heure(s) et minute(s):
		heures = (long) nb_h;
		
		//récupère minute(s)
		nbTemp = 60*(nb_h - heures);
		
		//sépare minute(s) et seconde(s):
		minutes = (long) nbTemp;
		
		//récupère et arrondi seconde(s):
		secondes = (int) Math.round(60*(nbTemp - minutes));
		
		
		//affichage du resultat:
		monMessage = input + " secondes contiennent ";
		monMessage += heures + " heure(s), "+ minutes + " minute(s), " + secondes + " seconde(s)";
		System.out.println(monMessage);
	}
	
}
