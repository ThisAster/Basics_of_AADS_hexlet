package com.thisaster.stack;

import java.util.LinkedList;
import java.util.List;

public class StackThroughLinkedList<T> {
    List<T> stack = new LinkedList<>();
    public void push(T value) {
        stack.add(value);
    }
    public T pop() {
        return stack.removeFirst();
    }
    public boolean isEmpty() {
        return stack.getFirst() == null;
    }
}
