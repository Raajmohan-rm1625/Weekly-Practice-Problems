import java.util.Scanner;
public class w3q5{
	public static void main(String[], args){
	int age;
	Scanner input=new Scanner(System.in);
	System.out.print("Enter your age: ");
	age=input.nextInt();
	if(age>=18){
	System.out.println("Yes,Eligible to vote");
	}
	else{
	System.out.println("Sorry,ineligible to vote");
	}
	}
}