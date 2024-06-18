package javabasic;
import java.util.*;
public class Calcualtor {
	public static void main(String[] args) 
	{
		double  num1,num2,res;
		char oper;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Number");
		num1=sc.nextDouble();
		
		System.out.println("Enter Second Number");
		num2=sc.nextDouble();
		
		System.out.println("Enter Operator for Calculation(+,-,*,/,%)");
		oper=sc.next().charAt(0);
		
		switch(oper)
		{
		case '+' :
			res=num1+num2;
			System.out.println("Add the Number ="+res);
			break;
			
		case '-' :
			res=num1-num2;
			System.out.println("Subtract the Number ="+res);
			break;
			
		case '*' :
			res=num1*num2;
			System.out.println("Multiply the Number ="+res);
			break;
			
		case '/' :
			res=num1/num2;
			System.out.println("Divide the Number ="+res);
			break;
			
		case '%' :
			res=num1%num2;
			System.out.println("Modulus the Number ="+res);
			break;
			
			default:
				System.out.println("Enter Correct Operator for Calculation");
			
		}
	}

}
