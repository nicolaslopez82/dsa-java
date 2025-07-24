package designpatterns.observer;

public class SMSNotification implements IObserver {
    @Override
    public void update(String message) {
        System.out.println(message + "SMS Notification");
    }
}
