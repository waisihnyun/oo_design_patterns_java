package com.oop.design_patterns.Strategy;

public class BusRouteStrategy implements RouteStrategy {
    @Override
    public void calculateRoute(String startPoint, String endPoint) {
        System.out.println("Calculating bus route from " + startPoint + " to " + endPoint);
    }
}
