package SingleInheritance;

public class Example5 {

	public static void main(String[] args)
	{
		B5 obj= new B5();
		obj.display();
	}
}
class A5
{
	int x=5;
	void show()
	{
		System.out.println("X= "+x);
	}
}
class B5 extends A5
{
	int x=10;
	void display()
	{
		System.out.println("Variable of Child Class = "+x);
		System.out.println("Variable of Parent Class ="+super.x);
		System.out.println("Sum of Number ="+(super.x+x));
	}
}