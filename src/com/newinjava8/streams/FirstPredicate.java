package com.newinjava8.streams;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstPredicate {

    public static void main(String... args) {
        Stream<String> stream = Stream.of("one", "two", "three", "four");

        Predicate<String> p1 = s -> s.length() > 3;

        Predicate<String> p2 = Predicate.isEqual("two");
        Predicate<String> p3 = Predicate.isEqual("three");

        //stream.filter(p2.or(p3))
        stream.filter(p1.or(p2).or(p3))
                .forEach(System.out::println);
    }
}
