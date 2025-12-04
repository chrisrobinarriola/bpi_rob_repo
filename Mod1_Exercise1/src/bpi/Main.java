package bpi;

public class Main {

	public static void main(String[] args) {
		
		//CAR USING PARAMETERS
		Car sedan = new Car("Toyota", "Vios", "Black", 20302012);
		
		//CAR USING SETTERS AND GETTERS
		Car suv = new Car();
		suv.setBrand("Ford");
		suv.setModel("Everest");
		suv.setColor("White");
		suv.setEngineNumber(897459381);
		
		//PRINT CAR DETAILS - CALLING printCarDetails Method to print
		printCarDetails(sedan.getBrand(), sedan.getModel(), sedan.getColor(), sedan.getEngineNumber());
		
		//SPACERS :P
		System.out.println(" ==================== ");
		
		//PRINT CAR DETAILS - CALLING printCarDetails Method to print
		printCarDetails(suv.getBrand(), suv.getModel(), suv.getColor(), suv.getEngineNumber());
		
	}
	
	public static void printCarDetails(String brand, String model, String color, int engineNumber) {
		System.out.println("Brand: " + brand);
		System.out.println("Model: " + model);
		System.out.println("Color: " + color);
		System.out.println("Engine Number: " + engineNumber);
	}

}
