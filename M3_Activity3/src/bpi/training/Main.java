package bpi.training;
import java.util.*;


public class Main {
	
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> products = new HashMap<>();
		products.put("Laptop", 60000);
		products.put("Mouse", 2000);
		products.put("Keyboard", 5000);
		products.put("Monitor", 12000);
		products.put("Printer", 4500);
		
		menu(products);		
		
		scanner.close();
	}
	
	public static void decision(Map<String, Integer> products, String choice) {
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
			System.out.print("Enter product value: ");
			String addPrice = scanner.nextLine();
			add(products, addWord, addPrice);
			System.out.println();
			menu(products);
			break;
		case "3":
			print(products);
			System.out.println();
			menu(products);
			break;
		case "4":
			cheapest(products);
			System.out.println();
			menu(products);
			break;
		case "5":
			exit();
			break;
			
		}
	}
	
	public static void search(Map<String, Integer> products, String word) {
		boolean found = false;
		
		for (Map.Entry<String, Integer> entry : products.entrySet()){
			if(entry.getKey().equals(word)) {
				System.out.println("Product found: " + entry.getKey() + " -> " + entry.getValue());
				found = true;
				break;
			}
		}
		
		if(!found) {
			System.out.println("Product not found!");
		}
	}
	
	public static void add(Map<String, Integer> products, String word, String price) {
		products.put(word, Integer.valueOf(price));
		System.out.println("Product added: " + word + " with a price of " + price);
	}
	
	public static void print(Map<String, Integer> products) {
		for (Map.Entry<String, Integer> entry : products.entrySet()){
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
		System.out.println("Total unique products: " + products.size());
	}
	
	public static void cheapest(Map<String, Integer> products) {
		String productName = "";
		int productPrice = 999999999;
		for (Map.Entry<String, Integer> entry : products.entrySet()){
			if(entry.getValue() < productPrice) {
				productPrice = entry.getValue();
				productName = entry.getKey();
			}
		}
		System.out.println("Product name: " + productName);
		System.out.println("Price: " + productPrice);
	}
	
	public static void exit() {
		System.out.println("Exiting...");
	}
	
	public static void menu(Map<String, Integer> products) {
		System.out.println("=========================================");
		System.out.println("Select an option");
		System.out.println("1. Search a product");
		System.out.println("2. Add a product");
		System.out.println("3. Print all products and count");
		System.out.println("4. Find the cheapest product");
		System.out.println("5. Exit");
		String choice = scanner.nextLine();
		decision(products, choice);
	}

}
