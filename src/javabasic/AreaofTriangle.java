package javabasic;
import java.util.*;
public class AreaofTriangle {
	public static void main(String[] args) 
			{			
					AreaofTriangle obj = new AreaofTriangle();
					obj.area();
					
			}		
			void area()
			{
				double h,b;		
				Scanner sc = new Scanner(System.in);
				System.out.println("enter base value");
				b= sc.nextDouble();
				
				System.out.println("enter height value");
				h= sc.nextDouble();
				
				
				double output = (h*b)/2;
				System.out.println("Area of Triangle="+ output);
	
			}
	}
