package javalearningOOP;

public class S02Constructors1 {

	public static void main(String[] args) {

		S02Constructors s1 = new S02Constructors();
		System.out.println(s1.getlength());

		S02Constructors s2 = new S02Constructors(30, 50);
		System.out.println(s2.getlength());
	}

}
