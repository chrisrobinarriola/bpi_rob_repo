package bpi.hello;
import java.util.*;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int int1 = scanner.nextInt();
		
		String result = "";
		
		if(int1 < 18) {
			result = "minor";
		} else if(int1 >= 18 && int1 < 60) {
		  result = "adult";
		} else {
			result = "senior";
		}
		
		System.out.println(result);

	}
	
}
