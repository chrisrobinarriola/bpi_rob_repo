package bpi.training;

public class Car extends Vehicle implements Refuelable{

	public Car(int numberOfWheels, String brand) {
		super(numberOfWheels, brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void refuel() {
		// TODO Auto-generated method stub
		System.out.println(brand + " car refueled. All " + numberOfWheels + " wheels are in good condition!");
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println(brand + " car started.");
	}
	
	
}
