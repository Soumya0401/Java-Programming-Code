package Polymorphism;
class Animal
{
	public void  makesound()
	{
		System.out.println("The animal makes a sound");
	}
}
class Bird extends Animal
{
	public void  makesound()
	{
		System.out.println("The bird chirps");
	}
}
class  cat extends Animal
{
	public void makesound()
	{
		System.out.println("The cat meows");
	}
}

public class poly1 {

	public static void main(String[] args) 
	{
		Animal animal=new Animal();
		Bird bird=new Bird();
		cat c=new cat();
		
		animal.makesound();
		bird.makesound();
		c.makesound();
	}

}
