package com.work.mukul.java8.durga.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

//        Comparator<Integer> comparator = (a, b) -> - a.compareTo(b);

        System.out.println (
                list
                .stream()
                .map( i ->  i * i)
                .filter(i -> i % 2 == 0)
                .sorted((a, b) -> - a.compareTo(b))
                .collect(Collectors.toList())
        );
    }
}
