package LabObserverPattern;

import java.util.HashSet;
import java.util.Set;

public class NewsAgency implements NewsBroadcaster {
    private final Set<Subscriber> subscribers = new HashSet<>();

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers(String news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }

    public void publishNews(String headline, String detailedNews) {
        String border = new String(new char[100]).replace("\0", "=");
        System.out.println(border);
        System.out.println("📰 TODAY'S TOP STORY: " + headline + " 📰");
        System.out.println(border);
        notifySubscribers(detailedNews);
        System.out.println(border);
        System.out.println("Stay informed with the latest updates. Thank you for trusting Around the Clock News.");
        System.out.println(border + "\n");
    }
}
