package Encapsulation;
class Circle {
	  private double radius;
	  public double getRadius() 
	 {
	    return radius;
	  }

	  public void setRadius(double radius) {
	    this.radius = radius;
	  }

	  public double calculateArea() {
	    return Math.PI * radius * radius;
	  }

	  public double calculatePerimeter() {
	    return 2 * Math.PI * radius;
	  }
	}
public class Encap5 
{
	public static void main(String[] args) {
	    
	    Circle circle = new Circle();
	    
	    circle.setRadius(7.0);

	    double radius = circle.getRadius();

	    double area = circle.calculateArea();
	    double perimeter = circle.calculatePerimeter();

	    System.out.println("Circle Radius: " + radius);
	    System.out.println("Circle Area: " + area);
	    System.out.println("Circle Perimeter: " + perimeter);
	  }
	}

