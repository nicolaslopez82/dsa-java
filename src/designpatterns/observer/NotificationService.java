package designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

    private List<IObserver> observers = new ArrayList<>();

    public NotificationService() {}

    public void addObserver(IObserver observer) {
        observers.add(observer);
    }
    public void notifyAllObservers(String message) {
        for(IObserver observer : observers){
            observer.update("notifyAll ");
        }
    }
}
