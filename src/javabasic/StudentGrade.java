package javabasic;
import java.util.*;
public class StudentGrade {
	public static void main(String[] args) 
	{
		float  avg,java,python,sql;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter JAVA Marks");
		java=sc.nextFloat();
		
		System.out.println("Enter Python Marks");
		python=sc.nextFloat();
		
		System.out.println("Enter SQL Marks");
		sql=sc.nextFloat();
		
		avg=(java+python+sql)/3;
		System.out.println("Average Marks ="+avg);
		
		if(avg>=90)
		{
			System.out.println("Grade A");
		}
		else if(avg>=70 && avg<90)
		{
			System.out.println("Grade B");
		}
		else if(avg>=50 && avg <70)
		{
			System.out.println("Grade C");
		}
		else if(avg>=45 && avg<50)
		{
			System.out.println("Grade D");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
