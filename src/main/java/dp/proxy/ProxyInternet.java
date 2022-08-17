package dp.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

	private Internet internet = new RealInternet();
	private static List<String> unauthorizedSites;

	static {

		unauthorizedSites = new ArrayList<String>();
		unauthorizedSites.add("aaa.com");
		unauthorizedSites.add("bbb.com");
		unauthorizedSites.add("ccc.com");

	}

	@Override
	public void connctTo(String serverHost) throws Exception {

		if (unauthorizedSites.contains(serverHost.toLowerCase())) {
			throw new Exception("Access Denied : " + serverHost);

		}

		internet.connctTo(serverHost);
		
	}

}
