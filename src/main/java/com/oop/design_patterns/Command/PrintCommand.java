package com.oop.design_patterns.Command;

public class PrintCommand implements Command {
    private TextEditor textEditor;

    public PrintCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        this.textEditor.print();
    }
}
