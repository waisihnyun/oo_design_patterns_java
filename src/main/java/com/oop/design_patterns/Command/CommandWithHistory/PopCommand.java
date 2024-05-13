package com.oop.design_patterns.Command.CommandWithHistory;

import java.util.Stack;

public class PopCommand implements Command {
    Stack<Integer> stack;
    Integer integer;

    public PopCommand (Stack<Integer> stack) {
        this.stack = stack;
    }

    @Override
    public void execute() {
        integer = stack.isEmpty() ? null : stack.pop();
    }

    @Override
    public void unexecute() {
        if (integer != null) {
            stack.push(integer);
        }
    }
}
