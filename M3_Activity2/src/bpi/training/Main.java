package bpi.training;
import java.util.*;


public class Main {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> products = new HashSet<>();
		products.add("Laptop");
		products.add("Mouse");
		products.add("Keyboard");
		products.add("Monitor");
		products.add("Printer");
		
		menu(products);		
		
		scanner.close();
	}
	
	public static void decision(Set<String> products, String choice) {
		switch(choice) {
		case "1":
			System.out.print("Enter product name to search: ");	
			String searchWord = scanner.nextLine();
			search(products, searchWord);
			System.out.println();
			menu(products);
			break;
		case "2":
			System.out.print("Enter product name to add: ");
			String addWord = scanner.nextLine();
			add(products, addWord);
			System.out.println();
			menu(products);
			break;
		case "3":
			print(products);
			System.out.println();
			menu(products);
			break;
		case "4":
			exit();
			break;
			
		}
	}
	
	public static void search(Set<String> products, String word) {
		for(int i = 0; i<products.size(); i++) {
			if(products.contains(word)) {
				System.out.println("Product Found: " + word);
				break;
			}
			if(i == products.size()-1) {
				System.out.println("Product not found. ");
			}
		}
	}
	
	public static void add(Set<String> products, String word) {
		products.add(word);
		System.out.println("Product added: " + word);
	}
	
	public static void print(Set<String> products) {
		for (String product : products) {
			System.out.println(product);
		}
		System.out.println("Total unique products: " + products.size());
	}
	
	public static void exit() {
		System.out.println("Exiting...");
	}
	
	public static void menu(Set<String> products) {
		System.out.println("Select an option");
		System.out.println("1. Search a product");
		System.out.println("2. Add a product");
		System.out.println("3. Print all products and count");
		System.out.println("4. Exit");
		String choice = scanner.nextLine();
		decision(products, choice);
	}

}
