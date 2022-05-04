package org.weatherorama.display;

import org.weatherorama.model.Observer;

public class WeatherDisplayTwo implements Observer {
    @Override
    public void update() {
        System.out.println("Weather Display Two Updated");
    }

    @Override
    public String toString() {
        return "Weather Display Two";
    }
}
