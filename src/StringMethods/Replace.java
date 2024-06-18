package StringMethods;
import java.util.*;
public class Replace {
	public static void main(String[] args) 
	{
		String st="The quick brown fox jumps over the lazy dog.";
		Scanner sc= new Scanner(System.in);
	
		String st1= st.replace('d','f');
		
		System.out.println("Original String ="+st);
		System.out.println("New String ="+st1);
	}

}
