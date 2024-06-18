package Encapsulation;

class Rectangle 
{
	  private double length;
	  private double width;

	  public double getLength() 
	  {
	    return length;
	  }

	  public void setLength(double length) 
	  {
	    this.length = length;
	  }

	  public double getWidth() 
	  {
	    return width;
	  }

	  public void setWidth(double width) 
	  {
	    this.width = width;
	  }
	}

public class Encap3 
{
	public static void main(String[] args)
	{
	Rectangle rectangle = new Rectangle();

    // Set values using setter methods
    rectangle.setLength(6.7);
    rectangle.setWidth(12.0);

    // Get values using getter methods
    double length = rectangle.getLength();
    double width = rectangle.getWidth();

    // Print the values
    System.out.println("Length: " + length);
    System.out.println("Width: " + width);
  }
}

