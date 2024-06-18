package Methods;
import java.util.*;
public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		S obj=new S();
		int i,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		num=sc.nextInt();
		
		int arr[]=new int[5];
		System.out.println("Enter Array Element");
		for(i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		obj.sort(arr);
	}
}
class S
{
	void sort(int ar[])
	{
		int i,j,t;
		for(i=0;i<ar.length;i++)
		{
			for(j=0;j<ar.length;j++)
			{
				if(ar[i]>ar[j])
				{
					t=ar[i];
					ar[i]=ar[j];
					ar[j]=t;
				}
			}
		}
		System.out.println("Sorting the Array");
		for(i=0;i<ar.length;i++)
		{
			for(j=0;j<ar.length;j++)
			{
				System.out.println(ar[i]);
			}
		}
	}
}
