package bpi.training;

public class MSWord extends Executable{
	@Override
	void run() {
		System.out.println("Opening MS Word");
	}
	
	@Override
	void stop() {
		System.out.println("Stopping MS Word");
	}
}
