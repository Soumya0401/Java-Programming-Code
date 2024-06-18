package Pattern;
public class Pattern8 {
	public static void main(String[] args) 
	{	
		int n, c, k, space, count = 1;
		space =n=5;
		for (c = 1; c <= n; c++){
		for (k = 1; k < space; k++)
		System.out.print(" ");
		for (k = 1; k <= c; k++){
		System.out.print("*");
		if (c > 1 && count < c){
		System.out.print("A");
		count++;
		}
		}
		System.out.print("\n");
		space--;
		count = 1;
		}
	}
}
