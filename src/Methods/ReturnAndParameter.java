package Methods;
import java.util.*;
public class ReturnAndParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C obj=new C();
		int n1,n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		n1=sc.nextInt();
		
		System.out.println("Enter Second Number");
		n2=sc.nextInt();
		
		int i=obj.show(n1,n2);
		System.out.println("Sum ="+i);
	}
}
class C
{
	int show(int x,int y)
	{
		int z;
		z=x+y;
		return z;
	}
}

