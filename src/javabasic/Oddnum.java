package javabasic;
import java.util.*;
public class Oddnum {
	public static void main(String[] args)
	{
		int num,i,oddsum=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		
	      for ( i = 1; i <= 2 * num; i += 2)
	      {
	    	  oddsum += i;
	      }
		System.out.println("Odd Natural Sum ="+oddsum);
	}
}
