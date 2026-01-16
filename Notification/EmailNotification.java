package Notification;

public class EmailNotification implements NotificationService{
    
    public void sendNotification(String msg){
        System.out.println("message sent via Email" +msg);
    }
}
