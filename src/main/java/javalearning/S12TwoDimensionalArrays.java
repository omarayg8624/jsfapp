package javalearning;

import java.util.InputMismatchException;
import java.util.Scanner;

// Two Dimensional Array is a table data structure
public class S12TwoDimensionalArrays {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		double[][] comm = new double[2][3];
		System.out.println("Number of Rows: " + comm.length);
		System.out.println("Number of Columns: " + comm[0].length); // you can use any number of the rows "0".
		int[][] comm1 = { { 0, 1, 2 }, { 4, 5, 6 } }; // Initialize the values.

		// how to make all columns in one row has the same value. (you can do it for all
		// rows in one column)
		for (int col = 0; col < comm[0].length; col++) {
			comm[1][col] = 5;
		}

		int[][] matrix = new int[2][2];
		fillArray(matrix);
		printArray(matrix);
		int total = sumArray(matrix);
		System.out.println(total);
	}

	public static void fillArray(int[][] list) {
		for (int row = 0; row < list.length; row++) {
			for (int col = 0; col < list[0].length; col++) {
				System.out.println("Enter Value for Row No. " + row + " And Column No. " + col);
				list[row][col] = input.nextInt();
			}
		}
	}

	public static void printArray(int[][] list) {

		for (int row = 0; row < list.length; row++) {
			for (int col = 0; col < list[0].length; col++) {
				System.out.println(list[row][col]);
			}
		}
	}

	public static int sumArray(int[][] list) {

		int sum = 0;
		for (int row = 0; row < list.length; row++) {
			for (int col = 0; col < list[0].length; col++) {
				sum += list[row][col];
			}
		}
		return sum;
	}

}
