package javalearning;

import java.util.Scanner;

public class S02Input {

	public static void main(String[] args) {

		// Taking an object from class Scanner named "input".
		Scanner input = new Scanner(System.in);

		/* number1 is a variable (variable is a place to store the data in the memory),
		   should declared with name & datatype (declaration). */
		// Initialization is give the variable primary value.
		int lenght;
		int width;
		int area;

		System.out.println("Enter Length");
		lenght = input.nextInt();

		System.out.println("Enter Width");
		width = input.nextInt();

		area = lenght * width;
		System.out.println(area);

		
	}

	
}
