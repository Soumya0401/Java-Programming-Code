package CollectionFrameWork;
import java.util.*;
public class Swap_Elements {
	public static void main(String[] args) 
	{
		ArrayList<String> list_col= new ArrayList<String>();
		list_col.add("Black");
		list_col.add("Orange");
		list_col.add("Pink");
		list_col.add("Blue");
		list_col.add("White");
		list_col.add("Yellow");	
 
		System.out.println("Array List before Swap : ");
		for(String a: list_col)
		{
			System.out.println(a);
		}
 
		Collections.swap(list_col, 1, 4);
		System.out.println("Array List after swap : ");
		for(String b: list_col)
		{
			System.out.println(b);
		}
	}

}
