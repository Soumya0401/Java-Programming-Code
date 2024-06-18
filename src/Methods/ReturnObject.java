package Methods;
public class ReturnObject {

    public static void main(String[] args) {
        
        int i;
        X ob;
        Y ob1 = new Y();
        ob = ob1.Array();
        for(i = 0; i < ob.ar.length; i++) {  
            System.out.println(ob.ar[i]);
        }
        System.out.println("Uppercase = " + ob.st);
    }
}

class X {
    int ar[] = {12, 98, 32, 54, 65};
    String st = "java is best";
}

class Y {
    X Array() {
        X obj = new X();
        int i, j, t;
        for(i = 0; i < obj.ar.length; i++) { 
            for(j = i + 1; j < obj.ar.length; j++) { 
                if(obj.ar[i] < obj.ar[j]) {  
                    t = obj.ar[i];
                    obj.ar[i] = obj.ar[j];
                    obj.ar[j] = t;
                }
            }
        }
        obj.st = obj.st.toUpperCase();  // Convert string to uppercase
        return obj;
    }
}
