import java.util.Scanner;

public class w5l3q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("========== DIGIT FREQUENCY COUNTER ==========\n");
        
        // Step 1: Take input for a number
        System.out.print("Enter a number: ");
        long number = sc.nextLong();
        
        // Handle negative numbers by converting to positive
        if (number < 0) {
            number = -number;
        }
        
        // Convert number to string to work with digits
        String numString = String.valueOf(number);
        
        // Step 2: Find the count of digits in the number
        int digitCount = numString.length();
        System.out.println("Number of digits: " + digitCount);
        
        // Step 3: Find digits in the number and save them in an array
        int[] digitsArray = new int[digitCount];
        
        for (int i = 0; i < digitCount; i++) {
            // Extract each digit and store in array
            digitsArray[i] = Character.getNumericValue(numString.charAt(i));
        }
        
        System.out.print("Digits in the number: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digitsArray[i] + " ");
        }
        System.out.println("\n");
        
        // Step 4: Define a frequency array of size 10 (digits 0-9)
        int[] frequencyArray = new int[10];
        
        // Loop through digits array and increase frequency of each digit
        for (int i = 0; i < digitCount; i++) {
            int digit = digitsArray[i];
            frequencyArray[digit]++;
        }
        
        // Step 5: Display the frequency of each digit
        System.out.println("========== FREQUENCY OF EACH DIGIT ==========\n");
        System.out.println("Digit | Frequency");
        System.out.println("--------------");
        
        for (int digit = 0; digit < 10; digit++) {
            if (frequencyArray[digit] > 0) {
                System.out.println("  " + digit + "   |    " + frequencyArray[digit]);
            }
        }
        
        System.out.println("\n========== DETAILED FREQUENCY TABLE ==========\n");
        System.out.println("Digit | Frequency | Occurrence");
        System.out.println("-----------------------------------");
        
        for (int digit = 0; digit < 10; digit++) {
            System.out.print("  " + digit + "   |    " + frequencyArray[digit]);
            
            // Display occurrence bars for visualization
            System.out.print("     | ");
            for (int j = 0; j < frequencyArray[digit]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        // Summary
        System.out.println("\n========== SUMMARY ==========\n");
        System.out.println("Original Number: " + number);
        System.out.println("Total Digits: " + digitCount);
        
        int uniqueDigits = 0;
        for (int i = 0; i < 10; i++) {
            if (frequencyArray[i] > 0) {
                uniqueDigits++;
            }
        }
        System.out.println("Unique Digits: " + uniqueDigits);
        
        sc.close();
    }
}