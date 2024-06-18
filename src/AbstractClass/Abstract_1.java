package AbstractClass;
abstract class Parent
{
	abstract void message();
}
class FirstSubClass extends Parent
{
	void message()
	{
		System.out.println("This is First Sub Class");
	}
}
class SecondSubClass extends Parent
{
	void message()
	{
		System.out.println("This is Second Sub class");
	}
}
public class Abstract_1 {

	public static void main(String[] args) 
	{
		FirstSubClass obj=new FirstSubClass();
		obj.message();
		
		SecondSubClass obj1=new SecondSubClass();
		obj1.message();
		
	}
}
