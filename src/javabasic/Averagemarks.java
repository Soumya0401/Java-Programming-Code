package javabasic;
import java.util.*;
public class Averagemarks {
	public static void main(String[] args) 
	{
		int i,n,avg=0,temp;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		n=sc.nextInt();
		
		int ar[]=new int[n];
		System.out.println("Enter marks");
		for(i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(i=0;i<ar.length;i++)
		{
			avg = avg + ar[i];
			
		}
		temp =avg/n;
		
		System.out.println("Average Marks ="+avg);
		System.out.println("Average Marks ="+temp);
	}
}
