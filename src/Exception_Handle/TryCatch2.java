package Exception_Handle;

public class TryCatch2 {

	public static void main(String[] args) 
	{
		int x=5,y=0,z;
		int ar[]= {5,6,3,2,7};
		
		try
		{
			z=x/y;
			System.out.println(z);
			for(int i=0;i<=6;i++)
			System.out.println(ar[i]);
			
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		
		}catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println(ae);
		}
	}
}
