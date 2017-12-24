package behavioralDesignPatterns.observer.impl;

import java.util.Objects;

/**
 * Weather.
 * Date: 07/16/2017
 *
 * @author Mikalai Bezmen
 */
public class Weather {

    private float temperature;
    private float humidity;
    private float pressure;
    private float heatIndex;

    public void calculateHeatIndex() {
        heatIndex = temperature * humidity / pressure;
    }

    public float getHeatIndex() {
        return heatIndex;
    }

    public void setHeatIndex(float heatIndex) {
        this.heatIndex = heatIndex;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Weather)) return false;
        Weather weather = (Weather) o;
        return Float.compare(weather.temperature, temperature) == 0 &&
                Float.compare(weather.humidity, humidity) == 0 &&
                Float.compare(weather.pressure, pressure) == 0 &&
                Float.compare(weather.heatIndex, heatIndex) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(temperature, humidity, pressure, heatIndex);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Weather{");
        sb.append("temperature=").append(temperature);
        sb.append(", humidity=").append(humidity);
        sb.append(", pressure=").append(pressure);
        sb.append(", heatIndex=").append(heatIndex);
        sb.append('}');
        return sb.toString();
    }
}
