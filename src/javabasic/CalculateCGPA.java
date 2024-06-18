package javabasic;
import java.util.*;
public class CalculateCGPA {
	public static void main(String[] args) 
	{
		double eng,hin,maths,sci,sst,cgpa,cgpa_cal;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Marks of English");
		eng=sc.nextFloat();
		
		System.out.println("Enter Marks of Hindi");
		hin=sc.nextFloat();
		
		System.out.println("Enter Marks of Maths");
		maths=sc.nextFloat();
		
		System.out.println("Enter Marks of Science");
		sci=sc.nextFloat();
		
		System.out.println("Enter Marks of Social Science");
		sst=sc.nextFloat();
		
		cgpa=(eng+hin+maths+sci+sst)/(5.0);
		cgpa_cal=(float)(9.5 * (cgpa));
		System.out.println("CGPA ="+cgpa_cal);
	}

}
