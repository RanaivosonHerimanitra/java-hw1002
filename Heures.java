//*****************************************************************************
// Heures.java              Auteur: Herimanitra RANAIVOSON, COURS:INF1002-HW1
//lecture du nombre de secondes et affichage en hh-mn-sec 
//*****************************************************************************

import java.util.Scanner;

public class Heures {
	
	//declaration des variables:
	private static Scanner scan;
	private static long heures;
	private static double nbTemporaire;
	private static long minutes;
	private static int secondes;
	private static String monMessage;
	private static final double  NBSECONDS = 3600.;  
	
	
	public static void main(String[] args) {
		//lecture input de l'user:
		scan = new Scanner(System.in);  
		System.out.println("Entrez le nombre de secondes: "); 
		int userInput = scan.nextInt();
		double nb_h= userInput/NBSECONDS;
		
		//separe heures et minutes par le cast :
		heures = (long) nb_h;
		
		//récupère minutes
		nbTemporaire = 60*(nb_h - heures);
		
		//sépare minutes et secondes par le cast:
		minutes = (long) nbTemporaire;
		
		//récupère et arrondi secondes par le cast:
		secondes = (int) Math.round(60*(nbTemporaire - minutes));
		
		
		//affichage du resultat:
		monMessage = userInput + " secondes contiennent ";
		monMessage += heures + " heure(s), "+ minutes + " minute(s), " + secondes + " seconde(s)";
		System.out.println(monMessage);
	}
	
}
