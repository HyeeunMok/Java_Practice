package exercise04;

public class Sedan extends Car {

	@Override
	public void drive() {
		System.out.println("Drive Sedan.");
	}
	
	@Override
	public void run() {
		System.out.println("Run Sedan.");
	}
	
	@Override
	public void start() {
		System.out.println("Start Sedan.");
	}
	
	@Override
	public void stop() {
		System.out.println("Stop Sedan.");
	}
	
	@Override
	public void numberOfDoors() {
		System.out.println("Sedan has 4 doors.");
	}
	
	public void openRoof() {
		System.out.println("Sedan's roof is opened.");
	}
	
	public void closeRoof() {
		System.out.println("Sedan's roof is closed.");
	}
}
