package javaprogram;

public class Swap_Strings {

	public static void main(String[] args) 
	{
		 String s1 = "techno";
	      String s2 = "fine";
	      System.out.println("Value of s1 before swapping :"+s1);
	      System.out.println("Value of s2 before swapping :"+s2);
	      int i = s1.length();
	      s1 = s1+s2;
	      s2 = s1.substring(0,i);
	      s1 = s1.substring(i);
	      System.out.println("Value of s1 after swapping :"+s1);
	      System.out.println("Value of s2 after swapping :"+s2);


	}

}
