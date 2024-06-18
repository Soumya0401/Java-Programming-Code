package javabasic;
import java.util.Scanner;
public class AreaofCircle {
	public static void main(String[] args) {	
		
		AreaofCircle obj = new AreaofCircle();
		obj.area();
	}
	
	void area()
	{
		double pie = 3.14;
		int r;		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
		r = sc.nextInt();		
		double output = pie * r * r;
		System.out.println(output);
	}
}