package MultiDimensionalArray;
import java.util.*;
public class TransposeMatrix {
	public static void main(String[] args) 
	{
		int i,j,k=0;
		Scanner sc=new Scanner(System.in);
		
		int ar1[][]=new int[3][3];
		System.out.println("Enter Matrix for Transpose");
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				ar1[i][j]=sc.nextInt();
				k++;
			}
		}
		System.out.println("After Transpose of Matrix");
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
			{
				System.out.println(ar1[j][i]);
			}
			System.out.println();
		}
	}
}
