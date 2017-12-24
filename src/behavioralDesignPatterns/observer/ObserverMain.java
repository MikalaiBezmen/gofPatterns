package behavioralDesignPatterns.observer;

import behavioralDesignPatterns.observer.impl.CurrentConditionsDisplay;
import behavioralDesignPatterns.observer.impl.ForecastDisplay;
import behavioralDesignPatterns.observer.impl.StatisticsDisplay;
import behavioralDesignPatterns.observer.impl.Weather;
import behavioralDesignPatterns.observer.impl.WeatherData;

/**
 * ObserverMain.
 * Date: 07/16/2017
 *
 * @author Mikalai Bezmen
 */
public class ObserverMain {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.measurementsChanged(buildWeather(36.0f, 60.0f, 540.0f));
        weatherData.measurementsChanged(buildWeather(19.0f, 64.0f, 564.0f));
        weatherData.measurementsChanged(buildWeather(28.0f, 53.0f, 501.0f));
    }

    private static Weather buildWeather(float temperature, float humidity, float pressure) {
        Weather weather = new Weather();
        weather.setPressure(pressure);
        weather.setHumidity(humidity);
        weather.setTemperature(temperature);
        weather.calculateHeatIndex();
        return weather;
    }
}
