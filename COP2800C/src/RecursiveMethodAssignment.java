
public class RecursiveMethodAssignment {
	public static void main(String[] args) {
		int numberOfCycles = 10;
		int counter = 1;
		printRecursive(counter, numberOfCycles);
	}
	
	static void printRecursive(int counter, int cycles) {
		if (cycles == 0) {
			return;
		}
		
		System.out.printf("%d. Java Programming is really fun.\n", counter);
		printRecursive(counter + 1, cycles - 1);
	}
}
