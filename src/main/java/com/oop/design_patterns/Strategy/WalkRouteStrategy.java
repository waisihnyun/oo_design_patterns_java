package com.oop.design_patterns.Strategy;

public class WalkRouteStrategy implements RouteStrategy {
    @Override
    public void calculateRoute(String startPoint, String endPoint) {
        System.out.println("Calculating walk route from " + startPoint + " to " + endPoint);
    }
}
