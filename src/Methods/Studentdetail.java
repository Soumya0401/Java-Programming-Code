package Methods;
 class student 
{
		String name;
		String address;
		int age;
		student()
		{
			String a="unknown";
			String ad="not available";
			int a1=0;	
		}
		void setinfo(String na,int ag)
		{
			System.out.println("name is : "+na);
			System.out.println("age is :"+ag);
		}
		void setinfo(String na,int ag,String adr)
		{
			System.out.println("name is : "+na);
			System.out.println("age is :"+ag);
			System.out.println("Address is :"+adr);
		}
	}
 public class Studentdetail
 {
		public static void main(String[] args)
		{
			student sd= new student();
			student sd1= new student();
			 sd.setinfo("Ram",21);
			 sd1.setinfo("Shyam",25,"Noida");
		}
 }

		