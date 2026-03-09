import java.util.Scanner;
public class w3q2{
	public static void main(String args[]){
		int num1,num2,num3;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter num 1:");
		num1=input.nextInt();
		System.out.print("Enter num 2: ");
		num2=input.nextInt();
		System.out.print("Enter num 3:");
		num3=input.nextInt();
		if (num1<num2 && num1<num3){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}

	}
}