package MultiDimensionalArray;
import java.util.*;
public class MatrixMulti {

	public static void main(String[] args)
	{
		int i,j,k=0;
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
		int ar3[][]=new int[3][3];
		System.out.println("Matrix Multiplication");
		for( i=0;i<3;i++)
		{    
			for(j=0;j<3;j++)
			{    
			ar3[i][j]=0;      
			for( k=0;k<3;k++)      
			{      
			ar3[i][j]+=ar1[i][k]*ar2[k][j];  
				}
			}
		}
		 System.out.println("The product is:");
	        for (i = 0; i<=2; i++)
	        {
	            for (j = 0; j<=2; j++)
	            {
	                System.out.print(ar3[i][j] + " ");
	            }
	            System.out.println();
	        }
	}
}
