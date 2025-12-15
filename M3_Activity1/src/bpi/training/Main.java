package bpi.training;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		List<String> products = new ArrayList<>();
		products.add("Laptop");
		products.add("Mouse");
		products.add("Keyboard");
		products.add("Monitor");
		products.add("Printer");
		
		System.out.println("All products");
		
		for(int i = 0; i<5; i++) {
			System.out.println(i+1 + " " + products.get(i));
		}
		
		products.remove(1);
		products.add("Webcam");
		System.out.println(" ");
		System.out.println("After adding and removing products");
		
		for(int i = 0; i<products.size(); i++) {
			System.out.println(i+1 + " " + products.get(i));
		}
		
		System.out.print("Enter product name to search: ");
		String word = scanner.nextLine();
		search(products,word);
		
		scanner.close();
		
		
	}
	
	public static void search(List<?> products, String word) {
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
}
