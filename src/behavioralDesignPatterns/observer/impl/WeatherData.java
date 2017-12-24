package behavioralDesignPatterns.observer.impl;

import behavioralDesignPatterns.observer.api.IObserver;
import behavioralDesignPatterns.observer.api.ISubject;

import java.util.ArrayList;

/**
 * WeatherData.
 * Date: 07/16/2017
 *
 * @author Mikalai Bezmen
 */
public class WeatherData implements ISubject {

    private Weather weather;
    private ArrayList<IObserver> observers = new ArrayList<>();

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(weather));
    }

    public void measurementsChanged(Weather newWeather) {
        this.weather = newWeather;
        notifyObserver();
    }
}
