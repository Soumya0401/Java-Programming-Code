package javabasic;
import java.util.Scanner;
public class VolofCuboid {
	public static void main(String[] args) 
	{
		VolofCuboid obj=new VolofCuboid();
		obj.area();
	}
void area()
{
		float l,b,h;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Length of Cuboid");
		l= sc.nextFloat();
		
		System.out.println("Enter Breadth of Cuboid");
		b= sc.nextFloat();
		
		System.out.println("Enter Height of Cuboid");
		h= sc.nextFloat();
		
		double volume=l*b*h;  
		
		System.out.println("Volume of Sphere ="+ volume);
}

}
