package com.oop.design_patterns.Observer;

public class Event implements Observer{
    @Override
    public void update(String event) {
        System.out.println(event);
    }
}
