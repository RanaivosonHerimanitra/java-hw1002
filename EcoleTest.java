//*****************************************************************************
// EcoleTest.java              Auteur: Herimanitra RANAIVOSON, COURS:INF1002-HW2
//Test des methodes de la classe ecole
//*****************************************************************************

import java.text.ParseException;

public class EcoleTest 
{
		public static void main(String[] args) throws ParseException 
		{

			Ecole myecole = new Ecole();
			
			//accesseur annee creation:
			System.out.println("Annee de creation(accesseur): " + myecole.getAnneeCreation() );
			
			//voir valeur par defaut:
			System.out.println("Nb. Eleve par defaut: " + myecole.getNbEleve()) ;
			
			//mutateur pour le Nb Eleve:
			myecole.setNbEleve(15000) ;
			
			//voir le changement:
			System.out.println("Nb. Eleve apres mutation: " + myecole.getNbEleve()) ;
			
			//test de la methode toString:
			System.out.println(myecole.toString());
					
		}

}
