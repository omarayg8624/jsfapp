package tests;

public class TestLines {

	public static void main(String[] args) {

		Lines ex1 = new Lines();
		ex1.setId(1);
		ex1.setOutput(90.0);
		ex1.setSpeed(1000.0);
		
		Lines ex2 = new Lines();
		ex2.setId(2);
		ex2.setOutput(135.0);
		ex2.setSpeed(500.0);
		
		Lines ex3 = new Lines();
		ex3.setId(3);
		ex3.setOutput(160.0);
		ex3.setSpeed(150.0);
		
		Lines ex4 = new Lines();
		ex4.setId(4);
		ex4.setOutput(400.0);
		ex4.setSpeed(50.0);
		
		System.out.println(ex1.getId() + " " + ex1.getOutput() + " " + ex1.getSpeed());
		System.out.println(ex2.getId() + " " + ex2.getOutput() + " " + ex2.getSpeed());
		System.out.println(ex3.getId() + " " + ex3.getOutput() + " " + ex3.getSpeed());
		System.out.println(ex4.getId() + " " + ex4.getOutput() + " " + ex4.getSpeed());
		
	}
	

}
