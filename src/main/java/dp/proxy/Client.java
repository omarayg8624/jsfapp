package dp.proxy;

public class Client {

	public static void main(String[] args) {

		Internet internet = new ProxyInternet();
		
		try {
			
			internet.connctTo("http://htu.edu.jo");
			internet.connctTo("aaa.com");
			
		} catch (Exception e) {
			
			System.err.println(e.getMessage());	
			
		}

	}

}
