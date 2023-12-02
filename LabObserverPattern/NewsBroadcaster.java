package LabObserverPattern;

public interface NewsBroadcaster {
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers(String news);
}
