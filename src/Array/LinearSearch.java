package Array;
import java.util.*;
public class LinearSearch {
	public static void main(String[] args) 
	{
		int i,n,search;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number of Array");
		n=sc.nextInt();
		
		int ar[]=new int[n];
		System.out.println("Enter array element");
		for(i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter value to find");
		search=sc.nextInt();
		
		for(i=0;i<ar.length;i++)
		{
			if(ar[i]==search)
			{
				System.out.println(search + "is present at loaction"+(i+1)+".");
				break;
			}
		}
		if(i==n)		
		{
			System.out.println("search + \"isn't present in array");
		}
	}
}
