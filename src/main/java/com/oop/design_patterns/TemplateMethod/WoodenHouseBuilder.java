package com.oop.design_patterns.TemplateMethod;

public class WoodenHouseBuilder extends HouseBuilder{
    @Override
    void installDoors() {
        System.out.println("Installing wooden doors");
    }

    @Override
    void buildRoof() {
        System.out.println("Building wooden roof");
    }

    @Override
    void buildWalls() {
        System.out.println("Building wooden walls");
    }

    @Override
    void layFoundation() {
        System.out.println("Laying wooden foundation");
    }
}
