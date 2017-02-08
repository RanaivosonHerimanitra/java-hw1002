
public class Test {
//	private static String chauffeurNom;
//	private static String chauffeurPrenom;
//	private static String anneeEmbauche;
//	private static String lieuDepart ;
//	private static String lieuDestination;
//	private static String immatriculation ;
//	private static Scanner scan;
	public static void main(String[] args)
	{
		Compagnie compagnie = new Compagnie();
		compagnie.makeReservation();
		compagnie.makeTrip();
		compagnie.getLimousineByChauffeur("eric");
	}
}
