package com.thisaster.homework.homework8;

public class Hash {

    public LinkedList[] table = new LinkedList[128];
    public int count = 0;

    private int hash(String s) {
        var k = 65537;
        var m = (int) Math.pow(2, 20);

        var result = 0;
        var k_i = 1;

        for (var i = 0; i < s.length(); i++) {
            result = (result + k_i * s.charAt(i)) % m;
            k_i = (k_i * k) % m;
        }

        return result;
    }

    public int calculateIndex(LinkedList[] table, String key) {
        return hash(key) % table.length;
    }

    private void rubuildTableIfNeed() {
        var loadFactor = (double) count / table.length;
        if (loadFactor >= 0.8) {
            LinkedList[] newTable = new LinkedList[table.length * 2];
            for (LinkedList list : table) {
                for (var pair : list) {
                    Object[] casted = (Object[]) pair;
                    var newIndex = calculateIndex(newTable, (String) casted[0]);
                    if (newTable[newIndex] == null) {
                        newTable[newIndex] = new LinkedList();
                    }

                    newTable[newIndex].append(pair);
                }
            }

            table = newTable;
        }
    }

    public void set(String key, Object value) {
        this.rubuildTableIfNeed();
        var index = calculateIndex(table, key);

        if (table[index] == null) {
            table[index] = new LinkedList();
        }

        table[index].append(new Object[] {key, value});
        count++;
    }

    public Object get(String key) {
        var index = calculateIndex(table, key);
        if (table[index] == null) {
            return null;
        }

        for (var current : table[index]) {
            LinkedListNode node = (LinkedListNode) current;
            var pair = node.value;
            var casted = (Object[]) pair;
            if (casted[0].equals(key)) {
                return casted[1];
            }
        }

        return null;
    }
}