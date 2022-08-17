package javalearning;

import java.util.Scanner;

// Do while Control Statement is Repetition Statement.
// It does the action for one time then test the condition.
public class S07ControlStatementDoWhile {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int option;
		int num1 = 20, num2 = 10;

		do {
			System.out.println("Select an Option from the Menu:");
			System.out.println("1. Add Number");
			System.out.println("2. Subtract Number");
			System.out.println("3. Exit");
			option = input.nextInt();

			switch (option) {
			case 1:
				System.out.println(num1 + num2);
				break;
			case 2:
				System.out.println(num1 - num2);
				break;
			case 3:
				System.out.println("Goodbye");
				break;
			default:
				System.out.println("Invalid Number");
				break;
			}
		} while (option != 0);
	}

}
