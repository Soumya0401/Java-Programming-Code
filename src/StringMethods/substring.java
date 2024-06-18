package StringMethods;
import java.util.*;
public class substring {
	public static void main(String[] args) 
	{
		String str;
		Scanner sc= new Scanner(System.in);
		System.out.println("Substring of two position");
		str=sc.nextLine();
		
		String st_new=str.substring(1,10);
		System.out.println("Substring of strings ="+st_new);
	}
}
