package ObserverDesignPattern.model;

import ObserverDesignPattern.interfaces.Observer;
import ObserverDesignPattern.interfaces.Subject;

public class EmailTopicSubscriber implements Observer {

    private Subject topic; // Referencce to our Subject class
    private String message;
    private String name;

    public EmailTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg = (String)topic.getUpdate(this);
        if (msg == null) System.out.println(name + " No new message on this topic!");
        else System.out.println(name + " Retrieving message: " + msg);

    }

    @Override
    public void setSubject(Subject subject) {
        this.topic = subject;
    }
}
