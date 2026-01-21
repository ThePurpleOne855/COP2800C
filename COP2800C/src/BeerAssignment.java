import java.util.Scanner;


public class BeerAssignment {
	int caloriesPerBeer = 150;
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BeerAssignment ba  = new BeerAssignment();
		
		// Input essential information
		System.out.println("How many beers do you expect to consume each day?");
		float beersPerDay = scanner.nextFloat();
		
		System.out.println("How much do beers cost you?");
		float costPerBeer = scanner.nextFloat();
		
		while(beersPerDay < 0 || costPerBeer < 0) {
			System.out.println("Cost Per Beer and Beers Per Day must be positive integer. Please input a positive integer.\n\n");
			
			System.out.println("Beers Per Day:");
			
			beersPerDay = scanner.nextFloat();
			
			System.out.println("Cost Per Beer:");
			
			costPerBeer = scanner.nextFloat();
		}
		
		//Calculations
		
		float beersPerYear = beersPerDay * 365;
		
		float caloriesPerYear = beersPerYear * ba.caloriesPerBeer;
		
		float beerToWeightRatio = 15 * beersPerDay;
		
		float moneySpendOnBeersPerYear = costPerBeer * 365;
		
		
		// Output calculations
		
		System.out.printf("That's approximately: %.2f beers in one year.\n\n", beersPerYear);
		
		System.out.printf("In one year, you will consume approximately: %.2f calories from beer alone.\n\n", caloriesPerYear);
		
		System.out.printf("Without diet or exercise to counter these calories, you can expect to gain: %.2f pounds from drinking that much beer this year.\n\n", beerToWeightRatio);
		
		System.out.printf("Total money spend yearly buying beer: $%.2f", costPerBeer * 365);
		
		scanner.close();
	}
}
