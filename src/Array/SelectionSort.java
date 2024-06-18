package Array;
import java.util.Scanner;
public class SelectionSort {
	public static void main(String[] args) 
	{
		int i,j,n,temp,pos;
		int ar[]=new  int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number of elements");
		n=sc.nextInt();
		
		System.out.println("Enter Array Elements");
		for(i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(ar[i]>ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
			System.out.println("Sorted List in Ascending Order");
			for(i=0;i<n;i++)
			{
				System.out.println(ar[i]);
		}
	}
}


		
