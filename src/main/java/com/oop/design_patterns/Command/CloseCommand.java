package com.oop.design_patterns.Command;

public class CloseCommand implements Command {
    private TextEditor textEditor;

    public CloseCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        this.textEditor.close();
    }
}
