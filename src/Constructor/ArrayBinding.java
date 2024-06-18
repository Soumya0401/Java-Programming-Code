package Constructor;

public class ArrayBinding 
{
	public static void main(String[] args) {  
		
		String str = "Converting string to string array using split() method";  
		
		String[] strArray = null;  
		  
		strArray = str.split(" ");  
		
		for (int i = 0; i< strArray.length; i++)
		{  
		  System.out.println(strArray[i]);  
		}  
		}  
		}  
