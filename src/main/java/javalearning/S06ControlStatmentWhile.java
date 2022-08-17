package javalearning;

import java.util.Scanner;

//While Statement is Repetition Control Statement
public class S06ControlStatmentWhile {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int marks = 0;
		int sum = 0;
		int counter = 0;

		while (counter < 6) {

			System.out.println("Enter Mark for Student No." + counter);
			marks = input.nextInt();
			sum += marks;
			counter++;
		}

		System.out.println("The Average is" + sum / counter);
	}

}
