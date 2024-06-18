package LoopingStat;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) 
	{
		int arm=0, num,rem,temp;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number for checking");
		num=sc.nextInt();
		
		temp=num;
		while(num>0)
		{
			rem= num%10;
			arm=arm +(rem*rem*rem);
			num=num/10;
		}
		if(arm==temp)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");

	}

}
