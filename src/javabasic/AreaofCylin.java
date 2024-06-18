package javabasic;
import java.util.Scanner;
public class AreaofCylin {
	public static void main(String[] args)
	{
		AreaofCylin obj=new AreaofCylin();
		obj.area();

	}
void area()
{
		double pie= 3.1425;
		double r,h;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of Cuboid");
		r=sc.nextDouble();
		
		System.out.println("Enter height of Cuboid");
		h=sc.nextDouble();
		
		double res=(22*r*(r+h))/7;  
		
		System.out.println("Area of Cylinder ="+ res);
}
}

