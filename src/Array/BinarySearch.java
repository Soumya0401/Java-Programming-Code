package Array;
import java.util.*;
public class BinarySearch {
	public static void main(String[] args) 
	{
		int i,first,last,mid,n,search;
		int ar[]=new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of Elements");
		n=sc.nextInt();
		
		System.out.println("Enter Element to find");
		search= sc.nextInt();
		
		System.out.println("Enter Array Element");
		for(i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		first=0;
		last=n-1;
		mid=(first+last)/2;
		
		while(first<=last)
		{
			if(ar[mid]<search)
			{
				first=mid+1;
			}
			else if(ar[mid]==search)
			{
				System.out.println("Elements is found at index :"+mid);
			}
			else
			{
				last=mid-1;
			}
			mid=(first+last)/2;

				if(first>last)
				{
					System.out.println("search isn't present in array" );

				}
		}
		
		
		



	}

}
