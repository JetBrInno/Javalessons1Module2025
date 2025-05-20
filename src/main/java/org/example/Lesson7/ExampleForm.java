package org.example.Lesson7;

import java.util.ArrayList;
import java.util.List;

public class ExampleForm {
    public static void main(String[] args) {
        List<String> options = new ArrayList<>();
        options.add("Newspaper");
        options.add("Internet");
        options.add("Magazine");
        options.add("Other");

        int userAge = 25;

        if (userAge < 18) {
            options.remove("Newspaper");
        }

        System.out.println(options.contains("Newspaper"));

        // выведи на экран опции из массива options
    }
}
