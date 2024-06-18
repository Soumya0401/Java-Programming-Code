package HierarichialInheritance;

public class Example1 {

	public static void main(String[] args) 
	{
		
		B1 obj=new B1();
		obj.compare();
		C1 obj1= new C1();
		obj1.display();
	}
}
class A1
{
	int x=15;
	A1()
	{
		System.out.println("Constructor of A");
	}
}
class B1 extends A1
{
	int x=5,y=3;
	B1()
	{
		System.out.println("Constructor of B");
	}
	void compare()
	{
		if (x>y)
		{
			System.out.println("X is greatest");
		}
		else
		{
			System.out.println("Y is Greatest");
		}
	}
}
class C1 extends A1
{
	int x=20;
	void display()
	{
		System.out.println("X = "+x);
		System.out.println("X="+super.x);
		System.out.println("Sum="+(super.x+x+x));
	}
}