package Array;

import java.util.Arrays;
import java.util.ArrayList;

 class Arraylist 
 {

	public static void main(String[] args) 
	{
		String cityNames[]={"Agra", "Mysore", "Chandigarh", "Bhopal"};

	    
	    ArrayList<String> cityList= new ArrayList<String>(Arrays.asList(cityNames));

	    
	    cityList.add("Chennai");
	    cityList.add("Delhi");

	  
	    for (String str: cityList)
	    {
	      System.out.println(str);
	    }
	}
 }
