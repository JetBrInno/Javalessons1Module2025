package org.example.Lesson10;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {

        List<String> names = List.of("Яблоко", "Груша", "Банан");

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name.toUpperCase());
            }
        };

        Consumer<String> consumer2 = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name.toLowerCase());
            }
        };

        Consumer<String> consumer3 = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
                System.out.println("Я третий консюмер!!!");
            }
        };

        for (String name : names) {
            printInfo(name, consumer);
        }

        for (String name : names) {
            printInfo(name, consumer2);
        }

        for (String name : names) {
            printInfo(name, consumer3);
        }
    }

    private static void printInfo(String name, Consumer<String> consumer) {
        System.out.println("-----------");
        System.out.println("-Покупайте");
        //System.out.println(name.toUpperCase());
        consumer.accept(name);
        System.out.println("Все указанное есть в наличии");
    }
}
