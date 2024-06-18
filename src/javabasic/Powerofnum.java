package javabasic;
import java.util.*;
public class Powerofnum {
	public static void main(String[] args) 
	{
		int base,expo;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Base");
		base=sc.nextInt();
		
		System.out.println("Enter Exponent");
		expo=sc.nextInt();
		
		double result = Math.pow(base, expo);
		System.out.println("Power of number="+result);
		}
	}
