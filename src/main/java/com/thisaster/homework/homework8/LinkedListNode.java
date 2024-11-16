package com.thisaster.homework.homework8;

public class LinkedListNode {

    public Object value;
    public LinkedListNode next = null;

    LinkedListNode(Object value, LinkedListNode next) {
        this.value = value;
        this.next = next;
    }

    LinkedListNode(Object value) {
        this.value = value;
    }
}

