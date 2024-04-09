package com.oop.design_patterns.Facade;

public class Memory {
    public Memory() {
        System.out.println("Memory built");
    }

    public void loadMemory() {
        System.out.println("Loading memory...");
    }

    public void end() {
        System.out.println("Ending memory...");
    }
}
