package Binding;

import java.util.Arrays;

public class ArraySplit 
{
public static void main(String[] args) {  
		
	int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int splitPosition = 3; // Change this to the desired split position

    int[] firstPart = splitArray(originalArray, splitPosition);

    System.out.println("Original Array: " + Arrays.toString(originalArray));
    System.out.println("First Part: " + Arrays.toString(firstPart));
    System.out.println("Second Part: " + Arrays.toString(Arrays.copyOfRange(originalArray, splitPosition, originalArray.length)));
}

private static int[] splitArray(int[] array, int position) {
    if (position < 0 || position > array.length) {
        throw new IllegalArgumentException("Invalid split position");
    }

    return Arrays.copyOfRange(array, 0, position);
}
}