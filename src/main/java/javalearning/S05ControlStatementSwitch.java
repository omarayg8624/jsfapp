package javalearning;

import java.util.Scanner;

public class S05ControlStatementSwitch {

	// Switch Statement is Selection Control Statement, it is allows us to make a
	// decision from the number of choices.
	// Switch Statement does not receive double and float numbers.
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		char grades;
		System.out.println("Enter Your Grade");
		grades = input.next().charAt(0);

		switch (grades) {
		case 'A':
			System.out.println("Exelent");
			break;
		case 'B':
			System.out.println("Very Good");

			break;
		case 'C':
			System.out.println("Good");

			break;
		case 'D':
			System.out.println("Fair");
			break;
		case 'F':
			System.out.println("Failed");
			break;

		default:
			System.out.println("Error");
			break;
		}

		//Example shows the meaning of break.
		char letter;
		System.out.println("Enter Your Grade");
		letter = input.next().charAt(0);

		switch (letter) {
		case 'a':
		case 'o':
		case 'i':
		case 'e':
		case 'u':
			System.out.println("Vowel");
			break;

		default:
			System.out.println("Not Vowel");
			break;
		}
	}

}
