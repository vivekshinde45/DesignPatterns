package DesignPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel {
    private List<Observer> subscribers = new ArrayList<>();

    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        subscribers.remove(observer);
    }

    public void notifySubscribers(String message) {
        for (Observer subscriber : subscribers) {
            subscriber.update(message);
        }
    }
}
