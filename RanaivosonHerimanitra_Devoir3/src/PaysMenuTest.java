import java.util.Scanner;

/*
 * PaysTest.java, Auteur: Herimanitra RANAIVOSON INF1002
 * Tests des specifications (comparaison entre 02 pays)
 * dans un menu
 */
public class PaysMenuTest 
{
	static Scanner scan = new Scanner(System.in);
	
	//une méthode pour tester les autres specs du devoir3
	//dans un menu, comme les accesseurs et les mutateurs
	public static void changePib(Pays p)
	{
		System.out.println("*************************************");
		System.out.println("Entrez le nouveau PIB pour "+ p.getNom());
		double oldPib = p.getPib();
		double myval= Double.parseDouble(scan.nextLine());
		p.setPib(myval);
		System.out.println("Le nouveau PIB de "+ p.getNom() +" est de "+ p.getPib());
		System.out.println("Auparavant, ce PIB était de "+ oldPib);
		System.out.println("*************************************");
	}
	//
	public static void main(String[] args) 
	{
		Pays pays1 = null, pays2 = null;
		// variable pour capturer le clavier user:
		String keyboard = "";
		do {			
			//tests des autres specifications du devoir:
			System.out.println("Que voulez-vous faire?");
			System.out.println("Entrez `0` (zero) pour faire une comparaison");
			System.out.println("Entrez `1` pour changer le PIB du pays 1 (1er pays entré au clavier)");
			System.out.println("Entrez `2` pour changer le PIB du pays 2");
			System.out.println("Entrez `3` pour afficher le nombre d'habitants du pays 1");
			System.out.println("Entrez `4` pour afficher le nombre d'habitants du pays 2");
			System.out.println("Entrez `5` pour afficher les infos sur le pays 1");
			System.out.println("Entrez `6` pour afficher les infos sur le pays 2");
			System.out.println("et `q` pour quitter l'application");
			keyboard= scan.nextLine();
			switch( keyboard )
			{
			case "0":
				//les Infos du pays 1:
				System.out.println("Entrez le nom du pays 1: ");
				String mypays1= scan.nextLine();
				System.out.println("Entrez le nombre d'habitant de "+ mypays1 + ":");
				double nbHab1= Double.parseDouble(scan.nextLine());
				System.out.println("Entrez la superficie de "+ mypays1 + ":");
				double nbSup1= Double.parseDouble(scan.nextLine());
				System.out.println("Entrez le PIB de "+ mypays1 + ":");
				double nbPib1= Double.parseDouble(scan.nextLine());
				//
				
				//les Infos du pays 2:
				System.out.println("Maintenant,entrez le nom du pays 2 à comparer avec " + mypays1);
				String mypays2= scan.nextLine();
				System.out.println("Entrez le nombre d'habitant de "+ mypays2 + ":");
				double nbHab2= Double.parseDouble(scan.nextLine());
				System.out.println("Entrez la superficie de "+ mypays2 + ":");
				double nbSup2= Double.parseDouble(scan.nextLine());
				System.out.println("Entrez le PIB de "+ mypays2 + ":");
				double nbPib2= Double.parseDouble(scan.nextLine());
				
				
				
				//instanciation:
				pays1 = new Pays(mypays1,nbHab1,nbSup1,nbPib1);
				pays2 = new Pays(mypays2,nbHab2,nbSup2,nbPib2);
				
				//et la comparaison proprement dite:
				pays1.compareWith(pays2);
				break;
			case "1":
				if (pays1!=null & pays2!=null )
				{
					changePib(pays1);
					pays1.compareWith(pays2);
				} else {
					System.out.println("vous devez inserez des pays d'abord");
				}
				break;
			case "2":
				if (pays1!=null & pays2!=null )
				{
				   changePib(pays2);
				   pays1.compareWith(pays2);
				} else {
					System.out.println("vous devez inserez des pays d'abord");
				}
				break;
			case "3":
				if (pays1!=null & pays2!=null )
				{
				   System.out.println("Le nombre d'habitants de "+ pays1.getNom() + " est de " + pays1.getNbHabitant());
				} else {
					System.out.println("vous devez inserez des pays d'abord");
				}
				break;
			case "4":
				if (pays1!=null & pays2!=null )
				{
				   System.out.println("Le nombre d'habitants de "+ pays2.getNom() + " est de " + pays2.getNbHabitant());
				} else {
					System.out.println("vous devez inserez des pays d'abord");
				}
				break;
			case "5":
				if (pays1!=null) 
				{
					String info = pays1.toString();
					System.out.println(info);
				} else {
					System.out.println("vous devez inserez des pays d'abord");
				}
				break;
			case "6":
				if (pays2!=null) 
				{
					String info=pays2.toString();
					System.out.println(info);
				} else {
					System.out.println("vous devez inserez des pays d'abord");
				}
				break;
			default:
				break;
			}
			//System.out.println("Voulez-vous quittez le menu? (Entrez `q` au clavier si Oui, n'importe quel touche sinon)");
			//keyboard= scan.nextLine();
			
		} while ( !keyboard.equals("q") );
	} 

}
