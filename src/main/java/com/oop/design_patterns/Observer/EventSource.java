package com.oop.design_patterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class EventSource {
    private final List<Observer> observers = new ArrayList<>();

    public void notifyObservers(String event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }
}
