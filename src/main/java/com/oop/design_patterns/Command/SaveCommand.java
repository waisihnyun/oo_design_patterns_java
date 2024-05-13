package com.oop.design_patterns.Command;

public class SaveCommand implements Command {
    private TextEditor textEditor;

    public SaveCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        this.textEditor.save();
    }
}
