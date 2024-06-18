package javabasic;
import java.util.*;
public class Calculator {

	public static void main(String[] args)
	{
		double num1,num2;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Number");
		num1=sc.nextDouble();
		System.out.println("Enter Second Number");
		num2=sc.nextDouble();
		double sum=num1+num2;
		System.out.println("Add  Number ="+sum);
		
		
		System.out.println("Enter First Number");
		num1=sc.nextDouble();
		System.out.println("Enter Second Number");
		num2=sc.nextDouble();
		double sub=num1-num2;
		System.out.println("Subtract of Number ="+sub);
		
		
		System.out.println("Enter First Number");
		num1=sc.nextDouble();
		System.out.println("Enter Second Number");
		num2=sc.nextDouble();
		double mul=num1*num2;
		System.out.println("Multiply of Number ="+mul);
		
		System.out.println("Enter First Number");
		num1=sc.nextDouble();
		System.out.println("Enter Second Number");
		num2=sc.nextDouble();
		double div=num1/num2;
		System.out.println("Divide of Number ="+div);
		
		System.out.println("Enter First Number");
		num1=sc.nextInt();
		System.out.println("Enter Second Number");
		num2=sc.nextInt();
		double rem=num1%num2;
		System.out.println("Remainder of Number ="+rem);
				
	}
}
