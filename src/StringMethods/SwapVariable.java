package StringMethods;

public class SwapVariable {

	public static void main(String[] args) 
	{
		int i;
		String a="Hello";
				String b="World";
				 //a=a+b;
				 i=a.length();
				 a=a+b;
				 b=a.substring(0,i);
				 a=a.substring(i);
				 System.out.println(a);
				 System.out.println(b);
				 


	}

}
