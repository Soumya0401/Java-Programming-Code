package javabasic;
import java.util.*;
public class Comapare {

	public static void main(String[] args) 
	{
		int num1,num2;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter First Number");
		num1=sc.nextInt();
		
		System.out.println("Enter Second Number");
		num2=sc.nextInt();
		
		if(num1>num2)
			System.out.println("Greatest = "+num1);
		else if(num2>num1)
			System.out.println("Greatest ="+num2);
		else
			System.out.println("Both are equal");	
	}
}
