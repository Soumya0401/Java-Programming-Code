package Array;
import java.util.*;
public class ArraySum1 {

	public static void main(String[] args) 
	{
		int i,num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number for input");
		num=sc.nextInt();
		int ar1[]=new int[5];
		System.out.println("Enter First Array Number");
		for(i=0;i<num;i++)
		{
			ar1[i]=sc.nextInt();
			
		}
		int ar2[]=new int[5];
		System.out.println("Enter Second Array Number");
		for(i=0;i<num;i++)
		{
			ar2[i]=sc.nextInt();
		}
		int ar3[]=new int[5];
		System.out.println("Array Sum");
		for(i=0;i<=num;i++)
		{
			ar3[i]=ar1[i]+ar2[i];
			System.out.println(ar3[i]);
		}
		int avg=ar3[i]/num;
		System.out.println("Average Sum ="+avg);
		
	}

}
