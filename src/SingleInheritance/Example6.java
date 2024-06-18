package SingleInheritance;

public class Example6 {

	public static void main(String[] args) 
	{
		B6 obj= new B6();
		obj.show();
				

	}
}
class A6
{
	int x;
	A6 (int i)	//parametrized Constructor
	{
			x=i;
	}
}
class B6 extends A6
{
	B6()
	{
		super(5);
		System.out.println("Constructor of B");
	}
	void show()
	{
		System.out.println("X = "+x);
	}
}