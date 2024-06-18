package javabasic;
import java.util.*;
public class AverageNumber {
	public static void main(String[] args)
	{
		float n1,n2,n3,n4,n5;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Number");
		n1=sc.nextFloat();
		
		System.out.println("Enter Second Number");
		n2=sc.nextFloat();
		
		System.out.println("Enter Third Number");
		n3=sc.nextFloat();
		
		System.out.println("Enter Four Number");
		n4=sc.nextFloat();
		
		System.out.println("Enter Five Number");
		n5=sc.nextFloat();
		
		float avg=n1+n2+n3+n4+n5/5;
		System.out.println("Average of a number ="+avg);	

	}
}
