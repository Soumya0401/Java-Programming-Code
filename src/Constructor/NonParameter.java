package Constructor;
public class NonParameter {
	public static void main(String[] args) 
	{
		A a=new A();
		a.show();
	}
}
class A
{
	int x;
	A()
	{
		x=10;
		System.out.println("Non Parameterized Constructor");
	}
	void show()
	{
		System.out.println("X ="+x);
	}
}
