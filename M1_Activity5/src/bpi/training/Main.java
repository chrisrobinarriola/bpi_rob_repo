package bpi.training;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("Sum: " + sum(0));

	}
	
	public static int sum(int a) {
		
		int result = a;

		for(int i=1; i <= 50; i++) {
			result += i;
		}
		return result;
		
	}

}
