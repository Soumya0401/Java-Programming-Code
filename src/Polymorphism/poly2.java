package Polymorphism;

class Vehicle {
    private int speed;

    public Vehicle() {
        speed = 0; // Initialize speed to 0
    }

    public void speedUp() {
        speed = speed + 10;
    }

    public int getSpeed() {
        return speed;
    }
}

class Car extends Vehicle {
    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("Car speed increased by 10 units.");
    }
}

class Bicycle extends Vehicle {
    @Override
    public void speedUp() {
        super.speedUp();
        System.out.println("Bicycle speed increased by 10 units.");
    }
}

public class Poly2 {
    public static void main(String[] args) {
        Car c = new Car();
        Bicycle bicycle = new Bicycle();

        System.out.println("Car initial speed: " + c.getSpeed());
        System.out.println("Bicycle initial speed: " + bicycle.getSpeed());

        c.speedUp();
        bicycle.speedUp();

        System.out.println("\nCar speed after speeding up: " + c.getSpeed());
        System.out.println("Bicycle speed after speeding up: " + bicycle.getSpeed());
    }
}
