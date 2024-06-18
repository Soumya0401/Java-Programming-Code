package LoopingStat;
import java.util.*;
public class PostiveNegative {

	public static void main(String[] args) 
	{
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		num= sc.nextInt();
		if(num>0)
		{
			System.out.println("Positive Number");
		}
		else if(num<0)
		{
		
			System.out.println("Negative Number");
		}
		else
		{
			System.out.println("Neither Positive or nore Negative");
		}
	}
}