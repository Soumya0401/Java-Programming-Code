package StringMethods;
import java.util.*;
public class concatstr {
	public static void main(String[] args)
	{
		String st,st1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First String");
		st=sc.next();
		
		System.out.println("Enter Second String");
		st1=sc.next();
		
		String concatenate=st.concat(st1);
		System.out.println("Concatenate String ="+concatenate);
		
	}
}
