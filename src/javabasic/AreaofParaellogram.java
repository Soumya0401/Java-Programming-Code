package javabasic;
import java.util.*;
public class AreaofParaellogram {
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
        System.out.println("Enter the Height:");
        double h1= s.nextDouble();
        System.out.println("Enter the Breadth:");
        double b= s.nextDouble();
          
        double  area=(h1*b);
        System.out.println("Area of Paraellogram is: " + area);      
	}
}
