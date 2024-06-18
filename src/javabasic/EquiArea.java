package javabasic;
import java.util.Scanner;
public class EquiArea {
	public static void main(String[] args)
	{
		{			
			EquiArea obj = new EquiArea();
			obj.area();
		}
			
	}		
	void area()
	{
		double a;		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter base value");
		a= sc.nextDouble();
		
		double  area1=(Math.sqrt(3)/4)*(a*a);
		System.out.println("Area of Equilateral Triangle="+ area1);
		
	}
}
