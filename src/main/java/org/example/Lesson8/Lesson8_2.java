package org.example.Lesson8;

import org.example.Lesson7.User;

import java.lang.Math;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Lesson8_2 {
    public static void main(String[] args) {

        // LocalDate
        /////////////////////////
        LocalDate dateNow = LocalDate.now();
        System.out.println(dateNow);

        LocalDate date = LocalDate.of(2020, 12, 1);
        System.out.println(date);

        LocalDate dateParsed = LocalDate.parse("2023-12-05");
        System.out.println(dateParsed);

        dateParsed = dateParsed.plusDays(40);
        System.out.println(dateParsed);

        dateParsed = dateParsed.minusDays(5);
        System.out.println(dateParsed);

        System.out.println(dateParsed.getDayOfWeek());

        // LocalTime
        /////////////////////////
        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime timeParsed = LocalTime.parse("22:23:56");
        System.out.println(timeParsed);

        timeParsed = timeParsed.minusSeconds(5);
        System.out.println(timeParsed);

        // LocalDateTime
        /////////////////////////
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime dateTimeOf = LocalDateTime.of(2020, 12, 1, 1, 1);
        System.out.println(dateTimeOf);

        LocalDateTime dateTimeParsed = LocalDateTime.of(dateParsed, timeParsed);
        System.out.println(dateTimeParsed);

        // Formatter
        //////////////////
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yy");
        String dateString = formatter.format(dateTimeParsed);
        System.out.println(dateString);
    }
}
