package org.weatherorama.display;

import org.weatherorama.model.Observer;

public class WeatherDisplay implements Observer {
    @Override
    public void update() {
        System.out.println("Display updated");
    }

    @Override
    public String toString() {
        return "WeatherDisplay";
    }
}
