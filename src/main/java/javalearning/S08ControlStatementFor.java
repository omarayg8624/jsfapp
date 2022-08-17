package javalearning;

import java.util.Scanner;

//For Statement is Repetition Control Statement
public class S08ControlStatementFor {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int marks = 0;
		int sum = 0;
		int counter = 0;

		for (int i = 0; i < args.length; i++) {
			
			System.out.println("Enter Mark for Student No." + counter);
			marks = input.nextInt();
			sum += marks;
		}
		{

			System.out.println("The Average is" + sum / counter);
		}
	}
}
