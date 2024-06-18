package Inheritance;
class Animal1 {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}
class Cat1 extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat quarrels.");
    }
}
class inherit10
{
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat1 cat = new Cat1();        
        animal.makeSound();
        cat.makeSound();
    }
}

