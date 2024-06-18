package Array;
import java.util.Arrays;
public class DuplicateElement {
	public static void main (String[] args)
	{  
		int arr[] = {10,70,30,90,20,20,30,40,70,50};
	       Arrays.sort(arr);
	       int[] result = removeDuplicateElements(arr);
	       for (int i=0; i<result.length; i++)
	       {
	          if(result[i] != 0)
	          {
	             System.out.print(result[i]+" ");
	          }        
    }  
}  
			public static int[] removeDuplicateElements(int arr[]){
			      int n = arr.length;
			      int[] temp = new int[n];
			      int j = 0;
			      for (int i=0; i<n-1; i++)
			      {
			         if (arr[i] != arr[i+1])
			         {
			            temp[j++] = arr[i];
			         }
			      }
			      temp[j++] = arr[n-1];    
			     
			      return temp;
			}	       
  }