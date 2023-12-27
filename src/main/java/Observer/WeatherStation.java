package Observer;

import Observer.DisplayObserver.Observer;
import Observer.DisplayObserver.SpecificDisplay;
import Observer.DisplayObserver.StandardDisplay;
import Observer.WeatherSubject.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer standardDisplay = new StandardDisplay();
        weatherData.registerObserver(standardDisplay);
        Observer specificDisplay = new SpecificDisplay();
        weatherData.registerObserver(specificDisplay);
        weatherData.setMeasurementsChanged(10, 12, 4);
        System.out.println("...Removing specific display from observers....");
        weatherData.removeObserver(specificDisplay);
        weatherData.setMeasurementsChanged(9, 10, 3);
    }
}
