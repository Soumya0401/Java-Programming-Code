package Methods;
import java.util.*;

public class AscendingUpper {
    public static void main(String[] args) {
        int i;
        String st;
        AU obj1 = new AU();
        Scanner sc = new Scanner(System.in);

        // Reading array elements
        System.out.println("Enter Array Elements:");
        int arr[] = new int[5];
        for(i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        // Display array elements
        System.out.println("Array Elements:");
        for(i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }

        // Reading a string
        System.out.println("Enter String:");
        sc.nextLine(); // Consume newline left-over
        st = sc.nextLine();

        // Process array and string in AU class
        obj1.show(arr, st);
    }
}

class AS {
    int ar[];
    String s;
}

class AU {
    void show(int[] array, String str) {
        AS obj = new AS();
        obj.ar = array;
        obj.s = str;

        // Sorting the array in ascending order
        for(int i = 0; i < obj.ar.length; i++) {
            for(int j = i + 1; j < obj.ar.length; j++) {
                if(obj.ar[i] > obj.ar[j]) {
                    int t = obj.ar[i];
                    obj.ar[i] = obj.ar[j];
                    obj.ar[j] = t;
                }
            }
        }

        // Converting string to uppercase
        obj.s = obj.s.toUpperCase();

        // Display sorted array
        System.out.println("Sorted Array:");
        for(int i = 0; i < obj.ar.length; i++) {
            System.out.println(obj.ar[i]);
        }

        // Display uppercase string
        System.out.println("String UpperCase = " + obj.s);
    }
}
