package javalearning;

import java.util.Scanner;

// Sequential execution is when a program execute one after the other in the order.
// Transfer of Control when control statement enable you to specify the next statement executed before other the next one.
/*
 *  Control Statement:
 *  1 - Selection Control Statement
 *  2 - Repetition Control Statement
 */
public class S04ControlStatementIF {

	// IF Statement is Selection Control Statement
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int marks;
		System.out.println("Enter Your Mark");
		marks = input.nextInt();

		if (marks > 60) {

			System.out.println("You Passed");

		} else {
			System.out.println("You Failed");
		}

		// Nested IF means IF INSIDE IF.
		int number;
		System.out.println("Enter the number");
		number = input.nextInt();

		if (number > 0) {
			if (number % 2 == 0) {
				System.out.println("Even Number");
			} else {
				System.out.println("Odd Number");
			}
		} else {
			System.out.println("Negative Number");
		}

		// Else IF means that we have a lot of possibilities.
		int number1;
		int number2;
		System.out.println("Enter the number 1");
		number1 = input.nextInt();
		System.out.println("Enter the number 2");
		number2 = input.nextInt();

		if (number1 == number2) {

			System.out.println("Both Number Are Equal");

		} else if (number1 > number2) {

			System.out.println("Number 1 is bigger than Number 2");
		} 
		
		else {
			System.out.println("Number 2 is bigger than Number 1");
		}
	}

}
