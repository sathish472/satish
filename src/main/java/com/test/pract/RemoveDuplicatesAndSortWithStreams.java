package com.test.pract;

import java.util.stream.Collectors;

public class RemoveDuplicatesAndSortWithStreams {
    public static void main(String[] args) {
        String input = "example";
        String result = removeDuplicatesAndSort(input);
        System.out.println(result); // Output: aelmpx
        
        Integer i=(int) 'c';
        
        int c='c';
        
        Integer i2=c;
    }

    public static String removeDuplicatesAndSort(String input) {
        return input.chars()
                    .distinct()
                    .sorted()
                    .mapToObj(c -> String.valueOf((char) c))
                    .max
                    .collect(Collectors.joining());
        
    }
}