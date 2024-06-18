package javabasic;
import java.util.*;
public class SqaureRoot {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a number: ");  
        int num = sc.nextInt();  
        Double squareroot = Math.pow(num, 0.5);
        System.out.println("The Square Root of the Given Number " + num + " = " + squareroot);
 	
	}

}
