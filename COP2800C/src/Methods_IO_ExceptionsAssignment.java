import java.util.Scanner;
import java.util.InputMismatchException;

public class Methods_IO_ExceptionsAssignment {
	Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		Methods_IO_ExceptionsAssignment program = new Methods_IO_ExceptionsAssignment();
		DoesNotmakeAnySenseButForAssignment program2 = new DoesNotmakeAnySenseButForAssignment();
		String userName = program.name();
		int UserAge = program2.age();
		program.output(userName, UserAge);
		
		program.input.close();
	}
	
	public String name() {
		System.out.println("What's your government name?\n");
		String name = input.nextLine();
		return name;
	}
	
	public int age() {
		System.out.println("How old are you?\n");
		while(true) {
			try {
				int age = input.nextInt();
				if(age < 0) {
					System.out.println("Your age cannot be less than 0.");
					throw new InputMismatchException();
				}
				input.nextLine();
				return age;
				
			} catch(InputMismatchException e) {
				System.out.println("That's not a valid input.");
				input.nextLine();
			}
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
				if(age < 0) {
					System.out.println("Your age cannot be less than 0.");
					throw new InputMismatchException();
				}
				input.nextLine();
				return age;
				
			} catch(InputMismatchException e) {
				System.out.println("That's not a valid input.");
				input.nextLine();
			}
		}
		
	}
}
