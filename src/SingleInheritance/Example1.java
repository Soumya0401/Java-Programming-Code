package SingleInheritance;

public class Example1 {

	public static void main(String[] args)
			{
				B1 obj=new B1();
				obj.sum();
			}
		}
		class A1
			{
				int x=5;
			}
			class B1 extends A1
			{
				int y=10;
				void sum()
				{
					System.out.println("Sum of Number -"+(x+y));
				}
			}
