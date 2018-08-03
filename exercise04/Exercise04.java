package exercise04;

public class Exercise04 {

	public static void main(String[] args) {
		
		Sedan se = new Sedan();
		se.start();
		se.run();
		se.drive();
		se.stop();
		se.openRoof();
		se.closeRoof();
		System.out.println("-----------------------------------");
		
		StationWagon sw = new StationWagon();
		sw.start();
		sw.run();
		sw.drive();
		sw.stop();
		sw.hasRearSuspension();
		sw.hasRearDoor();
		System.out.println("-----------------------------------");
		
		Hatchback ha = new Hatchback();
		ha.start();
		ha.run();
		ha.drive();
		ha.stop();
		ha.hasBigCargoSpace();
		ha.foldBackSeats();
		System.out.println("-----------------------------------");
		
		Car[] cars = new Car[6];
		cars[0] = new Sedan();
		cars[1] = new StationWagon();
		cars[2] = new Sedan();
		cars[3] = new Hatchback();
		cars[4] = new Hatchback();
		cars[5] = new Sedan();
		
		for (int i = 0; i < cars.length; i++) {
			cars[i].start();
			cars[i].stop();
		}

	}

}
