package DataType;
import java.util.*;
public class ScannerData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		String s;
		char ch;
		float fl;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Integer Value");
		x= sc.nextInt();
		System.out.println("Enter String Value");
		s=sc.next();
		System.out.println("Enter Character Value");
		ch=sc.next().charAt(0);
		System.out.println("Enter Float Value");
		fl=sc.nextFloat();
		System.out.println("Integer ="+x);
		System.out.println("String ="+s);
		System.out.println("Character ="+ch);
		System.out.println("Float ="+fl);
		  
		
	}

}
