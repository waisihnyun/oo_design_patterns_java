package com.oop.design_patterns.Command;

public class OpenCommand implements Command {
    private TextEditor textEditor;

    public OpenCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        this.textEditor.open();
    }
}
