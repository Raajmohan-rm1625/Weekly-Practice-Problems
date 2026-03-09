import java.util.Scanner;
public class Level2q4{
	public static void main(String[] args){
	double feet,yards,miles;
	Scanner input=new Scanner(System.in);
	System.out.print("Enter the distance in feet: ");
	feet=input.nextDouble();
	yards=3*feet;
	miles=yards*1760;
	System.out.println("The distance in yards is "+yards+ "while the distance in miles is "+miles);
	}
}
