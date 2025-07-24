package designpatterns.observer;

public class EmailNotification implements IObserver {
    @Override
    public void update(String message) {
        System.out.println(message + "EmailNotification");
    }
}
