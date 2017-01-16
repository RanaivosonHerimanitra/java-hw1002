//*****************************************************************************
// Heures.java              Auteur: Herimanitra RANAIVOSON, COURS:INF1002-HW1
//lecture du nombre de secondes et affichage en hh-mn-sec 
//*****************************************************************************

import java.util.Scanner;

public class Heures {
	
	//declaration des variables:
	private static Scanner reader;
	static long heures;
	static double nbTemp;
	static long minutes;
	static int secondes;
	static String monMessage;
	public static final double  nbSeconds = 3600.;  
	
	
	
	public static void main(String[] args) {
		//lecture input de l'user:
		reader = new Scanner(System.in);  
		System.out.println("Enter a number: "); 
		int input = reader.nextInt();
		double nb_h= input/nbSeconds;
		
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
