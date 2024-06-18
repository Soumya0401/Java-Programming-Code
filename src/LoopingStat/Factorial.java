package LoopingStat;
import java.util.*; 
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,fact=1,num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number for Fcatorial");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("Factorial ="+fact);	

	}

}
