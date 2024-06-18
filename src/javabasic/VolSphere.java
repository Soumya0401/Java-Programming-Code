package javabasic;
import java.util.Scanner;
public class VolSphere {
	public static void main(String[] args) 
	{
		VolSphere obj=new VolSphere();
		obj.area();
	}		
	void area()
		{
				double pie=3.14,r;
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter radius of Sphere");
				r= sc.nextFloat();
				
				double volume=(4.0/3.0)*pie*(r*r*r);  
				
				System.out.println("Volume of Sphere ="+ volume);
		}

}
