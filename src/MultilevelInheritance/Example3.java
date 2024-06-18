package MultilevelInheritance;

public class Example3 {

	public static void main(String[] args) 
	{
		C3 obj =new C3();
		obj.display();
	}
}
class A3
{
	int x=10;
	A3()
	{
		System.out.println("Constructor of Super class");
	}
}
class B3 extends A3
{
	int x=15;
	B3()
	{
		System.out.println("Constructor of  Base Class");
	}
}
class C3 extends B3
{
	int x=20;
	C3()
	{
		System.out.println("Constructor of Sub child class ");
		}
		void display()
		{
			System.out.println("Variable of Class C ="+x);
			System.out.println("Variable of Class A = "+super.x);
			System.out.println("Sum of three number ="+(super.x+x+x));
			
	}
}
