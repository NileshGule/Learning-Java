package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Nilesh on 5/4/2016.
 */
public class ComparatorLambda {

    public static void main(String[] args){
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };

        List<String> list = Arrays.asList("***", "*", "****", "**");

        list.sort(stringComparator);

        for(String s : list){
            System.out.println(s);
        }
    }
}
