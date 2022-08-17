package dp.Singleton;

public class Client {

	public static void main(String[] args) {

		ApplicationConfiguration config1 = ApplicationConfiguration.getInstance();
		ApplicationConfiguration config2 = ApplicationConfiguration.getInstance();

		System.out.println("Config1:  User -->" + config1.get("user"));
		System.out.println("Config1:  Host -->" + config1.get("host"));
		System.out.println("Config2:  User -->" + config2.get("user"));

		config1.update("password", "tiger#2022");
		System.out.println("Config1:  Password -->" + config1.get("password"));
		System.out.println("Config2:  Password -->" + config2.get("password"));

	}

}
