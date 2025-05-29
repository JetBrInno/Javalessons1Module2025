package org.example.Lesson10;

import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {

        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return 0;
            }
        };
        // возвращает положительное целое число, если первый объект больше второго
        // возвращает отрицательное целое число, если первый объект меньше второго
        // возвращает 0 если объекты равны
    }
}
