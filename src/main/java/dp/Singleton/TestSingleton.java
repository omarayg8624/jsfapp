package dp.Singleton;

public class TestSingleton {

	public static void main(String[] args) {

		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();

		System.out.println("x--> " + x );
		System.out.println("y--> " + y );
		System.out.println("z--> " + z );

		if (x==y && y==z) {
			
			System.out.println("\n Three Objects Points to the Same Memory Location");
			
		}
	}

}
