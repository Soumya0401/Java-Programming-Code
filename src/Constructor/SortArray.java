package Constructor;
import java.util.*;

public class SortArray {
    public static void main(String[] args) {
        S obj = new S();
        int i;
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Elements for Sorting:");
        for (i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        sc.close(); 
        obj.bubbleSort(a);
        obj.selectionSort(a);
    }
}

class S {
    void bubbleSort(int ar[]) {
        int i, j, t, s;
        for (i = 0; i < ar.length; i++) {
            s = 0;
            for (j = 0; j < (ar.length - i) - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    t = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = t;
                    s = 1;
                }
            }
            if (s == 0) break; // Break if the array is already sorted
        }
        System.out.println("Bubble Sort:");
        for (i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }

    void selectionSort(int ar[]) {
        int i, j, t, minIndex;
        for (i = 0; i < ar.length - 1; i++) {
            minIndex = i;
            for (j = i + 1; j < ar.length; j++) {
                if (ar[j] < ar[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                t = ar[i];
                ar[i] = ar[minIndex];
                ar[minIndex] = t;
            }
        }
        System.out.println("Selection Sort:");
        for (i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
        }
    }
}
