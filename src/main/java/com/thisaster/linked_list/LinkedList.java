package com.thisaster.linked_list;

public class LinkedList {
    private LinkedListNode head = null;

    public void insert(int idx, Object data) {
        if (head == null) {
            head = new LinkedListNode(data, null);
        } else if (idx == 0) {
            head = new LinkedListNode(data, head);
        } else {
            var current = head;
            while (current.getNext() != null && idx > 1) {
                current = current.getNext();
                idx--;
            }
            current.setNext(new LinkedListNode(data, current.getNext()));
        }
    }

    public boolean contains(Object data) {
        var current = head;
        while (current != null) {
            if (current.getValue().equals(data)) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    public int length() {
        var len = 0;
        var current = head;
        while (current != null) {
            len++;
            current = current.getNext();
        }
        return len;
    }

    public boolean delete(int idx) {
        if (head == null) {
            return false;
        }
        else if (idx == 0 || head.getNext() == null) {
            head = head.getNext();
            return true;
        } else {
            var current = head;
            while (current.getNext() != null && idx > 1) {
                current = current.getNext();
                idx--;
            }
            if (current.getNext() != null) {
                current.setNext(current.getNext().getNext());
                return true;
            }
            return false;
        }
    }

    public void printAll() {
        LinkedListNode current = head;
        while (current != null) {
            System.out.print(current.getValue() + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Setup list for deletion tests
        list.insert(0, 1);
        list.insert(1, 2);
        list.insert(2, 3);
        list.insert(3, 4);
        list.insert(4, 5);
        System.out.println("Initial list:");
        list.printAll(); // Expected output: 1 -> 2 -> 3 -> 4 -> 5 -> null

        // Test case 1: Delete from beginning
        System.out.println("\nTest case 1: Delete from beginning (index 0)");
        list.delete(0);
        list.printAll(); // Expected output: 2 -> 3 -> 4 -> 5 -> null

        // Test case 2: Delete from middle
        System.out.println("\nTest case 2: Delete from middle (index 1)");
        list.delete(1);
        list.printAll(); // Expected output: 2 -> 4 -> 5 -> null

        // Test case 3: Delete from end
        System.out.println("\nTest case 3: Delete from end (last index)");
        list.delete(2);
        list.printAll(); // Expected output: 2 -> 4 -> null

        // Test case 4: Delete with index out of bounds (too large)
        System.out.println("\nTest case 4: Delete with index out of bounds");
        boolean result = list.delete(10);
        System.out.println("Result of delete operation: " + result); // Expected output: false
        list.printAll(); // Expected output: 2 -> 4 -> null

        // Test case 5: Delete the last remaining elements
        System.out.println("\nTest case 5: Delete remaining elements");
        list.delete(1);
        list.printAll(); // Expected output: 2 -> null
        list.delete(0);
        list.printAll(); // Expected output: null
    }
}
