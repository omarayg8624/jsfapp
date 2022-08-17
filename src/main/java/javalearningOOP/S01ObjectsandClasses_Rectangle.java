package javalearningOOP;

// Object-Oriented Programming is about creating objects that contain both data and methods.

/* a class is a template for objects, and an object is an instance of a class.
   When the individual objects are created, they inherit all the variables and methods from the class.*/
// A Class is like an object constructor, or a "blueprint" for creating objects.

// Class attributes (fields) are variables within a class.

// If you don't want the ability to override existing values, declare the attribute as final.

/* We created a static method, which means that it can be accessed without creating an object of the class,
   unlike public, which can only be accessed by objects */

/* Scanner input = new Scanner(System.in);
   Scanner is a class, input is an object, "new" word is to book a place in the memory for this object. 
   input is a variable that refer to class Scanner object in the memory. (all object like this) - (input called reference variable) */

/* Access Modifier:
   1- Public: the member (attributes) can be accessed by code inside the class or outside.
   2- Private: the member (attributes) cannot be accessed by code outside the class, only inside, the members (attributes) can be
      accessed only by the methods that are members of the same class. (I need to write these methods) */

/* Data Hiding: means to make the attributes private to disable any change on them by the user. (Used to enforce the integrity
   of an object's internal data) */

/* Methods used to set value in the attribute of the object called Setters.
   Methods used to get value of the attribute of the object called getters. */

public class S01ObjectsandClasses_Rectangle {

	private double length;
	private double width;

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
