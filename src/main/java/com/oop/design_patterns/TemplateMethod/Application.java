package com.oop.design_patterns.TemplateMethod;

public class Application {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new WoodenHouseBuilder();
        houseBuilder.buildHouse();
    }
}
