package com.oop.design_patterns.TemplateMethod;

public class BrickHouseBuilder extends HouseBuilder{
    @Override
    void installDoors() {
        System.out.println("Installing brick doors");
    }

    @Override
    void buildRoof() {
        System.out.println("Building brick roof");
    }

    @Override
    void buildWalls() {
        System.out.println("Building brick walls");
    }

    @Override
    void layFoundation() {
        System.out.println("Laying brick foundation");
    }
}
