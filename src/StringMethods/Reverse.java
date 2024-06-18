package StringMethods;
import java.util.*;
public class Reverse {
	public static void main(String[] args) 
	{
		String str;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String for Reverse");
		str=sc.nextLine();
		StringBuffer sb=new StringBuffer(str);
		 System.out.println("Reverse of String =" +sb.reverse());
		
	}
}
