package com.oop.design_patterns.Facade;

public class ComputerDemo {
    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade();
        computerFacade.startComputer();
        computerFacade.endComputer();
    }
}
