package com.oop.design_patterns.Command;

// Receiver
public class TextEditor {
    public void save() {
        System.out.println("Saving the document...");
    }

    public void print() {
        System.out.println("Printing the document...");
    }

    public void open() {
        System.out.println("Opening the document...");
    }

    public void close() {
        System.out.println("Closing the document...");
    }
}
