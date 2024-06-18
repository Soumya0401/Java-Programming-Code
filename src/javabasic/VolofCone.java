package javabasic;

import java.util.Scanner;

public class VolofCone {

	public static void main(String[] args) 
	{
		VolofCone obj=new VolofCone();
		obj.area();
	}
	void area()
	{
		double pie=3.1428;
		double r,h;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius of Cone");
		r=sc.nextDouble();
		
		System.out.println("Enter Height of Cone");
		h=sc.nextDouble();
		
		double volume=(pie*r*r*h)/3;  
		
		System.out.println("Volume of Cone ="+ volume);
	}
}
		
		
		
