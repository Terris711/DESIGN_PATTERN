package ObserverDesignPattern.model;

import ObserverDesignPattern.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public abstract class EmailTopic implements Subject {

    private String message;
    private List<ObserverDesignPattern.interfaces.Observer> observers;

    public EmailTopic(List<ObserverDesignPattern.interfaces.Observer> observers) {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        if (observer == null) throw new NullPointerException(("Null Object/Observers"));
        if (!observers.contains(observer)) observers.add((ObserverDesignPattern.interfaces.Observer) observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (ObserverDesignPattern.interfaces.Observer observer : observers){
            observer.update();
        }
    }

    @Override
    public Object getUpdate(Observer observer) {
        return null;
    }

    public void postMessage(String msg) {
        System.out.println("Message posted to my topic: " + msg);
        this.message = msg;
        notifyObservers();
    }

}


