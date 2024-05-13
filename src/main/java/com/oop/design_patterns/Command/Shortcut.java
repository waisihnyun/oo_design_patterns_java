package com.oop.design_patterns.Command;

// Invoker class
public class Shortcut {
    private Command command;

    public Shortcut(Command command) {
        this.command = command;
    }

    public void press() {
        this.command.execute();
    }
}
