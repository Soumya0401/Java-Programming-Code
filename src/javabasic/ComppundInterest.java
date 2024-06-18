package javabasic;
import java.util.*;
public class ComppundInterest {
	public static void main(String[] args) 
	{
			double principle, rate, time, compound_interest;
	      
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter a Principle number : ");
	      principle = sc.nextInt();
	      
	      System.out.print("Enter Interest rate : ");
	      rate = sc.nextInt();
	      
	      System.out.print("Enter a Time period in years : ");
	      time = sc.nextInt();
	      
	      compound_interest = principle * (Math.pow((1 + rate / 100), time)) - principle;
	      System.out.println("The Compound Interest is : " + compound_interest);
	   }
	}
