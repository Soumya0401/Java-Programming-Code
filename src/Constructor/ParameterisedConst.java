package Constructor;
import java.util.*;
public class ParameterisedConst {
	public static void main(String[] args)
	{
		String s;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		s=sc.nextLine();
		K a= new K(5,s);
		a.show();
	}
}
class K
{
	String str;
	int x;
	K(int i, String s)
	{
		x=i;
		str=s;
		System.out.println("Parameterized Constructor");
	}
	void show()
	{
		System.out.println("X= "+x);
		System.out.println(str);
	}
}
