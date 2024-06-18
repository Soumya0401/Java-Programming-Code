package Array;
import java.util.Scanner;
public class SmalIndex {
	public static void main(String[] args) 
	{
		int i,n;
		int ar[]=new int[5];
		int max=ar[0];
		int index=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		n=sc.nextInt();
		System.out.println("Enter Array Element");
		for(i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(i=0;i<ar.length;i++)
		{
			if(max>ar[i])
			{
				max=ar[i];
				index=i;
			}
		}
		System.out.println("Index position of Minimum value in an array is : "+index);
	}
}
