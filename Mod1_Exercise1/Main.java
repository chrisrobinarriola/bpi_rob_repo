package bpi.oop.training;

public class Main {

	public static void main(String[] args) {
		
		Car sedan = new Car("Toyota", "Vios", "Black", 20302012);
		Car suv = new Car();
		suv.brand = "Honda";
		suv.model = "BRV";
		suv.color = "White";
		suv.engineNumber = 123123325;
		
		printCarDetails(sedan.brand, sedan.model, sedan.color, sedan.engineNumber);
		System.out.println(" ");
		printCarDetails(suv.brand, suv.model, suv.color, suv.engineNumber);
		
	}
	
	public static void printCarDetails(String brand, String model, String color, int engineNumber) {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Color: " + color);
		System.out.println("Engine Number: " + engineNumber);
	}

}
