package Inheritance;

class Pclass
{
	public void Pmethods()
	{
		System.out.println("This is Parent Class");
	}
}
class Cclass extends Pclass
{
	public void Cmethods()
	{
		System.out.println("This is Child  Class");
	}
}
public class inherit1 {

	public static void main(String[] args) 
	{
		Pclass p= new Pclass();
		Cclass c= new Cclass();
		
		p.Pmethods();
		c.Cmethods();
		c.Pmethods();
	}
}
