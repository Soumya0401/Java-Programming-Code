package javabasic;
import java.util.*;
public class CubeNumber {
	public static void main(String[] args)
	{
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
			 System.out.println( "cube of " +i+" is : "+(i*i*i));  		
		}
	}
}
