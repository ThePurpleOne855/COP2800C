import java.util.Random;

public class Jagged_Array_Assignment {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] jagged = new int[50][];
        
        for (int i = 0; i < 50; i++) {
            // Step 1: first number between 1 and 20
            int firstNumber = random.nextInt(20) + 1;
            
            // Step 2: calculate row length
            int rowLength = Math.min(firstNumber + 1, 20 - firstNumber + 1); 
            // This ensures we don't go past 20
            
            jagged[i] = new int[rowLength];
            
            // Step 3: fill the row sequentially starting from firstNumber
            for (int j = 0; j < rowLength; j++) {
                jagged[i][j] = firstNumber + j;
            }
        }
        
        // Optional: print the jagged array
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}