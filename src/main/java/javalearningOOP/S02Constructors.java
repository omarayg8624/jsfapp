package javalearningOOP;

// Constructors: Used to get the ability to initialize the object.
/* Overloading means that having two methods with the same name in the class, each method different in number of arguments,
   data type of arguments, and arrange of arguments (signature of the method). */
// Java provides default constructors with int value 0, and boolean value false.
public class S02Constructors {

	private double length;
	private double width;

//  Constructor(1):- You can initialize the variable and get a specific value for every variable.
	public S02Constructors () {
		length = 10;
		width = 15;
	}

//  Constructor(2):- Used to make the user to set the value of the variables.
	public S02Constructors(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public void setLength(double length) {
		if (length > 0) {
			this.length = length;
		} else {
			System.out.println("Invalid Input");
		}
	}

	public void setWidth(double width) {
		if (width > 0) {
			this.width = width;
		} else {
			System.out.println("Invalid Input");
		}
	}

	public double getWidth() {
		return width;
	}

	public double getlength() {
		return length;
	}

	public double getArea() {
		return 0.5 * length * width;
	}

}
