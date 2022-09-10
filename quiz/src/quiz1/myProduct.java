package quiz1;
import java.util.*;

public class myProduct {
	public static void main(String args[]){
		
		// 2 parameters 
		int a = 2;
		int b = 3;
		
		// 3 parameters
		int c = 2;
		int d = 4;
		int e = 3;
		
		// Calling the function with 2 parameter 
		product(a, b);
		
		//calling the function with 3 parameters
		calc(c,d,e);
	}
	public static void product(int x, int y){
		int product = x * y;
		
		// Displaying the product 
	    System.out.print("The product of these numbers is: " + product);
	}
	public static void calc(int x , int y, int z) {
		int calc = x * y* z;
		
		// Displaying the product 
		System.out.println("\nThe product of these nmbers is: " + calc);
	}
}
