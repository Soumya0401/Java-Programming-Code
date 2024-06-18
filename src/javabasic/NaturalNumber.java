package javabasic;
import java.util.*;
public class NaturalNumber {
	public static void main(String[] args) 
	{
		int num,sum=0;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter Number");
		num=sc.nextInt();
		for(int i=0;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of First Five Natural Number ="+sum);
	}
}
