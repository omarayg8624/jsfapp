package dp.factory;
import java.awt.*;
import java.awt.TrayIcon.MessageType;

public class PushNotification implements Notification {

	@Override
	public void notifyUser() {

		if (SystemTray.isSupported()) {
            try {
				
			displayTray();
			} catch (Exception e) {
				e.printStackTrace();
			}
        } else {
            System.err.println("Push Notification Sent Successfully");
        }
    }

    public static void displayTray() throws AWTException {
        SystemTray tray = SystemTray.getSystemTray();

        Image image = Toolkit.getDefaultToolkit().createImage("icon.png");

        TrayIcon trayIcon = new TrayIcon(image, "Tray Demo");
        trayIcon.setImageAutoSize(true);
        trayIcon.setToolTip("System tray icon demo");
        tray.add(trayIcon);

        trayIcon.displayMessage("Hello, World", "notification demo", MessageType.INFO);
    }

	
	}


