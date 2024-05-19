package com.test.pract;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class RemoveDuplicatesAndSort {
    public static void main(String[] args) {
        String input = "example";
        String result = removeDuplicatesAndSort(input);
        System.out.println(result); // Output: aelmpx
    }

    public static String removeDuplicatesAndSort(String input) {
        // Use LinkedHashSet to remove duplicates while maintaining insertion order
        LinkedHashSet<Character> charSet = new LinkedHashSet<>();
        for (char c : input.toCharArray()) {
            charSet.add(c);
        }
        
        // Convert LinkedHashSet to ArrayList for sorting
        ArrayList<Character> charList = new ArrayList<>(charSet);
        Collections.sort(charList);
        
        // Build the final string from the sorted list
        StringBuilder sortedString = new StringBuilder(charList.size());
        for (char c : charList) {
            sortedString.append(c);
        }
        
        return sortedString.toString();
    }
}
