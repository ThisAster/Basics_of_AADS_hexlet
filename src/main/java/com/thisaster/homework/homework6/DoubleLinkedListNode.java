package com.thisaster.homework.homework6;

public final class DoubleLinkedListNode {

    public Object value;
    public DoubleLinkedListNode next = null;
    public DoubleLinkedListNode previous = null;

    public DoubleLinkedListNode(Object value, DoubleLinkedListNode next, DoubleLinkedListNode previous) {
        this.value = value;
        this.next = next;
        this.previous = previous;
    }

    public DoubleLinkedListNode(Object value, DoubleLinkedListNode next) {
        this.value = value;
        this.next = next;
    }

    public DoubleLinkedListNode(Object value) {
        this.value = value;
    }
}
