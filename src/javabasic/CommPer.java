package javabasic;
import java.util.*;
public class CommPer {
	public static void main(String[] args) 
	{
		double amt,com_per;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Amount");
		amt= sc.nextDouble();
		
		System.out.println("Enter Commision Amount");
		com_per=sc.nextDouble();
		
		double commission=(com_per/100)*amt;
		System.out.println("Commission Percentage ="+commission);
		
	}
}
