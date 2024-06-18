package ClassandObjects;

class Triangle 
{
	int a,b,c;
	public double getdata()
	{
		 	double s = (a+b+c)/2.0;
		    return Math.pow((s*(s-a)*(s-b)*(s-c)),.5);
	}
	public double getPerimeter()
	{
	    return (a+b+c)/2.0;
	}
}
public class Triangle1{
	public static void main(String[] args) 
	{
		Triangle obj=new Triangle();
		obj.a=3;
		obj.b=4;
		obj.c=5;
		
		System.out.println(obj.getdata());
		System.out.println(obj.getPerimeter());
	}
}
