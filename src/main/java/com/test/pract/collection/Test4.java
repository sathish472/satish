package com.test.pract.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test4 {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);


       List<Integer> newList=list.stream()
                .sorted((i1,i2)-> i2-i1).collect(Collectors.toList());

        System.out.println("\n "+newList.toString());

    }
}
