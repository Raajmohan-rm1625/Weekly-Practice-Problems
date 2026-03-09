import java.util.Scanner;
public class Level1q2{
	public static void main(String[] args){
	double base, height;
	double area,inArea;
	Scanner input=new Scanner(System.in);
	System.out.print("Enter base in cm");
	base=input.nextDouble();
	System.out.print("Enter height in cm");
	height=input.nextDouble();
	area=(base*height)/2;
	inArea=area*2.54;
	System.out.println("The Area of the triangle in sq in is "+inArea+" and sq cm is "+area);

	}
}
