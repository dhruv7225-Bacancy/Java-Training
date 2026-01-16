package  Notification;

public class NotificationFactory {

    public static NotificationService getBean(String s){
        return switch (s.toLowerCase()) {
            case "email" ->new EmailNotification();
            case "sms"-> new SmsNotification();
            default-> null;
        };
    }
}