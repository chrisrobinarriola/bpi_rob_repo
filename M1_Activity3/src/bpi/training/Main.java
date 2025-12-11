package bpi.training;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first integer: ");
		int int1 = scanner.nextInt();
		
		System.out.print("Enter second integer: ");
		int int2 = scanner.nextInt();
		
		System.out.println("Sum: " + sum(int1, int2));
		System.out.println("Difference: " + difference(int1, int2));
		System.out.println("Product: " + product(int1, int2));

	}
	
	public static int sum(int a, int b) {
		
		return a + b;
		
	}
	
	public static int difference(int a, int b) {
		
		return a - b;
		
	}

	public static int product(int a, int b) {
		
		return a * b;
		
	}

}
