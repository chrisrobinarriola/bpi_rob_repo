package bpi.hello;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("What is your name?");		
		String name = scanner.nextLine();		
		System.out.println("Hello, " + name + "!");
		
	}

}
	