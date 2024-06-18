package ClassandObjects;
	 class Stud1
	{
		String name;
		int roll_no;	
		String address;
		int mob;
	}
	 class stud2
	 {
		 String name;
			int roll_no;	
		 String address;
		int mob;
	 }
	public class Students1{
		public static void main(String[] args)
		{
			Stud1 obj= new Stud1();
			stud2 obj1= new stud2();
			obj.name="John";
			obj.roll_no=2;
			obj.address="Noida";
			obj.mob=12345;
			
			obj1.name="Sam";
			obj1.roll_no=4;
			obj1.address="Delhi";
			obj1.mob=998877;
			
			
			System.out.println("Student deatils");
			System.out.println("Name= "+obj.name); 
			System.out.println("Roll Number= "+obj.roll_no); 
			System.out.println("Address= "+obj.address);
			System.out.println("Phone Number= "+obj.mob);
			
			System.out.println("Name= "+obj1.name); 
			System.out.println("Roll Number= "+obj1.roll_no);
			System.out.println("Address= "+obj1.address);
			System.out.println("Phone Number= "+obj1.mob);		
		}
	}
