package Convertor;

public class StrInt {

	public static void main(String[] args)
	{
		String s="200";
		String st="20.98";
		String str="3456.78";
		String str1="643398";
		String str2="100";
		
		int i=Integer.parseInt(s);  
		System.out.println(i); 
		
		float f=Float.parseFloat(st);
		System.out.println(f);
		
		double d=Double.parseDouble(str);
		System.out.println(d);
		
		long l=Long.parseLong(str1);
		System.out.println(str1);
		
		Integer in=Integer.valueOf(str2);
		System.out.println(in);
	
	}
}
