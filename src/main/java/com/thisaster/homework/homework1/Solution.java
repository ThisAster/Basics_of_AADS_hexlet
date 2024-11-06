package com.thisaster.homework.homework1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// binary search
public class Solution {

    public static String run(List<Map<String, String>> collection, String name) {
        if (collection.isEmpty()) return "Phonebook is empty!";

        var first = 0;
        var last = collection.size() - 1;
        while (first <= last) {
            var mid = first + (last - first) / 2;
            if (name.equals(collection.get(mid).get("name"))) {
                return collection.get(mid).get("number");
            }
            if (name.compareTo(collection.get(mid).get("name")) < 0) {
                last = mid - 1;
            }
            else {
                first = mid + 1;
            }
        }
        return "Name not found!";
    }


    public static void main(String[] args) {
        List<Map<String, String>> phonebook = new ArrayList<>();

        System.out.println(Solution.run(phonebook, "Alex Bowman"));

        phonebook.add(Map.of("name", "Alex Bowman", "number", "48-2002"));
        phonebook.add(Map.of("name", "Aric Almirola", "number", "10-1001"));
        phonebook.add(Map.of("name", "Bubba Wallace", "number", "423-1111"));

        System.out.println(Solution.run(phonebook, "Alex Bowman"));
        System.out.println(Solution.run(phonebook, "none"));
    }
}
