package javabasic;
import java.util.*;
public class multiplicationTable {
	public static void main(String[] args) 
	{
		int i,num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		num=sc.nextInt();
		
		for(i=1;i<=10;i++)
		{
			   System.out.println(num+" X "+i+" = " +num*i);
		}

	}
}
