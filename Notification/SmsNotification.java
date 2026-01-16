package Notification;

public class SmsNotification implements NotificationService{
    public void sendNotification(String msg){
        System.out.println("message sent via SMS" +msg);
    }
}
