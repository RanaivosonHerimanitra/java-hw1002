//*****************************************************************************
// EcoleTest.java              Auteur: Herimanitra RANAIVOSON, COURS:INF1002-HW2
//Test des methodes de la classe Ecole
//recupere les inputs, puis instancie et teste les différentes methodes
//*****************************************************************************

import java.util.Scanner;

public class EcoleTest 
{
	private static Scanner scan;
		public static void main(String[] args) 
		{
			//instantiation:
			Ecole myecole = new Ecole();
			
			//lecture des inputs:
			scan = new Scanner(System.in);  
			System.out.println("Entrez le nom de l\'ecole: "); 
			myecole.setNomEcole(scan.nextLine() );
			System.out.println("Entrez le nom de la ville: "); 
			myecole.setNomVille(scan.nextLine() );
			System.out.println("Entrez le nombre d\'eleves: "); 
			myecole.setNbEleve( Integer.parseInt(scan.nextLine()) );
			System.out.println("Entrez l\'annee de creation: "); 
			myecole.setAnneeCreation( Integer.parseInt(scan.nextLine()) );
			System.out.println("Entrez le type d\'etablissement (primaire,secondaire,specialise): "); 
			myecole.setType( scan.nextLine());

			
			//Tests:
			System.out.println("Annee de creation(accesseur): " + myecole.getAnneeCreation() );
			System.out.println("*************Test du mutateur pour le nombre d'eleves****************");
			int NbEleveBefore = myecole.getNbEleve();
			System.out.println("Entrez un nouveau nombre d\'eleves: "); 
			myecole.setNbEleve( Integer.parseInt(scan.nextLine()) );
			System.out.println("Nb eleves ,avant, etait:" + NbEleveBefore + ", Nb eleves maintenant:" + myecole.getNbEleve());
			System.out.println("*************APPEL DE LA METHODE toString****************");
			System.out.println(myecole.toString());
					
		}

}
