package MultilevelInheritance;

public class Example1 {

	public static void main(String[] args) 
	{
		C1 obj= new C1();
		obj.sum();
	}
}
class A1
{
	int x=5;
}
class B1 extends A1
{
	int y=10;
}
class C1 extends B1
{
	int z=15;
	void sum()
	{
		System.out.println("Sum of Number ="+(x+y+z));
	}
}
