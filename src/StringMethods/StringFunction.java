package StringMethods;
public class StringFunction {

	public static void main(String[] args) 
	{
		String str="JAVA is best Programming Langugage";
		int length=str.length();
		System.out.println("Length of String= "+length);
		
		
		String firstname="Croma";
		String lastname="Campus";
		String res= firstname.concat(lastname);
		System.out.println("Concate String = "+res);
		//System.out.println(firstname+ " "+lastname);
		
		
		int comp1=firstname.compareTo(lastname);
		System.out.println("Compare two String ="+comp1);
		
		int comp=firstname.compareToIgnoreCase(lastname);
		System.out.println("Comapare two Ignore String="+comp);
		
		System.out.println(str.contains("java"));
		System.out.println(firstname.contains("oma"));
		System.out.println(str.contains("Pro"));
		
		
		System.out.println(lastname.endsWith("pus"));
		
		String s1="CROMA";
		String s2="Croma";
		
		System.out.println(firstname.equals(lastname));
		System.out.println(s1.equals(s2));
		
		System.out.println(firstname.equalsIgnoreCase("lastname"));
		System.out.println(s1.equalsIgnoreCase(s2));
		
		
		

	}

}
