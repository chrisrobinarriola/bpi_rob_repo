package bpi.training;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your age:" );
		String ageInput = scanner.nextLine();
		
		int ageInt = Integer.parseInt(ageInput);
		double ageDouble = (double) ageInt;
		
		System.out.println("Your age as int: " + ageInput);
		System.out.println("Your age as double " + ageDouble);

	}

}
