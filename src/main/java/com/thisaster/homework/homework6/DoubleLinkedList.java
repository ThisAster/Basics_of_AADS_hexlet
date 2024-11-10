package com.thisaster.homework.homework6;

import java.util.List;
import java.util.ArrayList;

public final class DoubleLinkedList {

    public DoubleLinkedListNode head = null;
    public DoubleLinkedListNode tail = null;


    public DoubleLinkedList prepend(Object value) {

        DoubleLinkedListNode newNode = new DoubleLinkedListNode(value, head);

        if (head != null) {
            head.previous = newNode;
        }

        head = newNode;

        if (tail == null) {
            tail = newNode;
        }

        return this;
    }

    public DoubleLinkedList append(Object value) {

        DoubleLinkedListNode newNode = new DoubleLinkedListNode(value);

        if (head == null) {
            head = newNode;
            tail = newNode;

            return this;
        }

        tail.next = newNode;
        newNode.previous = tail;
        tail = newNode;

        return this;
    }

    public DoubleLinkedListNode delete(Object value) {

        if (head == null) {
            return null;
        }

        DoubleLinkedListNode deletedNode = null;
        DoubleLinkedListNode currentNode = head;

        while (currentNode != null) {
            if (currentNode.value.equals(value)) {
                deletedNode = currentNode;

                if (deletedNode == head) {
                    head = deletedNode.next;

                    if (head != null) {
                        head.previous = null;
                    }

                    if (deletedNode == tail) {
                        tail = null;
                    }

                } else if (deletedNode == tail) {
                    tail = deletedNode.previous;
                    tail.next = null;

                } else {
                    DoubleLinkedListNode previousNode = deletedNode.previous;
                    DoubleLinkedListNode nextNode = deletedNode.next;

                    previousNode.next = nextNode;
                    nextNode.previous = previousNode;
                }
            }

            currentNode = currentNode.next;
        }

        return deletedNode;
    }

    public DoubleLinkedListNode find(Object value) {
        if (head == null) {
            return null;
        }

        DoubleLinkedListNode currentNode = head;

        while (currentNode != null) {
            if (value != null && currentNode.value.equals(value)) {
                return currentNode;
            }

            currentNode = currentNode.next;
        }

        return null;
    }

    public List<Object> toList() {

        List<Object> result = new ArrayList<>();

        if (head == null) {
            return result;
        }

        DoubleLinkedListNode currentNode = head;

        while (currentNode != null) {
            if (currentNode.value != null) {
                result.add(currentNode.value);
            }

            currentNode = currentNode.next;
        }

        return result;
    }
}