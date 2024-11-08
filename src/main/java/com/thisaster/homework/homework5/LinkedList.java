package com.thisaster.homework.homework5;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {

    public LinkedListNode head = null;
    public LinkedListNode tail = null;

    public LinkedList prepend(Object value) {
        LinkedListNode newNode = new LinkedListNode(value, head);
        head = newNode;

        if (tail == null) {
            tail = newNode;
        }

        return this;
    }

    public LinkedList append(Object value) {
        LinkedListNode newNode = new LinkedListNode(value);

        if (head == null) {
            head = newNode;
            tail = newNode;

            return this;
        }

        tail.next = newNode;
        tail = newNode;

        return this;
    }

    public LinkedListNode delete(Object value) {

        if (head == null) {
            return null;
        }

        LinkedListNode deletedNode = null;

        while (head != null && head.value == value) {
            deletedNode = head;
            head = head.next;
        }

        LinkedListNode currentNode = head;

        if (currentNode != null) {
            while (currentNode.next != null) {
                if (currentNode.next.value == value) {
                    deletedNode = currentNode.next;
                    currentNode.next = currentNode.next.next;
                } else {
                    currentNode = currentNode.next;
                }
            }
        }

        if (tail.value == value) {
            tail = currentNode;
        }

        return deletedNode;
    }

    public LinkedListNode find(Object value)
    {
        if (head == null) {
            return null;
        }

        LinkedListNode currentNode = head;

        while (currentNode != null) {
            if (value != null && currentNode.value == value) {
                return currentNode;
            }

            currentNode = currentNode.next;
        }

        return null;
    }

    public boolean isEmpty()
    {
        return head == null && tail == null;
    }

    public List<Object> toList()
    {
        List<Object> result = new ArrayList<>();

        if (head == null) {
            return result;
        }

        LinkedListNode currentNode = head;

        while (currentNode != null) {
            if (currentNode.value != null) {
                result.add(currentNode.value);
            }

            currentNode = currentNode.next;
        }

        return result;
    }
}
