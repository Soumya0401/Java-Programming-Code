package Methods;

public class N0ReturnButParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj=new B();
		obj.show(10,30);
		obj.display("Soumya" , 23);
	}

}
class B
{
	void show(int x,int y)
	{
		System.out.println("SUM = "+(x+y));
	}
	void display(String name, int age)
	{
		System.out.println("Name ="+name);
		System.out.println("Age = "+age);
	}
	
}
