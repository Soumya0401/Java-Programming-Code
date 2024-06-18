package Binding;

import java.util.Arrays;

public class ArrayBind 
{
	public static void main(String[] args) {
        int[] firstPart = {1, 2, 3};
        int[] secondPart = {4, 5, 6, 7, 8, 9};

        int[] combinedArray = bindArrays(firstPart, secondPart);

        System.out.println("First Part: " + Arrays.toString(firstPart));
        System.out.println("Second Part: " + Arrays.toString(secondPart));
        System.out.println("Combined Array: " + Arrays.toString(combinedArray));
    }

    private static int[] bindArrays(int[] firstArray, int[] secondArray) {
        int combinedLength = firstArray.length + secondArray.length;
        int[] resultArray = new int[combinedLength];

        // Copy the elements from the first array
        System.arraycopy(firstArray, 0, resultArray, 0, firstArray.length);

        // Copy the elements from the second array
        System.arraycopy(secondArray, 0, resultArray, firstArray.length, secondArray.length);

        return resultArray;
    }
}


