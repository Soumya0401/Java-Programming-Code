package StringMethods;
public class InsertString 
{
	public static void stringinsert(String str1, String str2, int index)
	{
		String res= new String();
		for(int i=0;i<str1.length();i++)
		{
			res = res+str1.charAt(i);
	         if (i == index) {
	            res =res+ str2;	
	}
}
		System.out.println(res);
	}
	public static void main(String[] args) 
	{	
		String str1 = " Java Program";
	      String str2= "Learning";
	      int index = 0;
	      System.out.println("The first string is defined as: " + str1);
	      System.out.println("The second string is defined as: " +str2);
	      System.out.println("String to be inserted at index: " + index);
	      System.out.println("The result is: ");
	      stringinsert(str1, str2, index);
	}
}
	