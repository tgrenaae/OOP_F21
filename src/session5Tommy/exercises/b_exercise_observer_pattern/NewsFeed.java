package session5Tommy.exercises.b_exercise_observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class NewsFeed {

    private List<Subscriber> subscribers = new ArrayList();

    public void addSubscriber(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(String news) {

        for (Subscriber subscriber: subscribers) {
            subscriber.update(news);
        }
    }
}