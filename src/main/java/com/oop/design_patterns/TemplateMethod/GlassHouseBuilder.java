package com.oop.design_patterns.TemplateMethod;

public class GlassHouseBuilder extends HouseBuilder{
    @Override
    void installDoors() {
        System.out.println("Installing glass doors");
    }

    @Override
    void buildRoof() {
        System.out.println("Building glass roof");
    }

    @Override
    void buildWalls() {
        System.out.println("Building glass walls");
    }

    @Override
    void layFoundation() {
        System.out.println("Laying glass foundation");
    }
}
