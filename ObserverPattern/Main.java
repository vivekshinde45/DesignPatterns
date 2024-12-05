package DesignPattern.ObserverPattern;

public class Main {
    public static void main(String[] args) {

        /*
         * The Observer Design Pattern is a behavioral design pattern that defines a
         * one-to-many dependency between objects.
         * In this pattern, a subject (also known as the observable) maintains a list of
         * observers (also called listeners or subscribers) that need to be notified
         * when the state of the subject changes.
         * The key idea is that the subject notifies all its observers automatically
         * when its state changes, without needing to know who or what those observers
         * are.
         * 
         * Subject (Observable): The object whose state changes. It holds a collection
         * of observers and notifies them when its state changes.
         * Observer: The object that wants to be notified when the subject’s state
         * changes. It typically updates itself based on the state of the subject.
         * Notification: When the subject’s state changes, it notifies all registered
         * observers so they can update accordingly.
         * 
         * Problem It Solves:
         * The Observer Pattern is used when one object (the subject) needs to notify
         * multiple dependent objects (the observers) about changes to its state,
         * without the subject needing to know who the observers are or how many there
         * are.
         * 
         * It is useful when there is a need to maintain loose coupling between objects.
         * The subject does not need to know the specifics of the observers,
         * only that it needs to notify them when its state changes.
         * 
         * Real-life Example: A YouTube channel notifies subscribers when a new video is
         * uploaded.
         */

        YoutubeChannel gamingChannel = new YoutubeChannel();

        Observer subscriber1 = new Subscriber("vivek");
        Observer subscriber2 = new Subscriber("shivam");
        Observer subscriber3 = new Subscriber("saurabh");

        gamingChannel.subscribe(subscriber1);
        gamingChannel.subscribe(subscriber2);
        gamingChannel.subscribe(subscriber3);

        gamingChannel.notifySubscribers("Check out new video on GTA5 gameplay");
    }
}
