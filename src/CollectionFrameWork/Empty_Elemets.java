package CollectionFrameWork;
import java.util.*;
public class Empty_Elemets {

	public static void main(String[] args) 
	{
		ArrayList<String> str_col= new ArrayList<String>();
		str_col.add("Black");
		str_col.add("Orange");
		str_col.add("Pink");
		str_col.add("Blue");
		str_col.add("White");
		str_col.add("Yellow");	
		System.out.println("Original array list: " + str_col);
		str_col.removeAll(str_col);
		System.out.println("Array list after removing all elements "+ str_col); 
	}
}
