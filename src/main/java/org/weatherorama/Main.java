package org.weatherorama;

import org.weatherorama.display.WeatherDisplay;
import org.weatherorama.display.WeatherDisplayTwo;
import org.weatherorama.model.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherDisplay wd = new WeatherDisplay();
        WeatherDisplayTwo wd2 = new WeatherDisplayTwo();

        WeatherData weatherData = new WeatherData();
        weatherData.addObserver(wd);
        weatherData.addObserver(wd2);

        weatherData.measurementChanged();

        weatherData.removeObserver(wd2);

        weatherData.measurementChanged();

    }
}