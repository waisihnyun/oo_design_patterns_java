package com.oop.design_patterns.Command;

public class Client {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        // Create command objects and associate them with the receiver
        Command saveCommand = new SaveCommand(textEditor);
        Command printCommand = new PrintCommand(textEditor);
        Command openCommand = new OpenCommand(textEditor);
        Command closeCommand = new CloseCommand(textEditor);

        // Create sender objects (buttons and shortcuts)
        Button saveButton = new Button(saveCommand);
        Shortcut saveShortcut = new Shortcut(saveCommand);
        Button printButton = new Button(printCommand);
        Shortcut printShortcut = new Shortcut(printCommand);
        Button openButton = new Button(openCommand);
        Shortcut openShortcut = new Shortcut(openCommand);
        Button closeButton = new Button(closeCommand);
        Shortcut closeShortcut = new Shortcut(closeCommand);

        openButton.click();
        saveShortcut.press();
        printButton.click();
        closeShortcut.press();
    }
}
