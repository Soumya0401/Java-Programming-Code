package StringMethods;
import java.util.*;
public class Removewhitespace {
	public static void main(String[] args) 
	{
		String st;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		st=sc.nextLine();
		st=st.replaceAll("\\s", "");
		System.out.println("Remove White Space ="+st);
	}
}
