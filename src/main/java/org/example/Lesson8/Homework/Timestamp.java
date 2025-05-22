package org.example.Lesson8.Homework;

import java.time.LocalDateTime;

public class Timestamp implements HumanReadableTimestamp {
    @Override
    public String getTimestamp(LocalDateTime eventTimestamp) {

        return "опубликовано 10 дней назад";
    }
}
