package dp.factory;

public class Client {

	public static void main(String[] args) {
		
		NotificationFactory factory = new NotificationFactory();
		Notification notification = factory.createNotification("Email");
		notification.notifyUser();
		
		notification = factory.createNotification("Push");
		notification.notifyUser();

		
		

	}

}
