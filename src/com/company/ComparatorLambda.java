package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Nilesh on 5/4/2016.
 */
public class ComparatorLambda {

    public static void main(String[] args){
        //V1 -> with anonymous class
//        Comparator<String> stringComparator = new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return Integer.compare(s1.length(), s2.length());
//            }
//        };

        //V2 -> with 1st version of Lambda
        //Comparator<String> stringComparator = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());

        //V3 -> with automatic referencing of data types for parameters
        Comparator<String> stringComparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());

        List<String> list = Arrays.asList("***", "*", "****", "**");

        //list.sort(stringComparator);

        // V4 -> most advanced lambda version with inlined expression instead of comparator
        list.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

        for(String s : list){
            System.out.println(s);
        }
    }
}
