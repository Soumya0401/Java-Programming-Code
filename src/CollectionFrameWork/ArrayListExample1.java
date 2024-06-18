package CollectionFrameWork;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListExample1 {

	public static void main(String[] args)
	{
		//  Declare ArrayList
		// ArrayList <Integer> al=new ArrayList<Integer>();
		// ArrayList <String> al=new ArrayList<String>();
		//	List al= new ArrayList();
		
			ArrayList al= new ArrayList();
			
			//  Add new Elements to the ArrayList
				al.add(100);
				al.add("Welcome");
				al.add(15.5);
				al.add('A');
				al.add(true);
			
			System.out.println(al);
			
			//Size()
			System.out.println("Number of elementsmin array list:"+al.size());
			
			//remove
			al.remove(1); //here 1 is index
			//al.remove("Welcome"); //here welcome is element
			System.out.println("After removing element from Arraylist"+al);
			
			//insert a new Element
			//add (index, object)
			al.add(2,"Python");
			System.out.println("After inseertion ="+al);
			
			//retreive Specific Elements
			System.out.println(al.get(2));
			
			//change element/replace
			al.set(2, "C#");
			System.out.println("After replacing elemenst="+al);
			
			//search - contains() - Returns true/ false
			System.out.println(al.contains("C#"));
			System.out.println(al.contains("C"));
			
			//isEmpty
			System.out.println(al.isEmpty()); 
			
			//Reading Elements using Iterator Methods
			System.out.println("Reading Elements using Iterator Method");
			
			Iterator it=al.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next()); //printing elements and move to next
			}
	}

}
