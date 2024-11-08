package com.thisaster.linked_list;

public class LinkedListNode {
    private Object value;
    private LinkedListNode next;
    public LinkedListNode(Object value, LinkedListNode next) {
        this.value = value;
        this.next = next;
    }
    public Object getValue() {
        return value;
    }
    public void setValue(Object value) {
        this.value = value;
    }
    public LinkedListNode getNext() {
        return next;
    }
    public void setNext(LinkedListNode next) {
        this.next = next;
    }

    public void printAll() {
        LinkedListNode current = this;
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        var head = new LinkedListNode(1, new LinkedListNode(2,
                new LinkedListNode(3, null)));
        head.printAll();
    }
}
