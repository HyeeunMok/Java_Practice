package vienSClass;

import java.util.Scanner;
public class ArrayExample {

	public static void main(String[] args) {
		
		// Create an array of strings.
		String[] names = new String[5];
		
		// Define a scanner to read input.
		Scanner scan = new Scanner(System.in);
		
		//Read in the names and store them in the array of strings.
		for (int i = 0; i < names.length; i++) {
			System.out.println("Please enter a name.");
			names[i] = scan.nextLine();
		}
		
		// Output the list of names
		System.out.println("The names entered were:");
		for (int i = 0; i <  names.length; i++) {
			System.out.println(names[i]);
		}
		
		scan.close();

	}

}
