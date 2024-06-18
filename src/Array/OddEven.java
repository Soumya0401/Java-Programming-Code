package Array;
import java.util.Scanner;
public class OddEven {
	public static void main(String[] args)
	{
		int i,j,n,temp;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of element");
		n= sc.nextInt();
		int ar[]= new int[5];
		System.out.println("Enter Array Element");
		for(i=0;i<=4;i++)
		{
			ar[i]= sc.nextInt();
	}
		for(i=0;i<=4;i++) 
		{
			for(j=i+1;j<=4;j++)
			{
				if(ar[i]>ar[j])
				{
						temp=ar[i];
						ar[i]=ar[j];
						ar[j]=temp;
				}
			}
		}
		System.out.println("Ascending Order");
		for(i=0;i<=4;i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println("Odd Number");
	for(i=0;i<=4;i++)
	{
		if(ar[i]%2!=0)
		{
			System.out.println(ar[i]);
		}
	}
	System.out.println("Even Number");
	for(i=0;i<=4;i++)
	{
		if(ar[i]%2==0)
		{
			System.out.println(ar[i]);
		}
	}
	}
}

