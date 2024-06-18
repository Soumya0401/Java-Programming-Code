package javabasic;
public class RemoveHTMLTag {
public static void main(String[] args) 
	{
			      String str = "<p><b>Welcome to JAVA Programming</b></p>";
			      System.out.println("Before removing HTML Tags: " + str);
			      str = str.replaceAll("\\<.*?\\>", "");
			      System.out.println("After removing HTML Tags: " + str);
	}

}
