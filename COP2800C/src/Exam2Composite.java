import java.util.ArrayList;
import java.util.Scanner;

public class Exam2Composite {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> testClassComposite = new ArrayList<>();

        // Ask how many students to enter
        System.out.print("How many students would you like to add? ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("\n--- Student " + (i + 1) + " ---");
            Student s = new Student();
            s.populate(scanner);
            testClassComposite.add(s);
        }

        // Print summary of all students
        System.out.println("\n=== Student List ===");
        for (Student s : testClassComposite) {
            System.out.println(s);
        }

        scanner.close();
    }

    static class Date {
        int month;
        int day;
        int year;

        public Date() {}

        public Date(int month, int day, int year) {
            this.month = month;
            this.day = day;
            this.year = year;
        }

        // Prompts and validates year, month, and day in the correct order
        public void populate(Scanner scanner) {

            // --- YEAR ---
            System.out.print("Enter birth year: ");
            int yr = scanner.nextInt();
            while (yr >= 2026) {
                System.out.println("Input a year before 2026.");
                System.out.print("Enter birth year: ");
                yr = scanner.nextInt();
            }
            this.year = yr;

            // --- MONTH ---
            System.out.print("Enter birth month (1-12): ");
            int mo = scanner.nextInt();
            if (mo < 1 || mo > 12) {
                System.out.println("Month must be between 1 (January) and 12 (December).");
                do {
                    System.out.print("Please enter a valid month (1-12): ");
                    mo = scanner.nextInt();
                } while (mo < 1 || mo > 12);
            }
            this.month = mo;

            // --- DAY (month + year must be set first for maxDaysInMonth to work) ---
            int maxDay = maxDaysInMonth();
            System.out.print("Enter birth day (1-" + maxDay + "): ");
            int d = scanner.nextInt();
            if (d < 1 || d > maxDay) {
                System.out.println("Day must be between 1 and " + maxDay + " for the selected month.");
                do {
                    System.out.print("Please enter a valid day (1-" + maxDay + "): ");
                    d = scanner.nextInt();
                } while (d < 1 || d > maxDay);
            }
            this.day = d;
        }

        // Checks if the stored year is a leap year
        private boolean isLeapYear() {
            return (this.year % 4 == 0 && this.year % 100 != 0) || (this.year % 400 == 0);
        }

        // Returns the max valid day for the stored month and year
        private int maxDaysInMonth() {
            switch (this.month) {
                case 2: return isLeapYear() ? 29 : 28;
                case 4: case 6: case 9: case 11: return 30;
                default: return 31;
            }
        }

        @Override
        public String toString() {
            return month + "/" + day + "/" + year;
        }
    }

    static class Name {
        String firstName;
        char middleInitial;
        String lastName;

        public Name() {}

        public Name(String firstName, char middleInitial, String lastName) {
            this.firstName = firstName;
            this.middleInitial = middleInitial;
            this.lastName = lastName;
        }

        // Prompts and validates all name fields
        public void populate(Scanner scanner) {
            scanner.nextLine(); // flush leftover newline from previous nextInt()

            System.out.print("Enter student's first name: ");
            this.firstName = scanner.nextLine().trim();

            System.out.print("Enter student's middle initial: ");
            this.middleInitial = scanner.nextLine().trim().charAt(0);

            System.out.print("Enter student's last name: ");
            this.lastName = scanner.nextLine().trim();
        }

        @Override
        public String toString() {
            return firstName + " " + middleInitial + ". " + lastName;
        }
    }

    static class Student {
        private Date birthdate;
        private Name studentName;
        float GPA;
        int creditsTaken;

        public Student() {
            // No-arg constructor so Student can be created before populating
            this.birthdate = new Date();
            this.studentName = new Name();
        }

        // Populates name, birthdate, GPA, and credits all from within Student
        public void populate(Scanner scanner) {
            studentName.populate(scanner);
            birthdate.populate(scanner);

            System.out.print("Enter GPA: ");
            this.GPA = scanner.nextFloat();

            System.out.print("Enter credits taken: ");
            this.creditsTaken = scanner.nextInt();
        }

        @Override
        public String toString() {
            return studentName + " | DOB: " + birthdate + " | GPA: " + GPA + " | Credits: " + creditsTaken;
        }
    }
}
