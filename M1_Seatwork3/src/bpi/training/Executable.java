package bpi.training;

public abstract class Executable {
	void run() {
		System.out.println("Program is running!");
	}
	
	void stop() {
		System.out.println("Program has stopped!");
	}
}
