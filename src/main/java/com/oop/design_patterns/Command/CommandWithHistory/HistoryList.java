package com.oop.design_patterns.Command.CommandWithHistory;

import java.util.ArrayList;
import java.util.List;

public class HistoryList {
    public List<Command> commandList = new ArrayList<>();
    public List<Command> undoList = new ArrayList<>();

    public void undo() {
        if (!commandList.isEmpty()) {
            Command commandObj = commandList.remove(commandList.size() - 1);
            commandObj.unexecute();
            undoList.add(commandObj);
        }
    }

    public void redo() {
        if (!undoList.isEmpty()) {
            Command commandObj = undoList.remove(undoList.size() - 1);
            commandObj.execute();
            commandList.add(commandObj);
        }
    }

    public void addCommand(Command commandObj) {
        commandList.add(commandObj);
    }
}
