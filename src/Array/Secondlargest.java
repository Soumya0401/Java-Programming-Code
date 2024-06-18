package Array;
import java.util.*;
public class Secondlargest {
	public static void main(String[] args) 
	{
		int i,n;
		int largest=0;
		int secondlargest=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		n= sc.nextInt();
		int ar[]=new int[5];
		System.out.println("Enter Array Element");
		for(i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();			
		}
		for(i=0;i<ar.length;i++)
		{

		if(ar[i]>largest)
		{
			secondlargest=largest;
			largest=ar[i];		
		}
		else if(ar[i]>secondlargest)
		{
			secondlargest=ar[i];
		}
		}
		//System.out.println("the  highest number is " + largest);
	    System.out.println("the second highest number is " + secondlargest);
	}
	}


