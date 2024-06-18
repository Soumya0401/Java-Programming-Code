package Typecasting;
import java.util.*;
public class GreatestNum {

	public static void main(String[] args) 
	{
		String s1,s2,s3;
		int x,y,z;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Number");
		s1=sc.nextLine();
		x=Integer.parseInt(s1);
		
		System.out.println("Enter Second Number");
		s2=sc.nextLine();
		y=Integer.parseInt(s2);
		
		System.out.println("Enter Third Number");
		s3=sc.nextLine();
		z=Integer.parseInt(s3);
		
		if(x>y && x>z)
		{
			System.out.println("X is Greatest");
		}
		else if(y>x && y>z)
		{
			System.out.println("Y is Greatest");
		}
		else
		{
			System.out.println("Z is Greatest");
		}

	}

}
