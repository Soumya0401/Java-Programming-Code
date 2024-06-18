package Pattern;
public class Pattern9 {
	
	public static void main(String[] args) 
	{
		int rows, i, j, number= 1;
		rows=4;
		for(i=1; i <= rows; i++){
		for(j=1; j <= i; ++j){
		System.out.print(number);
		++number;
	}
		System.out.print("\n");
		}
	}
}
