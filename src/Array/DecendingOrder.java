package Array;
import java.util.*;
public class DecendingOrder {
	public static void main(String[] args) 
	{
		int i,j,temp;
		Scanner sc= new Scanner(System.in);
		
		int ar[]=new int[5];
		System.out.println("Enter number for Decending Order");
		for(i=0;i<=4;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(i=0;i<=4;i++)
		{
			for(j=i+1;j<=4;j++)
			{
				if(ar[i]<ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.println("Decending Oder ");
		for(i=0;i<=4;i++)
		System.out.println(ar[i]);
	}
}
