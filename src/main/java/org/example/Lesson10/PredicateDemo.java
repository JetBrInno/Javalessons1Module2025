package org.example.Lesson10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateDemo {

    public static void main(String[] args) {
        Item item1 = new Item("Яблоко", 100.25, 8.5);
        Item item2 = new Item("Груша", 233.25, 9.5);
        Item item3 = new Item("Банан", 421, 4.5);

        List<Item> items = List.of(item1, item2, item3);

        Predicate<Item> predicatePriceUp = new Predicate<Item>() {
            @Override
            public boolean test(Item item) {
                return item.getPrice() > 200;
            }
        };

        Predicate<Item> predicateRateDown = new Predicate<Item>() {
            @Override
            public boolean test(Item item) {
                return item.getRating() < 8;
            }
        };

        System.out.println(filter(items, predicatePriceUp));
        System.out.println(filter(items, predicateRateDown));
    }

    public static List<Item> filter(List<Item> allItems, Predicate<Item> predicate) {
        List<Item> filtered = new ArrayList<>();
        for (Item item: allItems) {
            if (predicate.test(item)) {
                filtered.add(item);
            }
        }
        return filtered;
    }
}
