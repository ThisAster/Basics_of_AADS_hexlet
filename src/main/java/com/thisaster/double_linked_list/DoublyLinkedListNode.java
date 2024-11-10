package com.thisaster.double_linked_list;

public class DoublyLinkedListNode {
    Object value;
    DoublyLinkedListNode next;
    DoublyLinkedListNode prev;
    public DoublyLinkedListNode(Object value, DoublyLinkedListNode prev, DoublyLinkedListNode next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }
}
