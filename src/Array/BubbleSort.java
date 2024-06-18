package Array;
import java.util.*;
public class BubbleSort {
	public static void main(String[] args) 
	{
		int i ,j ,n,temp;
		int intArray[]=new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number of array element");
		n=sc.nextInt();
		
		System.out.println("Enter the array Element");
		for(i=0;i<n;i++)
		{
			intArray[i]=sc.nextInt();
		}
		System.out.println("Original array: " + Arrays.toString(intArray));
         n = intArray.length;
       
        for ( i = 0; i<n-1; i++)
        {
            for (j = 0; j<n-1; j++)
            {
                   
                if (intArray[j] > intArray[j+1]) 
                {
                    temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                }
            }
        }
               
        System.out.println("Sorted array: " + Arrays.toString(intArray));
    }		
}


