package javabasic;

import java.util.Scanner;

public class VolumeofCylinder {

	public static void main(String[] args) 
	{
		{
			VolumeofCylinder obj=new VolumeofCylinder();
			obj.area();
		}	
	}
		void area()
			{
					double pie=3.1428,r,h;
					Scanner sc = new Scanner(System.in);
					System.out.println("Enter radius of Cylinder");
					r= sc.nextFloat();
					
					System.out.println("Enter height of Cylinder");
					h= sc.nextFloat();
				
					double volume=pie*(r*r)*h; 
					
					System.out.println("Volume of Cylinder ="+ volume);

	}
}
