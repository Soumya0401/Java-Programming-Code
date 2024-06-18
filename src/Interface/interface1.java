package Interface;

interface Shape {
    double getArea();
}

class Rec1 implements Shape {
    private double length;
    private double width;

    public Rec1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

class Cir1 implements Shape {
    private double radius;

    public Cir1(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }
}

public class interface1 {
    public static void main(String[] args) {
        Rec1 rectangle = new Rec1(10, 12);
        Cir1 circle = new Cir1(3);
        Triangle triangle = new Triangle(4, 6);

        System.out.println("Area of the Rectangle: " + rectangle.getArea());
        System.out.println("Area of the Circle: " + circle.getArea());
        System.out.println("Area of the Triangle: " + triangle.getArea());
    }
}
