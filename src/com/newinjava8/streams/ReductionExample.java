package com.newinjava8.streams;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Nilesh on 5/19/2016.
 */
public class ReductionExample {

    public static void main(String... args){
        List<Integer> list = Arrays.asList(10,100);

        Integer red = list.stream().reduce(0, Integer::max);

        System.out.println("red = " +red);
    }
}
