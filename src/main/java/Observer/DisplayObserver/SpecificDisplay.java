package Observer.DisplayObserver;

import Observer.DisplayObserver.Display;
import Observer.DisplayObserver.Observer;

public class SpecificDisplay implements Display, Observer {

    private float temperature;
    private float humidity;
    private float pressure;

    @Override
    public void display() {
        System.out.println("Specific ---> Temperature : "+temperature+" Humidity : "+humidity+" Pressure : "+pressure);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
