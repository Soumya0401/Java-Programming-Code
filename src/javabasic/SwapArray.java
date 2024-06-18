package javabasic;
import java.util.Arrays;
public class SwapArray {

	public static void main(String[] args) {

		  int[] arr = {23, 100, 54, 56, 98};
	      int temp = arr[0];
	      arr[0] = arr[arr.length-1];
	      arr[arr.length-1] = temp;
	      System.out.println(Arrays.toString(arr));
	}

}
