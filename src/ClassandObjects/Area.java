package ClassandObjects;
import java.util.*;
public class Area 
{
	int length,breadth;
	Area(int l, int b){
	        length = l;
	        breadth = b;
	}
		public int setDim()
		{
			int res= length*breadth;
			return res;
		}
		public void getArea()
		{
				System.out.println("Area of rectangle="+setDim());	
		}
		public static void main(String []args)
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter First Number");
			int n1=sc.nextInt();
			
			System.out.println("Enter Second Number");
			int n2=sc.nextInt();
			
			Area obj= new Area(n1,n2);
			obj.getArea();
		}
}
