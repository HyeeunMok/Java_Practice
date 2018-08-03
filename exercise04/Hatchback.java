package exercise04;

public class Hatchback extends Car {
	
	@Override
	public void drive() {
		System.out.println("Drive Hatchback.");
	}
	
	@Override
	public void run() {
		System.out.println("Run Hatchback.");
	}
	
	@Override
	public void start() {
		System.out.println("Start Hatchback.");
	}
	
	@Override
	public void stop() {
		System.out.println("Stop Hatchback.");
	}
	
	@Override
	public void numberOfDoors() {
		System.out.println("Hatchback has 2 doors.");
	}
	
	public void hasBigCargoSpace() {
		System.out.println("Hatchback has big cargo space than Sedan.");
	}
	
	public void foldBackSeats() {
		System.out.println("Hatchback's back seat is foled.");
	}
}
