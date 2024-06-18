package StringMethods;

public class ComapreString {

	public static void main(String[] args) 
	{
		String s="JAVA Programming";
		String st="JAVA Programming";
		String str="Python Programming";
		String str1="java Programming";
		
		boolean compare=s.equals(st);
		boolean compare1=s.equals(str);
		boolean compare2=st.equalsIgnoreCase(str1);
		
		System.out.println("Comapare String = "+compare);
		System.out.println("Compare String ="+compare1);
		System.out.println("Comapre String to ignore Case ="+compare2);
	}
}
