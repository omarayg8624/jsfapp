package javalearning;

import java.util.Scanner;

// Array is an object.
// To define an array you need to define data type,name of the array, word "new" which mean new object, data type, and size of the array.
// when define an array with numeric types the initial value for the elements is 0.
// when define an array with char types the initial value for the elements is null.
// when define an array with boolean types the initial value for the elements is false.
// One Dimensional Array is a list data structure

public class S11OneDimensionalArrays {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		int size;
		System.out.println("Enter the Size");
		size = input.nextInt();
		double[] salaries = new double[size];

		for (int i = 0; i < salaries.length; i++) {
			System.out.println("Enter the salary for " + (i + 1));
			salaries[i] = input.nextDouble();
		}

		double sum = 0;

		for (int i = 0; i < salaries.length; i++) {
			sum += salaries[i];
		}
		System.out.println("Sum is " + sum);
		System.out.println("Average is " + sum / size);

		// Arrays and Methods

		int size1;
		System.out.println("Enter the Size");
		size1 = input.nextInt();
		int[] ids = new int[size1];
		fillArray(ids);
		printArray(ids);

		System.out.println("Enter the id");
		int searchid = input.nextInt();
		int returneindex = search(ids, searchid);

		if (returneindex >= 0) {
			System.out.println("The Item Has Found");
		} else {
			System.out.println("The Item Is Not Found");
		}
	}

	public static void fillArray(int[] list) {

		for (int i = 0; i < list.length; i++) {
			System.out.println("Enter No. " + (i + 1));
			list[i] = input.nextInt();
		}
	}

	public static void printArray(int[] list) {

		for (int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}

	public static int search(int[] list, int target) {

		for (int i = 0; i < list.length; i++) {
			if (list[i] == target) {
				return i;
			}
		}
		return -1;
	}
}
