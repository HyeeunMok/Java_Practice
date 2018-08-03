package exercise04;

public abstract class Car {
	public void drive() {
		System.out.println("Drive a car.");
	}
	
	public void run() {
		System.out.println("Run a car.");
	}
	
	public void start() {
		System.out.println("Start a car.");
	}
	
	public void stop() {
		System.out.println("Stop a car.");
	}
	
	public abstract void numberOfDoors();
}
