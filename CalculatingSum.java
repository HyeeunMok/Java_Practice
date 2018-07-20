
/* This program is to generate two random integers.
 * Then ask a user to answer their sum. 
 * The program will store all wrong answers from the user into an ArrayList.
 * If the user enters the same answer twice, they will get the following message: 
 * “You already entered (value)”
 */

import java.util.ArrayList;
import java.util.Scanner;
public class CalculatingSum {
	// Main method
	public static void main(String[] args) {

		int num1, num2;

		// Generating two integers randomly
		num1 = (int)(Math.random()*10);
		num2 = (int)(Math.random()*10);

		// Invoking sumQuiz method using above two random integers
		sumQuiz(num1, num2);

	}
	// Method for adding two integers
	public static void sumQuiz(int num1, int num2) {
		ArrayList<Integer> wrongAnswers = new ArrayList<>();
		int answer, userAnswer;
		Scanner input = new Scanner(System.in);
		answer = num1 + num2;

		do {
			// Ask the user about sum of two integers
			System.out.println("\nWhat is " + num1 + " + " + num2 + "?");
			// Prompt the user for their sum
			userAnswer = input.nextInt();

			if (answer != userAnswer) {
				// Check if the user's answer is in the wrong answers array
				if (wrongAnswers.contains(userAnswer)) {
					System.out.println("You already entered " + userAnswer);
				}
				else {
					System.out.println("Wrong answer. Try again");
					// Add wrong answer to wrongAnswers array
					wrongAnswers.add(userAnswer);
				}
			}
			// Continuing while the user's answer is not correct
		} while (answer != userAnswer);

		// Print a message when the user got a correct answer and finish the method
		System.out.println("You got it!");

		input.close();
	}
}

