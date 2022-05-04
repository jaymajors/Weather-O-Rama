package org.weatherorama.model;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observers;

    public WeatherData() {
        System.out.println("Creating Weather Data");
        this.observers = new ArrayList<Observer>();
    }

    public int getTemperature() {
        return 0;
    }

    public int getHumidity() {
        return 0;
    }

    public int getPressure() {
        return 0;
    }

    public void measurementChanged() {
        System.out.println("Measurement Changed");
        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        System.out.println("Adding " + observer);
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        System.out.println("Removing " + observer);
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
