package javabasic;
import java.util.*;
public class InceaseDecrease {
	public static void main(String[] args)
	{
		int num1,num2,num3;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Number");
		num1=sc.nextInt();
		
		System.out.println("Enter Second Number");
		num2=sc.nextInt();
		
		System.out.println("Enter Third Number");
		num3=sc.nextInt();
		
		if(num1<num2 && num2<num3)
		{
			System.out.println("Number in Increasing Order");
		}
		else if(num1>num2 && num2>num3)
		{
			System.out.println("Number in Decreasing Order");
		}
		else
		{
			System.out.println("Neither Increasing Nore Decreasing");
		}
	}

}
