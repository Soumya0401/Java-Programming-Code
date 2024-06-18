package Typecasting;
import java.util.*;
public class SwapNo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,temp=0;
		String s1,s2;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Number");
		s1=sc.nextLine();
		num1= Integer.parseInt(s1);
		
		System.out.println("Enter Second Number");
		s2=sc.nextLine();
		num2=Integer.parseInt(s2);
		
		temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("Before Swapping = "+num1);
		System.out.println("Before Swapping = "+num2);
		
	}
}
