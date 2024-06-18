package Operators;
import java.util.*;
public class TernaryLMS {

	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first Number");
		int x=sc.nextInt();
		System.out.println("Enter Second Number");
		int y=sc.nextInt();
		System.out.println("Enter Third Number");
		int z=sc.nextInt();
		
		int largestNumber= (x > y) ? (x > z ? x : z) : (y > z ? y : z);  
		System.out.println("The largest numbers is:  "+largestNumber); 
		
		int MiddleNumber= (x>y)? (z>x ? x:(y>z?y:z)): (z>y? y:(x>z?x:z)); 
		System.out.println("The Middle numbers is:  "+MiddleNumber); 
		
		int SmallNumber= z < (x < y ? x : y) ? z : ((x < y) ? x : y);
		System.out.println("The Small numbers is:  "+SmallNumber);
		}    
	}
