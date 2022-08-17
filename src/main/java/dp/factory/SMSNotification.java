package dp.factory;

public class SMSNotification implements Notification {

	@Override
	public void notifyUser() {

		System.out.println("SMS Sent Successfully");
	}

}
