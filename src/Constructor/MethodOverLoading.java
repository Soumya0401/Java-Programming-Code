package Constructor;
import java.util.*;
public class MethodOverLoading {
	public static void main(String[] args) 
	{
		int n1,n2,s;
		M m= new M();
		m.show();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first Number");
		n1=sc.nextInt();
		System.out.println("Enter Second Number");
		n2=sc.nextInt();
		s=m.show(n1, n2);
		System.out.println("Sum of Number="+s);
	}
}
class M
{
	void show()
	{
		System.out.println("SHOW Method");
	}
	int show(int x, int y)
	{
		int sum=x+y;
		 return sum;
	}
}
