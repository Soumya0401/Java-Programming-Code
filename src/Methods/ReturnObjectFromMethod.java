package Methods;

public class ReturnObjectFromMethod {
    public static void main(String[] args) {
        // Create an instance of Two
        Two two = new Two();
        
        // Call the show method and get the returned object
        One returnedObject = two.show();
        
        // Print the properties of the returned object
        System.out.println("x: " + returnedObject.x);
        System.out.println("y: " + returnedObject.y);
        System.out.println("st: " + returnedObject.st);
    }
}

class One {
    int x = 30;
    int y = 20;
    String st = "JAVA is Best";
}

class Two {
    One show() {
        One a = new One();
        a.x = a.x * a.x;
        a.st = "Using in Class B";
        return a;
    }
}
