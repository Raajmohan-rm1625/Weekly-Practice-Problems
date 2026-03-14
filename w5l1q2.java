import java.util.Scanner;

public class w5l1q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Step 1: Define an integer array of 5 elements
        int[] numbers = new int[5];
        
        System.out.println("=== Number Analysis Program ===\n");
        
        // Get user input to store in the array
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("\n=== Analysis Results ===\n");
        
        // Step 2 & 3: Loop through the array and check positive, negative, or zero
        // For positive numbers, check even or odd
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + " (" + numbers[i] + "): ");
            
            if (numbers[i] > 0) {
                // Positive number - check if even or odd
                if (numbers[i] % 2 == 0) {
                    System.out.println("Positive and Even");
                } else {
                    System.out.println("Positive and Odd");
                }
            } else if (numbers[i] < 0) {
                // Negative number
                System.out.println("Negative");
            } else {
                // Zero
                System.out.println("Zero");
            }
        }
        
        // Step 4: Compare first and last elements
        System.out.println("\n=== Comparison of First and Last Elements ===\n");
        
        int firstElement = numbers[0];
        int lastElement = numbers[numbers.length - 1];
        
        System.out.println("First Element: " + firstElement);
        System.out.println("Last Element: " + lastElement);
        System.out.print("Comparison: ");
        
        if (firstElement == lastElement) {
            System.out.println("First and Last elements are EQUAL");
        } else if (firstElement > lastElement) {
            System.out.println("First element is GREATER than Last element");
        } else {
            System.out.println("First element is LESS than Last element");
        }
        
        sc.close();
    }
}