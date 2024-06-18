package javabasic;
import java.util.*;
public class AreaofRect {
	public static void main(String[] args) 
	{			
			AreaofRect obj = new AreaofRect();
			obj.area();
			
	}		
		void area()
		{
				double l,b;		
				Scanner sc = new Scanner(System.in);
				System.out.println("enter Length value");
				l= sc.nextDouble();
				
				System.out.println("enter Breath value");
				b= sc.nextDouble();
				
				
				double output = l*b;
				System.out.println("Area of Rectangle="+ output);
		
		}	
	}
