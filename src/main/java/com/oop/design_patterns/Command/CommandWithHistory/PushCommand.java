package com.oop.design_patterns.Command.CommandWithHistory;

import java.util.Stack;

public class PushCommand implements Command {
    Stack<Integer> stack;
    Integer integer;

    public PushCommand(Stack<Integer> stack, Integer integer) {
        this.stack = stack;
        this.integer = integer;
    }

    @Override
    public void execute() {
        stack.push(integer);
    }

    @Override
    public void unexecute() {
        stack.pop();
    }
}
