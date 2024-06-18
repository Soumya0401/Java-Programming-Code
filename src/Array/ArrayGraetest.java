package Array;
import java.util.*;
public class ArrayGraetest {

	public static void main(String[] args)
	{
	
		int i,t,num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number");
		num=sc.nextInt();
	
			int ar[]=new int[5];
			System.out.println("Enter Array Elements");
			for(i=0;i<num;i++)
			{
				ar[i]=sc.nextInt();
			}
		t=ar[0];
		for(i=0;i<num;i++)
		{
			if(ar[i]>t)
			t=ar[i];
		}
		System.out.println("Greatest = "+t);
	}

}
