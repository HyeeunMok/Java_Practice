package vienSClass;

public class ParallelArrays {

	public static void main(String[] args) {
		String[] fname = new String[6];
		String[] lname = new String[6];
		int[] age = new int[6];
		
		// Add in the first person
		fname[0] = "Jon";
		lname[0] = "Smith";
		age[0] =25;
		
		// Add in the second person
		fname[1] = "Julius";
		lname[1] = "Caesar";
		age[1] =31;		
		
		// Add in the third person
		fname[2] = "Jean";
		lname[2] = "Hope";
		age[2] =46;		
		
		// Add in the fourth person
		fname[3] = "James";
		lname[3] = "Band";
		age[3] =68;		
		
		// Add in the fifth person
		fname[4] = "Shawn";
		lname[4] = "Lee";
		age[4] =53;		
		
		// Add in the sixth person
		fname[5] = "Jung";
		lname[5] = "Kim";
		age[5] =14;		
		
		
		// Print information for all people
		
		for (int i = 0; i < 6; i++) {
			System.out.println("Person " + (i + 1) + ": " + fname[i] + ", " +
								lname[i] + ", " + age[i]);
		}

	}

}
