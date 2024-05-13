package com.oop.design_patterns.Strategy;

public class NavigationContext {
    private RouteStrategy routeStrategy;

    public NavigationContext (RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void calculateRoute(String startPoint, String endPoint) {
        this.routeStrategy.calculateRoute(startPoint, endPoint);
    }
}
