package Polymorphism;
class Animal2
{
	  public void move() {
	    System.out.println("Animal moves");
	  }

	  public void makeSound() 
	  {
	    System.out.println("Animal makes a sound");
	  }
	}

class Bird1 extends Animal2
{
	  @Override
	  public void move() 
	  {
	    System.out.println("Bird flies");
	  }

	  @Override
	  public void makeSound()
	  {
	    System.out.println("Bird chirps");
	  }
	}

class Panthera extends Animal2
{
	  @Override
	  public void move() 
	  {
	    System.out.println("Panthera walks");
	  }

	  @Override
	  public void makeSound() {
	    System.out.println("Panthera roars");
	  }
	}

public class poly7 {

	public static void main(String[] args) 
	{
		
		 Animal2 bird = new Bird1();
		    Animal2 panthera = new Panthera();

		    performAction(bird);
		    performAction(panthera);
		  }

		  public static void performAction(Animal2 animal) {
		    animal.move();
		    animal.makeSound();
		  }
		}

