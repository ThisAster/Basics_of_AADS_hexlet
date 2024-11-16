package com.thisaster.homework.homework8;

public class Solution {
    public static Object remove(Hash hash, String key) {
        var index = hash.calculateIndex(hash.table, key);
        if (hash.table[index] == null) {
            return null;
        }

        for (var current : hash.table[index]) {
            LinkedListNode node = (LinkedListNode) current;
            var pair = node.value;
            var casted = (Object[]) pair;
            if (casted[0].equals(key)) {
                var removeElem =  casted[1];
                casted[1] = null;
                casted[0] = null;
                return removeElem;
            }
        }
        return null;
    }
}
