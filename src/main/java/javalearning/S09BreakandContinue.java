package javalearning;

import java.util.Scanner;

// Break is used when you want to get out from the loop directly and skip all remaining statements and exit from the loop.
// Continue used when you want to skip the remaining statements and do the loop again.
public class S09BreakandContinue {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int marks = 0;
		int sum = 0;
		int counter = 1;

		while (counter <= 6) {

			System.out.println("Enter Mark for Student No." + counter);
			marks = input.nextInt();
			if (marks < 0) {
				System.out.println("Negative Numbers Not Allowed");
				break;
			}
			sum += marks;
			counter++;
		}

		System.out.println("The Average is" + sum / counter);
		
		//////////////////////////////////////////////////////////////////////////////
		
		int marks1 = 0;
		int sum1 = 0;
		int counter1 = 1;

		while (counter <= 6) {

			System.out.println("Enter Mark for Student No." + counter1);
			marks = input.nextInt();
			if (marks < 0) {
				System.out.println("Negative Numbers Not Allowed");
				continue;
			}
			sum1 += marks1;
			counter1++;
		}

		System.out.println("The Average is" + sum1 / counter);

	}

}
