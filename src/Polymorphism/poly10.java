package Polymorphism;
class A2
{
	  public void eat() {
	    System.out.println("Animal eats.");
	  }

	  public void sound() {
	    System.out.println("Animal makes a sound.");
	  }
	}
class Lion extends A2 {
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
class Tiger extends A2
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
class Panther extends A2
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

public class poly10 {

	public static void main(String[] args) 
	{
		A2 lion = new Lion();
	    A2 tiger = new Tiger();
	    A2 panther = new Panther();

	    lion.eat();
	    lion.sound();

	    tiger.eat();
	    tiger.sound();

	    panther.eat();
	    panther.sound();
	  }
	}

