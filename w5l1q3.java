import java.util.Scanner;

public class w5l1q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Step 1: Get integer input and define array
        System.out.println("=== Multiplication Table Generator ===\n");
        System.out.print("Enter a number to generate its multiplication table: ");
        int number = sc.nextInt();
        
        // Define integer array to store multiplication results (1 to 10)
        int[] multiplicationTable = new int[10];
        
        // Step 2: Run loop from 1 to 10 and store results
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
        }
        
        // Step 3: Display the results in format "number * i = result"
        System.out.println("\n=== Multiplication Table of " + number + " ===\n");
        
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " × " + i + " = " + multiplicationTable[i - 1]);
        }
        
        sc.close();
    }
}