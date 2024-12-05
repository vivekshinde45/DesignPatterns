package DesignPattern.ObserverPattern;

public class Main {
    public static void main(String[] args) {
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
