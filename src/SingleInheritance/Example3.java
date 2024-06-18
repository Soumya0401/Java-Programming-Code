package SingleInheritance;

public class Example3 {

	public static void main(String[] args)
	{
		B3 obj= new B3();
	}

}
class A3
{
	A3()
	{
		System.out.println("Constructor of Super Class");
	}
}
class B3 extends A3
{
	B3()
	{
		System.out.println("Constructor of Child Class");
	}
}
