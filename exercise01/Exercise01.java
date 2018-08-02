package exercise01;

import java.util.Scanner;

public class Exercise01 {
	
	// GCF: Great Common Factor
	
	public static int findGCF(int num1, int num2) throws BadIntegerInputException {
		if (num1 <= 0 || num2 <= 0) {
			throw new BadIntegerInputException("Integers should be larger than 0."); 
		}
		
		int gcf = 0;
		for (int i = 1; i <= num1; i++) {
			if ((num1 % i == 0) && (num2 % i == 0)) {
				gcf = i;
			}
		}

		return gcf;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("If you want to know the Greates Common Factor, please enter two integer numbers.");
		
		try {
			String s1 = scan.nextLine();
			String s2 = scan.nextLine();
			
			int i1 = Integer.parseInt(s1);
			int i2 = Integer.parseInt(s2);
			
			System.out.println("The greatest common factor of " + i1 + " and " + i2 + " is " + findGCF(i1, i2));
		} catch(BadIntegerInputException e) {
			System.out.println(e);
			
		} catch(Exception e) {
			System.out.println("An error occurs.");
		}
		
		scan.close();
	}
}
