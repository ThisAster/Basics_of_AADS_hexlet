package com.thisaster.stack;

import java.util.ArrayList;
import java.util.List;

public class StackThroughArray<T> {
    List<T> items = new ArrayList<>();

    public void push(T item) {
        items.add(item);
    }

    public T pop() {
        int lastIdx = items.size() - 1;
        T item = items.get(lastIdx);
        items.remove(lastIdx);
        return item;
    }
    public boolean isEmpty() {
        return items.isEmpty();
    }
}
