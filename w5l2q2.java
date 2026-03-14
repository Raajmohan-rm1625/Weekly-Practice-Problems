import java.util.Scanner;

public class w5l2q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Step 1: Define arrays to store age and height for 3 friends
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        int numFriends = 3;
        
        System.out.println("========== FRIEND COMPARISON PROGRAM ==========\n");
        System.out.println("Enter age and height for 3 friends:\n");
        
        // Take user input for age and height
        for (int i = 0; i < numFriends; i++) {
            System.out.println("--- " + names[i] + " ---");
            
            System.out.print("Enter age: ");
            ages[i] = sc.nextInt();
            
            System.out.print("Enter height (in cm): ");
            heights[i] = sc.nextDouble();
            
            System.out.println();
        }
        
        // Step 2: Loop through arrays to find youngest and tallest
        // Initialize with first friend's values
        int youngestIndex = 0;
        int tallestIndex = 0;
        
        // Find youngest friend
        for (int i = 1; i < numFriends; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        
        // Find tallest friend
        for (int i = 1; i < numFriends; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        
        // Step 3: Display results
        System.out.println("\n========== RESULTS ==========\n");
        
        System.out.println("Friend Details:");
        System.out.println("Name       | Age | Height (cm)");
        System.out.println("-----------------------------------");
        for (int i = 0; i < numFriends; i++) {
            System.out.printf("%-10s | %3d | %8.2f\n", names[i], ages[i], heights[i]);
        }
        
        System.out.println("\n========== COMPARISON RESULTS ==========\n");
        System.out.println("Youngest Friend: " + names[youngestIndex]);
        System.out.println("  Age: " + ages[youngestIndex] + " years");
        
        System.out.println("\nTallest Friend: " + names[tallestIndex]);
        System.out.println("  Height: " + heights[tallestIndex] + " cm");
        
        sc.close();
    }
}
