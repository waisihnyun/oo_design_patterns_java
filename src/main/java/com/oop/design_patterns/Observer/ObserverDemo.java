package com.oop.design_patterns.Observer;

public class ObserverDemo {
    public static void main(String[] args) {
        EventSource eventSource = new EventSource();

        Event event1 = new Event();
        Event event2 = new Event();
        eventSource.addObserver(event1);
        eventSource.addObserver(event2);

        eventSource.notifyObservers("Event occurred");
    }
}
