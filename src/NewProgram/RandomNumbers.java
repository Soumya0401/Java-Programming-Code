package NewProgram;

import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) 
	{
		Random t = new Random();
		 for (int c = 1; c <= 10; c++) {
		 System.out.println(t.nextInt(100));
		 }
	}
}
