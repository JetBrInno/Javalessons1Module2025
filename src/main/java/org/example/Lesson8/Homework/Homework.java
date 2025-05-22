package org.example.Lesson8.Homework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Homework {
    public static void main(String[] args) {
        LocalDate publishDate = LocalDate.now().minusDays(1);
        LocalTime publishTime = LocalTime.now().minusHours(5);
        LocalDateTime timestamp = LocalDateTime.of(publishDate, publishTime);

        System.out.println(timestamp);
    }
}
