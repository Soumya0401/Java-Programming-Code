package SingleInheritance;

public class Example4 {

	public static void main(String[] args) 
	{
		B4 obj=new B4();
		obj.show();
		obj.display();
	}
}
class A4
{
	void show()
	{
		System.out.println("Method of Super Class");
	}
}
class B4 extends A4
{
	void display()
	{
		System.out.println("Method of Child Class");
	}
}
