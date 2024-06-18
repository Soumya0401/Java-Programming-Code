package Operators;
import java.util.*;
public class ArthematicOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first Values");
		n1=sc.nextInt();
		System.out.println("Enter the second Values");
		n2=sc.nextInt();
		n3=n1+n2;
		System.out.println("Add ="+n3);
		n3=n1-n2;
		System.out.println("Subtract ="+n3);
		n3=n1*n2;
		System.out.println("Multiply ="+n3);
		n3=n1/n2;
		System.out.println("Divide ="+n3);
		n3=n1%n2;
		System.out.println("Mod="+n3);
			

	}

}
