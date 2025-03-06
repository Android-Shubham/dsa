package solid.openclosed.openclosedfollowed;

public class AndroidNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Android Notification: " + message);
    }
}
