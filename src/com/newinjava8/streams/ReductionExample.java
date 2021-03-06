package com.newinjava8.streams;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {

    public static void main(String... args) {
        List<Integer> list = Arrays.asList(10, 100);

        Integer red = list.stream().reduce(0, Integer::max);

        System.out.println("red = " + red);
    }
}
