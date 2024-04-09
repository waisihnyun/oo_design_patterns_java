package com.oop.design_patterns.Facade;

public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private HardDrive hardDrive;

    public ComputerFacade() {
        cpu = new CPU();
        memory = new Memory();
        hardDrive = new HardDrive();
    }

    public void startComputer() {
        cpu.processData();
        memory.loadMemory();
        hardDrive.readData();
        System.out.println("Computer started successfully");
    }

    public void endComputer() {
        hardDrive.end();
        memory.end();
        cpu.end();
        System.out.println("Computer ended successfully");
    }
}
