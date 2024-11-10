package com.thisaster.homework.homework6;

public class Solution {
    public static DoubleLinkedList swap(DoubleLinkedList collection) {
        if (collection.head == null && collection.tail == null) {
            return collection;
        }
        DoubleLinkedListNode newHeadNode = new DoubleLinkedListNode(collection.head.next.value, collection.head.next.previous);
        DoubleLinkedListNode headNextNode = new DoubleLinkedListNode(collection.head.value, collection.head.next.next);
        collection.head = newHeadNode;
        collection.head.next = headNextNode;
        return collection;
    }

    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        System.out.println(list.toList()); // [1, 2, 3, 4]

        DoubleLinkedList swapped = Solution.swap(list);

        System.out.println(swapped.toList()); // [2, 1, 3, 4]
    }

}
