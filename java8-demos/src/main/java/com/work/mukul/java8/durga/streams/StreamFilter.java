package com.work.mukul.java8.durga.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        List<Integer> result = list.stream().filter(i -> i % 2 ==0).collect(Collectors.toList());

        System.out.println(result);
    }
}
