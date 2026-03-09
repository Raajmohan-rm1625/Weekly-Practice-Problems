import java.util.Scanner;
public class w3l3q7{
public static void main(String args[]){
double weight,height,bmi;
Scanner input=new Scanner(System.in);
System.out.print("Enter your weight:");
weight=input.nextInt();
System.out.print("Enter height in (cm): ");
height=input.nextInt();
height=height/100;
bmi=weight/(height*height);
if(bmi<=18.4){
	System.out.println("BMI is"+bmi+"and you are underweight.");
}
else if(bmi>18.4 && bmi<=24.9){
	System.out.println("BMI is"+bmi+"and you are normal.");
}
else if(bmi>24.9 && bmi<=39.9){
	System.out.println("BMI is"+bmi+"and you are overweight.");
}
else{
	System.out.println("BMI is"+bmi+"and you are obese.");
}

	}

}