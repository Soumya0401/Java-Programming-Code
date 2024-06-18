package Methods;
public class PrintIntegerChar {
	public static void main(String[] args) 
	{
		PrintIntegerChar obj = new PrintIntegerChar();
        obj.print(10, 'A');
        obj.print('B', 20);

    }
	public void print(int num, char ch)
	{
		System.out.println("Integer: " + num + ", Character: " + ch);
	}
	public void print( char ch1, int num1)
	{
		System.out.println("Character: " + ch1 + ", Integer: " + num1);
	}
}
