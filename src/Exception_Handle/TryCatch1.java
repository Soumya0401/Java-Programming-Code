package Exception_Handle;

public class TryCatch1 {

	public static void main(String[] args) 
	{
		int x=5,y=0,z;
		try
		{
			z=x/y;
			System.out.println(z);
		
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}	
	}

}
