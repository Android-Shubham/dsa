package solid.openclosed.openclosedfollowed;

public class Program {
    public static void main(String[] args) {
        NotificationSender notificationSender = new NotificationSender();
        notificationSender.sendNotification(new AndroidNotification(),"Sending Android notification");
        notificationSender.sendNotification(new IosNotification(),"Sending ios Notification");
    }
}
