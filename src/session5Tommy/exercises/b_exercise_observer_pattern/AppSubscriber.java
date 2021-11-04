package session5Tommy.exercises.b_exercise_observer_pattern;

public class AppSubscriber implements Subscriber{
    int phoneNumber;

    public AppSubscriber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(String news) {
        System.out.println("Pushing Notitification to phone ID "+phoneNumber+" with news: "+news);
    }
}
