package Methods;
import java.util.*;
public class TWODArrayMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoDArray Obj=new TwoDArray();
		int i,j,num; 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number");
		num=sc.nextInt();
		
		int [][]ar=new int[3][3];
		System.out.println("Enter Array Elemets");
		for(i=0;i<ar.length;i++)
		{
			for(j=0;j<ar.length;j++)
			{
				ar[i][j]=sc.nextInt();
			}
		}
		Obj.array(ar);
	}
}
class TwoDArray
{
	void array(int arr[][])
	{
		int i,j;
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
	}
	
}