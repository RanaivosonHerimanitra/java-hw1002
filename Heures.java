import java.util.Scanner;
/*lecture d'un nombre de secondes et affichage H-mn-sec */
public class Heures {
	private static Scanner reader;
	static long intPart1;
	static double fracPart1;
	static long intPart2;
	static int fracPart2;
	
	public static void main(String[] args) {
		reader = new Scanner(System.in);  
		System.out.println("Enter a number: "); 
		int nb = reader.nextInt();
		double nb_h= nb/3600.;
		//separe heure et minute
		intPart1 = (long) nb_h;
		//récupère minute
		fracPart1 = 60*(nb_h - intPart1);
		//separe minute et seconde:
		intPart2 = (long) fracPart1;
		//recupere et arrondi la seconde
		fracPart2 = (int) Math.round(60*(fracPart1 - intPart2));
		//affiche resultat:
		System.out.println(intPart1 + "heures "+ intPart2 + "minutes " + fracPart2 + "secondes");
	}
	
}
