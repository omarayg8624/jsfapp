package dp.factory;

public class NotificationFactory {
	
	public Notification createNotification (String channel) {
	
	if (channel.equalsIgnoreCase("SMS")) {
    return new SMSNotification();
	}
	
	if (channel.equalsIgnoreCase("Email")) {
		return new EmailNotification();		
		}
	
	if (channel.equalsIgnoreCase("Push")) {
		return new PushNotification();		
		}
	
	return null;
	
	}
}