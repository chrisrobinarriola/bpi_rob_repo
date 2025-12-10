package bpi.training;

public class Truck extends Vehicle implements Refuelable{

	public Truck(int numberOfWheels, String brand) {
		super(numberOfWheels, brand);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void refuel() {
		// TODO Auto-generated method stub
		System.out.println(brand + " truck refueled. All " + numberOfWheels + " wheels are in good condition!");
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println(brand + " truck started.");
	}

}
