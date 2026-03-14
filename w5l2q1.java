import java.util.Scanner;

public class w5l2q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Number of employees
        int numEmployees = 10;
        
        // Step 2: Define double arrays to save salary and years of service
        double[] salaries = new double[numEmployees];
        double[] yearsOfService = new double[numEmployees];
        
        // Define arrays to save bonus amount and new salary
        double[] bonusAmount = new double[numEmployees];
        double[] newSalary = new double[numEmployees];
        
        // Variables to save totals
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        
        System.out.println("========== ZARA EMPLOYEE BONUS CALCULATOR ==========\n");
        
        // Step 4: Loop to take input from user with input validation
        System.out.println("Enter details for 10 employees:\n");
        
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("--- Employee " + (i + 1) + " ---");
            
            // Get salary with validation
            boolean validSalary = false;
            while (!validSalary) {
                System.out.print("Enter salary: ");
                if (sc.hasNextDouble()) {
                    double salary = sc.nextDouble();
                    if (salary > 0) {
                        salaries[i] = salary;
                        validSalary = true;
                    } else {
                        System.out.println("Invalid input! Salary must be greater than 0. Please try again.");
                    }
                } else {
                    System.out.println("Invalid input! Please enter a valid number.");
                    sc.nextLine(); // Clear invalid input
                }
            }
            
            // Get years of service with validation
            boolean validYears = false;
            while (!validYears) {
                System.out.print("Enter years of service: ");
                if (sc.hasNextDouble()) {
                    double years = sc.nextDouble();
                    if (years >= 0) {
                        yearsOfService[i] = years;
                        validYears = true;
                    } else {
                        System.out.println("Invalid input! Years of service cannot be negative. Please try again.");
                    }
                } else {
                    System.out.println("Invalid input! Please enter a valid number.");
                    sc.nextLine(); // Clear invalid input
                }
            }
            
            System.out.println();
        }
        
        // Step 5: Loop to calculate bonus based on years of service
        System.out.println("\n========== BONUS CALCULATION ==========\n");
        
        for (int i = 0; i < numEmployees; i++) {
            // Calculate bonus based on years of service
            // 5% if years of service > 5, otherwise 2%
            if (yearsOfService[i] > 5) {
                bonusAmount[i] = salaries[i] * 0.05;
            } else {
                bonusAmount[i] = salaries[i] * 0.02;
            }
            
            // Calculate new salary
            newSalary[i] = salaries[i] + bonusAmount[i];
            
            // Calculate totals
            totalBonus += bonusAmount[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalary[i];
        }
        
        // Step 6: Print results
        System.out.println("Employee Details with Bonus Calculation:\n");
        System.out.println("Emp# | Old Salary   | Years | Bonus %  | Bonus Amount | New Salary");
        System.out.println("---------------------------------------------------------------------------");
        
        for (int i = 0; i < numEmployees; i++) {
            // Determine bonus percentage
            String bonusPercentage = yearsOfService[i] > 5 ? "5%" : "2%";
            
            System.out.printf("%2d   | Rs. %9.2f | %5.1f | %7s | Rs. %10.2f | Rs. %10.2f\n",
                    (i + 1),
                    salaries[i],
                    yearsOfService[i],
                    bonusPercentage,
                    bonusAmount[i],
                    newSalary[i]);
        }
        
        System.out.println("---------------------------------------------------------------------------");
        
        // Print total summary
        System.out.println("\n========== SUMMARY REPORT ==========\n");
        System.out.printf("Total Old Salary (All Employees):  Rs. %.2f\n", totalOldSalary);
        System.out.printf("Total Bonus Payout:                Rs. %.2f\n", totalBonus);
        System.out.printf("Total New Salary (All Employees):  Rs. %.2f\n", totalNewSalary);
        System.out.printf("Average Bonus per Employee:        Rs. %.2f\n", totalBonus / numEmployees);
        
        sc.close();
    }
}