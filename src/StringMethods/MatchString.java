package StringMethods;
import java.util.*;
public class MatchString {
public static void main(String[] args) 
	{
		String st;
		String str[]= {"Ram","Shyam","Mohan","Sohan","Rohan"};
		int a=0,i;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		st=sc.nextLine();
		for(i=0;i<str.length;i++)
		{
			if(st.equalsIgnoreCase(str[i]))
			{
				a=1;
				break;
			}
			a=0;
		}
		if(a==1)
		{
			System.out.println("Match Found");
		}
		else
		{
			System.out.println("Match not Found");
		}
	}
}
