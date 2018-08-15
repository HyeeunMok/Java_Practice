package vienSClass;

public class ArgumentList {

	public static double average(double... numbers) {
		double avg = 0.0;
		if (numbers.length > 0) {
			for (int i = 0; i < numbers.length; i++) {
				avg += numbers[i];
			}
			
			avg /= numbers.length;
		}
		return avg;
	}
	
	
	public static void main(String[] args) {
		System.out.println(average(1, 2, 3, 4));
		System.out.println(average(1, 1, 1, 1));
		System.out.println(average(67, 72));
		System.out.println(average(103, 2.02, 3.11, 4));
	}

	
	
	
	
	
}
