package Array;
import java.util.*;
public class ArrayIndex {
	public static void main(String[] args) 
	{
       int element ;
        int index = -1;
        Scanner sc= new Scanner (System.in);
        
        System.out.println("Enter the Index Element");
        element=sc.nextInt();
        
        System.out.println("Enter array Elements");
        int ar[]=new int[5];
        for(int i=0;i<ar.length;i++)
        {
        	ar[i]=sc.nextInt();
        }
         
        for(int i = 0; i < ar.length; i++) {
            if(ar[i] == element) 
            {
                index = i;
                break;
            }
        }
         
        System.out.println("Index of "+element+" is : "+index);
		
	}

}
