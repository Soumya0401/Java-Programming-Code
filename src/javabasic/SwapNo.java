package javabasic;
import java.util.*;
public class SwapNo {
	public static void main(String[] args) 
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first Number");
		a=sc.nextInt();
		
		System.out.println("Enter Second Number");
		b=sc.nextInt();
		
		System.out.println("SWAP NUMBER");
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a+" "+b);

	}

}
