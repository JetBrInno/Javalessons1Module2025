package org.example.Lesson10;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        List<String> names = List.of("Яблоко", "Груша", "Банан");

        Function<String, String> functionLength = new Function<String, String>() {
            @Override
            public String apply(String name) {
                System.out.println("Это хэшмэп, где хранятся длины строк");

                return String.valueOf(name.length());
            }
        };

        Function<String, String> functionUpper = new Function<String, String>() {
            @Override
            public String apply(String name) {

                System.out.println("Это хэшмэп, где хранятся значения в верхнем регистре");
                return name.toUpperCase();
            }
        };

        System.out.println(map(names, functionLength));
        System.out.println(map(names, functionUpper));
    }

    private static Map<String, String> map(List<String> names, Function<String, String> function) {
        Map<String, String> hashMap = new HashMap<>();

        for (String name: names) {

            hashMap.put(name, function.apply(name));
        }

        return hashMap;
    }


}
