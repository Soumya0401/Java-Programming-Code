package ClassandObjects;
 class Stud 
{
	String name;
	int roll_no;
}
public class Student{
	public static void main(String[] args)
	{
		Stud obj= new Stud();
		obj.name="John";
		obj.roll_no=2;
		System.out.println("Student deatils");
		System.out.println("Name= "+obj.name); 
		System.out.println("Roll no= "+obj.roll_no);
	}
}
