package com.thisaster.homework.homework5;

// reverse LinkedList
public class Solution {

    public static LinkedList reverse(LinkedList list) {
        if (list.head == null) {
            return list;
        }
        LinkedList newList = new LinkedList();
        while (list.head != null) {
            newList.append(list.tail.value);
            list.delete(list.tail.value);
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
