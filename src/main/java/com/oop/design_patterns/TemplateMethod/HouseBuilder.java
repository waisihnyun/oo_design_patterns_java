package com.oop.design_patterns.TemplateMethod;

abstract class HouseBuilder {
    final void buildHouse() {
        layFoundation();
        buildWalls();
        buildRoof();
        installDoors();
    }

    abstract void installDoors();

    abstract void buildRoof();

    abstract void buildWalls();

    abstract void layFoundation();
}
