package SingleInheritance;

public class Example2 {

    public static void main(String[] args) {
        B2 obj = new B2();
        obj.sum();
    }
}

class A2 {
    int x = 5;
    private int i = 20;

    public int getI() {
        return i;
    }
}

class B2 extends A2 {
    int y = 10;

    void sum() {
        System.out.println("Sum of two Numbers = " + (x + y));
        System.out.println("Private Variable = " + getI()); // Accessing private variable via getter
    }
}
