package com.thisaster.homework.homework5;

// reverse LinkedList
public class Solution {

    public static LinkedList reverse(LinkedList list) {
        if (list.head == null) {
            return new LinkedList();
        }
        Object headValue = list.head.value;
        Object tailValue = list.tail.value;
        LinkedList newList = new LinkedList();
        while (tailValue != headValue) {
            Object lastElem = list.tail.value;
            tailValue = list.tail.value;
            newList.append(lastElem);
            list.delete(tailValue);
        }
        return newList;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);

        LinkedList reversed = Solution.reverse(list);
        System.out.println(reversed.toList());
    }
}
