package com.oop.design_patterns.Facade;

public class HardDrive {
    public HardDrive() {
        System.out.println("HardDrive built");
    }

    public void readData() {
        System.out.println("Reading data from hard drive...");
    }

    public void end() {
        System.out.println("Ending hard drive...");
    }
}
