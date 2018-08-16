package exercise07;

import java.util.ArrayList;
import java.util.Scanner;

	public class Lottery {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<LinePlay> lottery = new ArrayList<>();
		
		System.out.println("How many lines would you like to draw?");
		int numberOfLines = input.nextInt();
		for(int i = 0; i < numberOfLines; i++) {
			LinePlay line = new LinePlay();
			lottery.add(line);
		}
		for(LinePlay line : lottery) {
			System.out.println(line.toString());
		}
		
		input.close();
	}
}