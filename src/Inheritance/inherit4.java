package Inheritance;

class Shape
{
	public void display()
	{
		System.out.println("This is  Shape");
	}
}
class Rectangle1 extends Shape
{
	public  void show()
	{
		System.out.println("This is Rectangle");
	}
}
class Circle extends Shape
{
	public void print() 
	{
		System.out.println("This is Circle");
	}
}
class Square1 extends Rectangle1
{
	public void show1()
	{
		System.out.println(" Square is a rectangle");
	}
}
public class inherit4 {

	public static void main(String[] args)
	{
		Rectangle1 rect= new Rectangle1();
		rect.show();
		rect.display();
	
		Square1 s=new Square1();
		s.show();
		s.display();
		s.show1();	
	}
}
