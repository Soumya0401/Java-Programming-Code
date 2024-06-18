package javabasic;
import java.util.*;
public class AreaofPrism {
	public static void main(String[] args) 
	{
		float height,width,length;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Height of Prism");
		height=sc.nextInt();
		
		System.out.println("Enter width of Prism");
		width=sc.nextInt();
		
		System.out.println("Enter Length of Prism");
		length=sc.nextInt();
		
		float area= 2 * ((length * height) + (width * height) + (length * width));
		System.out.println("Area of Prism ="+area);
	}
}
