package exercise06;

import java.util.Scanner;
public class GradingSystem {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		
		int numOfStudents = scan.nextInt();
		System.out.println("Enter " + numOfStudents + " scores: ");
		
		
		int[] scores = new int[numOfStudents];

		
		for (int i = 0; i < numOfStudents; i++) {
			scores[i] = scan.nextInt();
		}
		scan.close();
		
		findLetterGrade(scores);
		
	}
		
	public static void findLetterGrade(int[] array) {
		int bestScore = 0;
		char letterGrade;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] > bestScore)
			bestScore = array[i];
		}
	
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= (bestScore - 10))
				letterGrade = 'A';
			else if (array[i] >= (bestScore - 20))
				letterGrade = 'B';
			else if (array[i] >= (bestScore - 30))
				letterGrade = 'C';
			else if (array[i] >= (bestScore - 40))
				letterGrade = 'D';
			else
				letterGrade = 'F';
			
			System.out.println("Student " + i + " score is " + array[i] + 
					" and grade is " + letterGrade);
		}

	}
}
