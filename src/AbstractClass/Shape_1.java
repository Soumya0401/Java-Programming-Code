package AbstractClass;

abstract class Shape {
    abstract void RectangleArea(float len, float breadth);
    abstract void SquareArea(float side);
    abstract void CircleArea(float radius);
}

class Area extends Shape {
    public void RectangleArea(float l, float b) {
        float res = l * b;
        System.out.println("Area of Rectangle = " + res);
    }

    public void SquareArea(float side) {
        float res = side * side;
        System.out.println("Area of Square = " + res);
    }

    public void CircleArea(float radius) {
        double res = radius * radius * Math.PI;
        System.out.println("Area of Circle = " + res);
    }
}

public class Shape_1 {
    public static void main(String[] args) {
        Area obj = new Area();
        obj.RectangleArea(5.0f, 6.0f);
        obj.SquareArea(6.0f);
        obj.CircleArea(4.0f);
    }
}
