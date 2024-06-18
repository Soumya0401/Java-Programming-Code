package javabasic;
import java.util.*;
public class VowelConso {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Charcater");
		char ch=sc.next().charAt(0);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
			System.out.println("Entered character "+ch+" is  Vowel"); 
        }
        else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
        	System.out.println("Entered character "+ch+" is Consonant");
        else
        	System.out.println("Not an alphabet");		
        }	
	}
