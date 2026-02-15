import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Array_1D_Assignment {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random randomNum = new Random();
		
		System.out.println("Storage Capacity:\n");
		
		int storageCapacity = scanner.nextInt();
		
		ArrayList<Integer> storage = new ArrayList<>();
		
		for(int i = 0; i < storageCapacity + 1; i++) {
			int newNum = randomNum.nextInt(101);
			storage.add(newNum);
		}
		printArray(storage);
		calculateAvg(storage);
		sumPrintTotal(storage);
		
		System.out.println("Do you want to sort? Y/N\n");
		
		char userInput = scanner.next().charAt(0);
		
		if(userInput == 'Y' ||  userInput == 'y') {
			Collections.sort(storage);
			
			System.out.println("Sorted:\n");
			
			printArray(storage);
		} 

		scanner.close();
		
	}
	
	public static void printArray(ArrayList<Integer> list) {
		for(int i = 0; i < list.size() - 1; i++) {
			System.out.printf("%d. %d\n", i+1, list.get(i));
		}
	}
	
	public static void calculateAvg(ArrayList<Integer> list) {
		int total = 0;
		
		for(int i = 0; i < list.size() - 1; i++) {
			total += list.get(i);
		}
		
		System.out.printf("The average for this set is: %d\n", total / list.size());
	}
	
	public static void sumPrintTotal(ArrayList<Integer> list) {
		
		int total = 0;
		
		for (int i = 0; i < list.size() - 1; i++) {
			total += list.get(i);
		}
		
		System.out.printf("Total: %d\n", total);
	}
	

}
