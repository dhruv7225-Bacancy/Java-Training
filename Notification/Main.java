package Notification;

public class Main {
    
    public static void main(String[] args) {
        NotificationService Email=NotificationFactory.getBean("Email");
        Email.sendNotification("hello");
        NotificationService Sms=NotificationFactory.getBean("Sms");
        Sms.sendNotification("hello 2");


    }
}
