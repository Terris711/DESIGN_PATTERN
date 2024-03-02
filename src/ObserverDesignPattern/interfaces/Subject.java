package ObserverDesignPattern.interfaces;

import java.util.Observer;

public interface Subject {
    public void register(Observer observer);
    public void unregister(Observer observer);

    void register(ObserverDesignPattern.interfaces.Observer observer);

    void unregister(ObserverDesignPattern.interfaces.Observer observer);

    public void notifyObservers();

    public Object getUpdate(Observer observer);

    Object getUpdate(ObserverDesignPattern.interfaces.Observer observer);
}
