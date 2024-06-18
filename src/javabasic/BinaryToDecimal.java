package javabasic;
import java.util.*;
public class BinaryToDecimal {
	public static void main(String[] args)
	{
		int  num, binary_val, decimal_val = 0,base = 1, rem; 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Binary Number");
		num=sc.nextInt();
		
		 binary_val = num;
		    while (num > 0)
		    {
		        rem = num % 10;
		        decimal_val = decimal_val + rem * base;
		        num = num / 10 ;
		        base = base * 2;
		    }
		    System.out.println("Decimal Number = "+decimal_val);
	}
}
