package solid.openclosed.openclosedfollowed;

public class NewPlatform implements NotificationService{
    @Override
    public void sendNotification(String message) {
        System.out.println("New platform added "+message);
    }
}
