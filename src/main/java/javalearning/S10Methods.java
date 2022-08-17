package javalearning;

import java.util.Scanner;

//Method is a self-contained block of statements that perform a specific test
// to define the code once, and use it many times.
// Each method has return value type, function name, parameter list. (method
// definition)
// void mean that method will not return a value.
// When a parameter is passed to the method, it is called an argument. (10,15 in method "sum" is arguments)
// Local variable is a variable declared within a function or block and it can be used outside it.
// Global variable is a variable declared outside the main method or function or block (in the class) and it can be used anywhere in the class.
// Overloading means multiple methods can have the same name as long as the number and/or type of parameters are different, or different return value type with the different value type of the parameters.
public class S10Methods {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Start the Program");
		drawLine('-', 20);
		System.out.println("Welcome to the first part");
		drawLine('-', 20);

		System.out.println(sum(10, 15));
		System.out.println(larger(10, 5));
		System.out.println(larger('A', 'a'));

	}

	public static void drawLine(char c, int lenght) {
		for (int i = 0; i < lenght; i++) {
			System.out.print(c);
		}
		System.out.println();

	}

	// Method with a return value.
	public static int sum(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}

	// Methods Overloading
	public static int larger(int number1, int number2) {
		if (number1 > number2) {
			return number1;
		} else {
			System.out.println(number2);
			return number2;

		}
	}

	public static char larger(char c1, char c2) {
		if (c1 > c2) {
			return c1;
		} else {
			return c2;

		}
	}
}
