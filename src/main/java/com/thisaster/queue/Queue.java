package com.thisaster.queue;

import java.util.LinkedList;
import java.util.List;

public class Queue<T> {
    List<T> items = new LinkedList<>();
    public void push(T item) {
        items.addLast(item);
    }

    public T pop() {
        return items.removeFirst();
    }

    public boolean isEmpty() {
        return items.getFirst() == null;
    }

}
