package com.oop.design_patterns.Facade;

public class CPU {
    public CPU() {
        System.out.println("CPU built");
    }

    public void processData() {
        System.out.println("Processing data...");
    }

    public void end() {
        System.out.println("Ending CPU...");
    }
}
