package javabasic;
import java.util.*;
public class ComapareNumber {
	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number");
		a=sc.nextInt();
		System.out.println("Enter Second Number");
		b=sc.nextInt();
		System.out.println("Enter Third Number");
		c=sc.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("a is greatest");
			if(b>c)
				System.out.println("b is middle and c is smallest");
			else
				System.out.println("c is middle and b is smallest");
		}
		else if(b>c)
		{
			System.out.println("b is greatest");
			if(a>c)
				System.out.println("a is middle and c is smallest");
			else
				System.out.println("c is middle and a is smallest");
		}
		else
		{
			System.out.println("c is greatest");
			if(a>b)
				System.out.println("a is middle and b is smallest");
			else
				System.out.println("b is middle and a is smallest");

		}

	}
}
