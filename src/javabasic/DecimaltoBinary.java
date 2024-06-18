package javabasic;
import java.util.*;
public class DecimaltoBinary {
	public static void main(String[] args) 
	{
		long num, dec, rem, binary = 0;
		int temp=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Decimal Number");
		num=sc.nextLong();
		   dec = num;
		   while (num!=0) 
		   {
		      rem = num%2;
		      num = num / 2;
		      binary = binary + rem*temp;
		      temp = temp * 10;
		   }
		   System.out.println("Binary Number ="+binary);
	}

}
