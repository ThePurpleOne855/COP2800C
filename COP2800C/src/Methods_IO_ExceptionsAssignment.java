import java.util.Scanner;  // Imports
import java.util.InputMismatchException;

public class Methods_IO_ExceptionsAssignment {
	// Initialize Scanner
	Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		// Initialize instances of classes.
		Methods_IO_ExceptionsAssignment program = new Methods_IO_ExceptionsAssignment();
		DoesNotmakeAnySenseButForAssignment program2 = new DoesNotmakeAnySenseButForAssignment();
		String userName = program.name(); // Calling the methods defined in each class.
		int UserAge = program2.age();
		program.output(userName, UserAge);
		
		program.input.close(); // Closing both Scanner instances.
		program2.input.close();
	}
	
	public String name() {
		System.out.println("What's your government name?\n");
		String name = input.nextLine();
		return name;
	}		
}
	
	public void output(String userName, int userAge) {
		
		if(userAge >= 50) {
			System.out.printf("Hello %s since you are %d years old you are really old.\n", userName, userAge);
		} else if (userAge < 21) {
			System.out.printf("Hello %s since you are %d years old you are really young.\n", userName, userAge);
		} else {
			System.out.printf("Hello %s since you are %d years old you are doing just fine.\n", userName, userAge);
		}
		
	}
}

class DoesNotmakeAnySenseButForAssignment {
	Scanner input = new Scanner(System.in);
	public int age() {
		System.out.println("How old are you?\n");
		while(true) {
			try {
				int age = input.nextInt();
				if(age < 0) { // Will take advantage of the catch already defined even though it should not work for this check
							  // Will throw the exception manually so it asks the user for a new input.
					System.out.println("Your age cannot be less than 0.");
					throw new InputMismatchException();
				}
				input.nextLine();
				return age;
				
			} catch(InputMismatchException e) { // if the user inputs something that is not an integer.
				System.out.println("That's not a valid input.");
				input.nextLine();
			}
		}
		
	}
}
