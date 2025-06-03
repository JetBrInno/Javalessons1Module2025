package org.example.Lesson11;

import java.util.function.Function;

public class LambdaDemo {
    public static void main(String[] args) {

//        Function<Integer, Integer> changeNumber = new Function<Integer, Integer>() {
//            public Integer apply(Integer number) {
//            System.out.println("Какая-то функция");
//                return number * (100 + 150) / 2;
//            }
//        };

        //                                           что на входе -> выражение
        // Function<Integer, Integer> changeNumber = number -> number * (100 + 150) / 2;

        Function<Integer, Integer> changeNumber = (number) -> {
            System.out.println("Какая-то функция");
            return number * (100 + 150) / 2;
        };

        System.out.println(changeNumber.apply(100));
    }
}
