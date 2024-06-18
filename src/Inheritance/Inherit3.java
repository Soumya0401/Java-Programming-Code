package Inheritance;

class Rectangle
{
	double length;
	double breadth;
	Rectangle(double l, double b)
	{
		length=l;
		breadth=b;
	}
	public void PrintArea()
	{
		System.out.println("Area of Rectangle = "+ length*breadth);
	}
	public void PrintPeri()
	{
		System.out.println("Perimeter = "+2*(length*breadth));	
	}
}
	class Square extends Rectangle
	{
		int side;
		Square(int s)
		{
			super(s,s);
		}
	}	
public class Inherit3 {

	public static void main(String[] args)
	{
		Rectangle r= new Rectangle(4,8);
		r. PrintArea();
		r.PrintPeri();
		
		Square sq= new Square(6);
		sq. PrintArea();
		sq.PrintPeri();
		
	}

}
