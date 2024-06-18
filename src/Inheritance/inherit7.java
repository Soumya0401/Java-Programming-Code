package Inheritance;
 class Shape1
 {
    public double getArea() {
        return 0.0;
    }
} 
 class Rect extends Shape1 {
	    private double length;
	    private double width;
	    
	    public Rect(double length, double width)
	    {
	        this.length = length;
	        this.width = width;
	    }
	  @Override
	    public double getArea()
	  {
	        return length * width;
	    }
	}
public class inherit7 
{
	public static void main(String[] args) {
	    Rect rectangle = new Rect(3.0, 10.0);
	    double area = rectangle.getArea();
	    System.out.println("The area of the rectangle is: " + area);

	}
}
