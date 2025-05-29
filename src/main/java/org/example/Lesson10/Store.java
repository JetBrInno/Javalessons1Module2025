package org.example.Lesson10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Store {

    public static void main(String[] args) {
        Item item1 = new Item("Груша", 233.25, 9.5);
        Item item2 = new Item("Яблоко", 100.25, 8.5);
        Item item3 = new Item("Банан", 421, 4.5);

        List<Item> items = new ArrayList<>(List.of(item1, item2, item3));
        System.out.println(items);

        // вывести товары отсортированными по названию / цене / рейтингу

        Comparator<Item> comparatorPrice = new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        };

        Comparator<Item> comparatorRating = new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return (int) (o1.getRating() - o2.getRating());
            }
        };


        items.sort(comparatorPrice);
        System.out.println(items);

        items.sort(comparatorRating);
        System.out.println(items);
    }
}
