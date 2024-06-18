package Constructor;
class Students
{
	String name;
	Students(String n)
	{
		name=n;
	}
	Students()
	{
		name="unknown";
	}
}
public class Student_name
{
	public static void main(String[] args) 
	{
			Students s = new Students("Ram");
		    Students a = new Students();
		    System.out.println(s.name);
		    System.out.println(a.name);		    
	}
}

