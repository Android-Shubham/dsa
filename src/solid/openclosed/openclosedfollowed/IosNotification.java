package solid.openclosed.openclosedfollowed;

public class IosNotification implements NotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println("iOS notification service" +  message);
    }
}
