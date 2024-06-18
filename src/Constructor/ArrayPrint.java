package Constructor;
import java.util.*;
public class ArrayPrint {
	public static void main(String[] args) 
	{
		P obj=new P();
		int i,j;
		Scanner sc= new Scanner(System.in);
		int [][] arr=new int [3][3];
		System.out.println("Enter 2D Array");
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		obj.print(arr);	
	}

	}
	
	class P
	{
		void print(int ar[][])
		{
			int i,j;
			System.out.println("MultiDimensional Array");
			for(i=0;i<ar.length;i++)
			{
				for(j=0;j<ar.length;j++)
				{
					System.out.println(ar[i][j]);
				}
			}
			
		}
	}


