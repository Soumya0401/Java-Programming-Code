package Array;
import java.util.*;
public class InsertionSort {
	public static void main(String[] args) 
	{
		int i,j,n,temp;
		int ar[]=new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number of Element");
		n=sc.nextInt();
		
		System.out.println("Enter the Array Element");
		for(i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(i=1;i<n;i++)
		{
			for(j=i;j>0;j--)
			{
				if(ar[j-1]>ar[j])
				{
					temp=ar[j];
					ar[j]=ar[j-1];
					ar[j-1]=temp;
				}
			}
		}
		System.out.println("Soted List in Ascending order");
		{
			for(i=0;i<n;i++)
			{
				System.out.println(ar[i]);
			}
		}

	}
}
