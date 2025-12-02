package bpi.hello;
import java.util.*;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your ages:" );
		String ageInput = scanner.nextLine();
		
		int ageInt = Integer.parseInt(ageInput);
		double ageDouble = (double) ageInt;
		
		System.out.println("Your age as int: " + ageInput);
		System.out.println("Your age as double " + ageDouble);

	}

}
