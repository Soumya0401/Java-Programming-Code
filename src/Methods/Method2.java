package Methods;
import java.util.*;
public class Method2 {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
        System.out.println("Input the first number: ");
        double x = in.nextDouble();
        System.out.println("Input the second number: ");
        double y = in.nextDouble();
        System.out.println("Input the third number: ");
        double z = in.nextDouble();
        System.out.println("The average value is " + average(x, y, z)+"\n" );
    }


  public static double average(double x, double y, double z)
    {
        return (x + y + z) / 3;
    }
}



