package MultiDimensionalArray;
import java.util.*;
public class MatrixAdd {

	public static void main(String[] args) 
	{	
		int i,j;
		Scanner sc=new Scanner(System.in);
		
		int ar1[][]=new int[3][3];
		System.out.println("Enter Row Matrix");
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				ar1[i][j]=sc.nextInt();
			}
		}
		int ar2[][]=new int[3][3];
		System.out.println("Enter Column Matrix");
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				ar2[i][j]=sc.nextInt();
			}
		}
		int sum[][]= new int[3][3];
		System.out.println("Sum of Matrix");
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				sum[i][j]=ar1[i][j]+ar2[i][j];
				System.out.println(sum[i][j]);
			}
		}
		System.out.println();
	}

}
