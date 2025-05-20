package org.example.Lesson7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AboutHashMap {
    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("Россия", "Москва");
        capitals.put("Россия", "Москва");
        capitals.put("Россия", "Москва");
        capitals.put("Россия", "Москва");
        capitals.put("Россия", "Москва");
        capitals.put("Россия", "Москва");
        capitals.put("Россия", "Москва");
        capitals.put("Россия", "Москва");
        capitals.put("Россия", "Москва");

        capitals.put("Армения", "Ереван");
        capitals.put("США", "Вашингтон");
        System.out.println(capitals);


        Map<String, Double> currencies = new HashMap<>();
        currencies.put("AUD", 51.5253);
        currencies.put("AZN", 47.2397);
        System.out.println(currencies.get("AZN"));


//        List<String> capitals = new ArrayList<>();
//        capitals.add("Москва");
//        capitals.add("Ереван");
//        capitals.add("Вашингтон");
//
//        System.out.println(capitals.get(0));
    }
}
