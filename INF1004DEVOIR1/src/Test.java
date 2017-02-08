/*
 * Test.java, classe permettant de tester les specs du devoir 1 INF1004, par Herimanitra RANAIVOSON
 */
public class Test {

	public static void main(String[] args)
	{
		Compagnie compagnie = new Compagnie();
		compagnie.makeReservation();
		compagnie.makeTrip();
		compagnie.displayConfirmationMsg();
		compagnie.findLimousineByChauffeur("Eric", "Jean","2012");
		compagnie.findLimousineByChauffeur("Eric", "Jean","2011");
		compagnie.findLimousineByChauffeur("Xavier", "peter","2011");
	}
}
