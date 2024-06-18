package Interface;
interface Animal 
{
    void bark();
}
 class Dog implements Animal {
    @Override
    public void bark() 
    {
        System.out.println("Dog is barking!");
    }
}
 class interface2 {
	    public static void main(String[] args) {
	        Dog dog = new Dog();
	        dog.bark();
	    }
	}
