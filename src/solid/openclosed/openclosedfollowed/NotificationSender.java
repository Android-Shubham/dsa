package solid.openclosed.openclosedfollowed;

public class NotificationSender {
    public void sendNotification(NotificationService notificationService,String message){
        notificationService.sendNotification(message);
    }
}
