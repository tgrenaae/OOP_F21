package session5Tommy.exercises.b_exercise_observer_pattern;


public class Demo {

    public static void main(String[] args) {
        NewsFeed feed = new NewsFeed();

        Subscriber emailSubscriber = new EmailSubscriber("arma@cs.aau.dk");
        Subscriber appSubscriber = new AppSubscriber(123456);

        feed.addSubscriber(emailSubscriber);
        feed.addSubscriber(appSubscriber);

        feed.notifySubscribers("The observer pattern is great!");

    }
}
