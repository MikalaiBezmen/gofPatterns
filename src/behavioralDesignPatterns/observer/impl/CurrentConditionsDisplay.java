package behavioralDesignPatterns.observer.impl;

import behavioralDesignPatterns.observer.api.IDisplayElement;
import behavioralDesignPatterns.observer.api.IObserver;
import behavioralDesignPatterns.observer.api.ISubject;

/**
 * CurrentConditionsDisplay.
 * Date: 07/16/2017
 *
 * @author Mikalai Bezmen
 */
public class CurrentConditionsDisplay implements IObserver, IDisplayElement {

    private ISubject weatherData;
    private Weather weather;

    public CurrentConditionsDisplay(ISubject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(getClass().getSimpleName() + weather.toString());
    }

    @Override
    public void update(Weather newWeather) {
        this.weather = newWeather;
        display();
    }
}
