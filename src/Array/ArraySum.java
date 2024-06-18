package Array;
import java.util.*;
public class ArraySum {

	public static void main(String[] args) 
	{	
		int sum=0,num,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		num= sc.nextInt();
		
		int ar[]=new int[5];
		System.out.println("Enter number for Sum");
		for(i=0;i<num;i++)
		{
			ar[i]=sc.nextInt();
			sum=sum+ar[i];
		}
		System.out.println("Array Sum ="+sum);
		
	}

}
 