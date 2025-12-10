package bpi.training;

public abstract class Vehicle {

	protected int numberOfWheels;
	protected String brand;
	
	public Vehicle(int numberOfWheels, String brand) {
		this.numberOfWheels = numberOfWheels;
		this.brand = brand;
	}
	
	public abstract void startEngine();
	
	public void destroy() {
		System.out.println(brand + " destroyed! All " + numberOfWheels + " wheels recycled!");
	}
}
