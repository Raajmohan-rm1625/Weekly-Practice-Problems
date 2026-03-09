import java.util.Scanner;
public class w3l2q2{
	public static void main(String args[]){
		int year, salary;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter your yrs of experience:");
		year=input.nextInt();
		System.out.print("Enter your salary:");
		salary=input.nextInt();
		if(year > 5){
			salary+=(5*100)/100;
		}
		System.out.println("The new salary:"+salary);

	}
}