public class WeightCalculator
{
	public static void main(String[] args)
	{
		
		double weight = Double.parseDouble(args[0]);
		double mars = 0.38;
		double jupiter = 2.36;
		double venus = 0.91;
		double saturn = 1.06;
		
		System.out.println("Your weight on...");
		/*System.out.println("mars is " + weight*mars);
		System.out.println("jupiter is " + weight*jupiter);
		System.out.println("venus is " + weight*venus);
		System.out.println("saturn is " + weight*saturn + ".");
		System.out.println("Thanks for using my program! I hope it wasn't too buggy!");*/
		printWeight(weight, mars, "Mars");
		printWeight(weight, jupiter, "Jupiter");
		printWeight(weight, venus, "Venus");
		printWeight(weight, saturn, "Saturn");
	}
	
	public static void printWeight(double earth, double factor, String planet)
	{
		double weight = earth * factor;
		System.out.println(planet + ": " + weight);

	}
	
	/*public static void printPlanet(double weight, String planet, String planet2, String planet3, String planet4)
	{	
		double mars = 0.38;
		double jupiter = 2.36;
		double venus = 0.91;
		double saturn = 1.06;
		
		/*if (planet = "Mars") {
			System.out.println("Your weight on " + planet + "is " + weight*mars)
		}*/
		 /*System.out.println("Your weight on " + planet + " " weight*mars )
	}*/
}



