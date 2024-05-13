package com.oop.design_patterns.Strategy;

public class Application {
    public static void main(String[] args) {
        RouteStrategy carRouteStrategy = new CarRouteStrategy();
        NavigationContext navigationContext = new NavigationContext(carRouteStrategy);

        navigationContext.calculateRoute("Start Point", "End Point");

        RouteStrategy busRouteStrategy = new BusRouteStrategy();
        navigationContext.setRouteStrategy(busRouteStrategy);
        navigationContext.calculateRoute("Start Point", "End Point");

        RouteStrategy walkRouteStrategy = new WalkRouteStrategy();
        navigationContext.setRouteStrategy(walkRouteStrategy);
        navigationContext.calculateRoute("Start Point", "End Point");
    }
}