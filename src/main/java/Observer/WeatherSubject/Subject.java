package Observer.WeatherSubject;

import Observer.DisplayObserver.Observer;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
