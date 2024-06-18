package LoopingStat;
import java.util.*;
public class PalindromeNo {

	public static void main(String[] args) 
	{	
		int rem, num,pal=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number for Palindrome");
		num=sc.nextInt();
		temp=num;
		while(num>0)
		{
			rem=num%10;
			pal=(pal*10)+rem;
			num=num/10;
		}
		if(temp==pal)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not Palindrome Number");
		}
		

	}

}
