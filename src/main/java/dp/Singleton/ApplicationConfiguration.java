package dp.Singleton;

import java.util.HashMap;
import java.util.Map;

public class ApplicationConfiguration {

	public static ApplicationConfiguration Instance;
	private static Map<String, String> configMap;

	private ApplicationConfiguration() {

		configMap = new HashMap<String, String>();
		configMap.put("host", "localhost");
		configMap.put("port", "1512");
		configMap.put("user", "scott");
		configMap.put("password", "tiger");

	}

	public static ApplicationConfiguration getInstance() {
		if (Instance == null) {
			Instance = new ApplicationConfiguration();

		}

		return Instance;
	}

	public String update(String key, String value) {

		return configMap.put(key, value);
	}

	public String get (String key) {
			
			return configMap.get(key);
	}	
	
}

