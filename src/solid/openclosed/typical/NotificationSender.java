package solid.openclosed.typical;

public class NotificationSender {
    public void sendNotification(String type, String message){
        if(type.equals("android")){
            System.out.println("Android notification logic"+message);
        }else if(type.equals("ios")){
            System.out.println("iOS notification logic");
        }else if(type.equals("web")){
            System.out.println("Web notification logic");
        }else if(type.equals("windows")){
            System.out.println("Windows notification logic");
        }
    }
}
