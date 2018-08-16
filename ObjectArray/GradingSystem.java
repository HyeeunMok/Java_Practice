package exercise06;

import java.util.Scanner;

public class GradingSystem {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		
		int numOfStudents = scan.nextInt();
		int[] grades = new int[numOfStudents];
		
		Student[] student = new Student[numOfStudents];
		
		for (int i = 0; i < student.length; i++) {
			student[i] = new Student();
		}
		
		// Set each student object's name and grade
		for (int i = 0; i < student.length; i++) {
			System.out.println("Enter student " + i + "'s name: ");
			String name = scan.next();
			student[i].setName(name);
			
			System.out.println("Enter student " + i + "'s grade: ");
			int grade = scan.nextInt();
			student[i].setGrade(grade);			
		}
		
		for (int i = 0; i < student.length; i++) {
			int temp = student[i].getGrade();
			grades[i] = temp;
		}
		
		int bestGrade = findBestGrade(grades);
		
		for (int i = 0; i < student.length; i++) {
			student[i].setLetterGrade(findLetterGrade(grades[i], bestGrade));
		}
		
		for (int i = 0; i < student.length; i++) {
			System.out.println(student[i].toString());
		}

		scan.close();
		
	}
	
	public static int findBestGrade(int[] grades) {
		int bestGrade = grades[0];
		
		for (int grade : grades) {
			if (grade > bestGrade)
				bestGrade = grade;
		}
		return bestGrade;
	}
		
	public static char findLetterGrade(int grade, int bestGrade) {
		if (grade >= bestGrade - 10) 
			return 'A';
		else if (grade >= bestGrade - 20) 
			return 'B';
		else if (grade >= bestGrade - 30) 
			return 'C';
		else if (grade >= bestGrade - 40) 
			return 'D';
		else
			return 'F';
	}
}
