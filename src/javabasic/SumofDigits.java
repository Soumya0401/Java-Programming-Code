package javabasic;
import java.util.*;
public class SumofDigits {
	public static void main(String[] args) 
	{
		int sum=0,rem,num;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		num=sc.nextInt();
		
		while(num>0)
		{
				rem=num%10;
	            sum=sum+rem;
	            num /= 10;
	        }
		System.out.println("SUM OF DIGITS ="+sum);
		
	}
}
