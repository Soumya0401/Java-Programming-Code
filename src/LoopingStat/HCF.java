package LoopingStat;
import java.util.*;
public class HCF {

	public static void main(String[] args)
	{
		int n1,n2,i,hcf=0;
		System.out.println("Enter First Number");
		Scanner sc=new Scanner(System.in);
		n1= sc.nextInt();
		
		Scanner sc1= new Scanner(System.in);
		System.out.println("Enter Second Number");
		n2=sc1.nextInt();
		for(i = 1; i <= n1 || i <= n2; i++) 
		{
			 if( n1%i == 0 && n2%i == 0 )
				 hcf = i;
		 }
	      System.out.println("HCF of given two numbers is ::"+hcf);
      }
	}

		 		
		 		 