package com.oop.design_patterns.Command;

// Invoker class
public class Button {
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void click() {
        command.execute();
    }
}