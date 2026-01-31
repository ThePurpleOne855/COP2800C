/*Recursive Method Assignment*/
public class RecursiveMethodAssignment {
	public static void main(String[] args) {
		// Create Variables
		
		int numberOfCycles = 10;
		int counter = 1;

		// Call the printRecursive method
		printRecursive(counter, numberOfCycles);
	}
	// Defining the printing method
	static void printRecursive(int counter, int cycles) {
		if (cycles == 0) {
			return;
		}
		
		System.out.printf("%d. Java Programming is really fun.\n", counter);
		printRecursive(counter + 1, cycles - 1);
	}
}
