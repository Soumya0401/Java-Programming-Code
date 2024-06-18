package javabasic;
import java.util.*;
public class AreaofCuboid {
	public static void main(String[] args) 
	{
		AreaofCuboid obj=new AreaofCuboid();
		obj.area();
		
	}
	void area()
	{
			float l,w,h;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Length of Cuboid");
			l= sc.nextFloat();
			
			System.out.println("Enter Width of Cuboid");
			w= sc.nextFloat();
			
			System.out.println("Enter Height of Cuboid");
			h= sc.nextFloat();
			
			double res=2*( l *w  + w* h + h*l) ;  
			
			System.out.println("Volume of Sphere ="+ res);

	}
}
