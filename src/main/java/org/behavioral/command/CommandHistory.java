package org.behavioral.command;

import java.util.Stack;

public class CommandHistory {
    private final Stack<Command> history = new Stack<>();

    public void push(Command command) {
        history.push(command);
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }

    public Command pop() {
        return history.pop();
    }
}
