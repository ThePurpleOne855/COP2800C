import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

/**
 * Bicycle_Assignment handles the creation and management of Bicycle objects
 * through a console-based menu system.
 */
public class Bycicle_Assignment {
	// Instance variables for Bicycle properties
	private String color;
	private String brand;
	private String gears; 
	private float wheelHeight;
	private String owner;
	
	/**
	 * Main entry point of the program. 
	 * Manages the user interface and the list of bicycle objects.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Control flag for the application loop
		boolean keep_running = true;
		
		// List to store all created bicycle instances
		List<Bycicle_Assignment> bikeList = new ArrayList<>();
		
		while(keep_running) {
			// Displaying Menu Options
			System.out.println("#### BICYCLE MENU ####");
			System.out.println("1. Create a new Bicycle");
			System.out.println("2. Display");
			System.out.println("3. Exit");
			
			// Capture user menu selection
			int choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline left by nextInt()
			
			switch(choice) {
			case 1:
				// Logic for creating a new Bicycle instance
				System.out.println("Let's build a bike.\n");
				
				System.out.println("Color: ...\n");
				String color = scanner.nextLine();
				
				System.out.println("Brand:...\n");
				String brand = scanner.nextLine();
				
				System.out.println("Gears: ...\n");
				String gears = scanner.nextLine();
				
				System.out.println("Wheel Height: ...\n");
				float wheelHeight = scanner.nextFloat();
				
				System.out.println("Owner: ...");
				String owner = scanner.nextLine();
				
				// Instantiate and add the new bike to the list
				bikeList.add(new Bycicle_Assignment(color, brand, gears, wheelHeight, owner));
				
				System.out.println("Bike has been created.\n");
				break;
				
			case 2:
				// Iterate through the list and display each bicycle's details
				for(int i = 0; i < bikeList.size(); i++) {
					Bycicle_Assignment currentBike= bikeList.get(i);
					
					System.out.printf("\n%d.\nColor: %s\n, Brand: %s\n, Gears: %b\n, Wheel Heigh: %.1fcm\n\n\n\n", 
							i + 1, currentBike.getColor(), currentBike.getBrand(), currentBike.getGears(), currentBike.wheelHeight);
					
				}
				break;
			case 3:
				// Terminate the loop and exit
				System.out.println("Exiting Program...");
				keep_running = false;
				break;
			}
		}
	}
	
	/**
	 * Constructor for the Bycicle_Assignment class.
	 */
	public Bycicle_Assignment(String color, String brand, String gears, float wheelHeight, String owner){
		this.color = color;
		this.brand = brand;
		this.gears = gears;
		this.wheelHeight = wheelHeight;
		this.owner = owner;
	}
	
	// --- Getters and Setters ---
	
	public String getColor() { return color; }
	public void setColor(String color) { this.color = color; }
	
	public String getBrand() { return brand; }
	public void setBrand(String brand) { this.brand = brand; }
	
	public String getGears() { return gears; }
	public void setGears(String gears) { this.gears = gears; }
	
	public float getWheelHeight() {return wheelHeight; }
	public void setWheelHeight(float wheelHeight) { this.wheelHeight = wheelHeight; }
	
	public String getOwner() {return owner;}
	public void setOwner(String owner) { this.owner = owner; }
	
	/**
	 * Returns a string representation of the bicycle details.
	 */
	@Override
	public String toString() {
		return "Bycicle Brand: " + brand + ", Bycicle Color: " + color + 
				"Has Gears: " + gears + ", Wheel Height:" + wheelHeight + ", Owner:" + owner; 
	}
}