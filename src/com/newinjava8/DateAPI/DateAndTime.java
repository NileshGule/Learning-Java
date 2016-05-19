package com.newinjava8.dateapi;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created by Nilesh on 5/19/2016.
 */
public class DateAndTime {
    public static void main(String... args){
        Instant firstInstant = Instant.now();

        Instant secondInstant = Instant.now();

        System.out.println(Duration.between(firstInstant, secondInstant ).toMillis());

        LocalDate currentDate = LocalDate.now();

        // currentDate = LocalDate.parse("20160519", new DateTimeFormatter.())

        System.out.println(currentDate);

        Date firstDate = new Date();

    }
}
