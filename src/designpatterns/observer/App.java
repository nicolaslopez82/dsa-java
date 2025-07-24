package designpatterns.observer;

public class App {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.addObserver(new EmailNotification());
        notificationService.addObserver(new SMSNotification());
        notificationService.notifyAllObservers("notifyAll - ");
    }
}
