package bpi.oop.training;

public class Car {
	String brand, model, color;
	int engineNumber;
	
	public Car(String brand, String model, String color, int engineNumber) {
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.engineNumber = engineNumber;
	}
	
	public Car() {
		
	}
	
	public void setModel(String model) {
		this.model =  model;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void setColor(String color) {
		this.color =  color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setEngineNumber(int engineNumber) {
		this.engineNumber =  engineNumber;
	}
	
	public int getEngineNumber() {
		return this.engineNumber;
	}
}
