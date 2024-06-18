package javabasic;
import java.util.*;
public class ArrayEvenOdd {
	public static void main(String[] args) 
	{
		
		int even=0,odd=0,num,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		num=sc.nextInt();
		
		int [] ar= new int[5];
		System.out.println("Enter Array Element");
		for(i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0)
			{
				even++;
			}
			else
				odd++;
		}

			System.out.println("Number of even elements in Array ="+even);
			System.out.println("Number of odd elements in Array ="+odd);
		
	}

}
