package MultilevelInheritance;

public class Example2 {

	public static void main(String[] args) 
	{
		C2 obj=new C2();
		obj.sum();
	}
}
class A2
{
	int a=50;
	A2()
	{
		System.out.println("Constructor Of Class A2");
		
	}
}
class B2 extends A2
{
	int b=50;
	B2()
	{
		System.out.println("Constructor of Class B2");
	}
}
class C2 extends B2
{
	int c=50;
	C2()
	{
		System.out.println("Constructor of Class C2");
	}
	void sum() 
	{
		System.out.println("Sum of Number = "+(a+b+c));	
	}
}