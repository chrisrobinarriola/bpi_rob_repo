package bpi.training;

public class Main {

	public static void main(String[] args) {
		Car car = new Car(4,"Mazda");
		Truck truck = new Truck(8, "Ford");
		
		car.startEngine();
		car.refuel();
		
		truck.startEngine();
		truck.refuel();
		
		destroyVehicle(car);
		destroyVehicle(truck);
	}
	
	public static void destroyVehicle(Vehicle v) {
		v.destroy();
	}
	
}
