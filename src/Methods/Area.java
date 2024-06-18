package Methods;
public class Area {
	public static void main(String[] args)
	{
		Area obj= new Area();
		obj.printarea(20,40);
		obj.printarea(20);
	}
	public void printarea(int x,int y)
	{
		System.out.println("Area of Rectangle ="+(x*y));
	}
	public void printarea(int x)
	{
		System.out.println("Area of  Square =" +(x*x));
	}

}
