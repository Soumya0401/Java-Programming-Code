package Polymorphism;

class A3
{
	  public void eat() {
	    System.out.println("Animal eats.");
	  }

	  public void sound() {
	    System.out.println("Animal makes a sound.");
	  }
	}
class L extends A3 {
	  @Override
	  public void eat()
	  {
	    System.out.println("Lion eats meat.");
	  }

	  @Override
	  public void sound() 
	  {
	    System.out.println("Lion roars.");
	  }
	}

class T extends A3 
{
	  @Override
	  public void eat() 
	  {
	    System.out.println("Tiger eats meat and sometimes fish.");
	  }

	  @Override
	  public void sound()
	  {
	    System.out.println("Tiger growls.");
	  }
	}

class P extends A3 
{
	  @Override
	  public void eat() 
	  {
	    System.out.println("Panther eats meat and small mammals.");
	  }

	  @Override
	  public void sound() 
	  {
	    System.out.println("Panther purrs and sometimes hisses.");
	  }
	}


public class poly11 {

	public static void main(String[] args) 
	{
		A3 lion = new L();
	    A3 tiger = new T();
	    A3 panther = new P();

	    lion.eat();
	    lion.sound();

	    tiger.eat();
	    tiger.sound();

	    panther.eat();
	    panther.sound();

	}
}
