package MultiDimensionalArray;
import java.util.*;
public class MultiArraySum {

	public static void main(String[] args)
	{
		int i,j,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Elements for sum");
		
		int ar[][]=new int[3][3];
		for(i=0;i<ar.length;i++)
		{
			for(j=0;j<ar.length;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<ar.length;i++)
		{
			for(j=0;j<ar.length;j++)
			{
				sum=sum+ar[i][j];
			}
		}
		System.out.println(sum);	

	}
}