package javabasic;
import java.util.Scanner;
public class AreaofCube {
	public static void main(String[] args)
	{
		AreaofCube obj=new AreaofCube();
		obj.area();
		
	}
void area()
{
		double l,b,h,a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Cube");
		l=sc.nextDouble();
		
		System.out.println("Enter breadth of Cube");
		b=sc.nextDouble();
		
		System.out.println("Enter height of Cube");
		h=sc.nextDouble();
		
		a=l=b=h;
		
		double res=6*(a*a);  
		
		System.out.println("Area of Cube ="+ res);
}
}



