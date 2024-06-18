package Constructor;

public class countstring {

	public static void main(String[] args) 
	{
		C obj=new C();
		int x,y;
		String st="Soumya";
		String s[]= {"Abhay","Ram","Shyam"};
		x=obj.character(st);
		y=obj.character(s);
		System.out.println("String ="+x);
		System.out.println("String in 2D ="+y);
	}	
}
	class C
	{
		int character(String st)
		{
			char ch[]=st.toCharArray();
			return ch.length;
		}
		int character(String st[])
		{
			return st.length;
		}
	}

