package com.thisaster.double_linked_list;

public class DoublyLinkedList {
    // address on start list
    DoublyLinkedListNode head = null;
    // address on end list
    DoublyLinkedListNode tail = null;

    public void insertBegin(Object value) {
        if (head == null) {
            var node = new DoublyLinkedListNode(value, null, null);
            head = node;
            tail = node;
        } else {
            var node = new DoublyLinkedListNode(value, null, head);
            head.prev = node;
            head = node;
        }
    }

    public void insertEnd(Object value) {
        if (head == null) {
            var node = new DoublyLinkedListNode(value, null, null);
            head = node;
            tail = node;
        } else {
            var node = new DoublyLinkedListNode(value, tail, null);
            tail.next = node;
            tail = node;
        }
    }

    public boolean removeBegin() {
        if (head == null) {
            return false;
        } else if (head == tail) {
            head = null;
            tail = null;
            return true;
        } else {
            head = head.next;
            head.prev = null;
            return true;
        }
    }

    public boolean removeEnd() {
        if (head == null) {
            return false;
        } else if (head == tail) {
            head = null;
            tail = null;
            return true;
        } else {
            tail = tail.prev;
            tail.next = null;
            return true;
        }
    }
}
