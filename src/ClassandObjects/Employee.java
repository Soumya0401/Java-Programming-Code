package ClassandObjects;
class Emp
{
	String name;
	int yoj;
	String address;
	float salary;
	
	Emp(String n,int y,String add,float sal)
	{
		name=n;
		yoj=y;
		address=add;
		salary=sal;	
	}
public String getname()
{
	return name;	
}
public int  getyear ()
{
	return yoj;
}
public  String getaddress()
{
	return address;
}
public float getsalary()
{
	return salary;
}
}
public class Employee {
	public static void main(String[] args)
	{
		Emp obj= new Emp("Robert ",1994, " 64C- WallsStreet",30000);
		Emp obj1 = new Emp("Sam", 2000, "68d- WallsStreet",740000);
		Emp obj2 = new Emp("John", 1999, "26B- WallsStreet",600000);
		
		//System.out.println("Name \tYOJ\tSalary\tAddress");
		
		System.out.println(obj.getname() + "  "+obj.getyear()+"  "+obj.getaddress() +"  "+obj.getsalary());
		System.out.println(obj1.getname() + "  "+obj1.getyear()+"  "+obj1.getaddress() +"  "+obj1.getsalary());
		System.out.println(obj2.getname() + "  "+obj2.getyear()+"  "+obj2.getaddress() +"  "+obj2.getsalary());
		
	}
	}

