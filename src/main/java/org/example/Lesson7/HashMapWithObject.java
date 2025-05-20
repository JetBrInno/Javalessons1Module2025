package org.example.Lesson7;

import java.util.HashMap;
import java.util.Map;

public class HashMapWithObject {
    public static void main(String[] args) {
//        Map<String, String> capitals = new HashMap<>();
//        capitals.put("Россия", "Москва");
//        capitals.put("Армения", "Ереван");
//        capitals.put("США", "Вашингтон");
//
//        System.out.println("Привет".hashCode());
//        System.out.println("Привет".hashCode());
//        System.out.println("Привет".hashCode());
//        System.out.println("Привет".hashCode());
//        System.out.println("Привет".hashCode());

        Map<User, Double> rates = new HashMap<>();

        User user1 = new User("Михаил","Немишкин", 20, "+795430534534", 1432.532);
        User user2 = new User("Михаил","Немишкин", 20, "+795430534534", 1432.532);
        User user3 = new User("Михаил","Немишкин", 20, "+795430534534", 1432.532);


        rates.put(user1, 10.0);
        rates.put(user2, 8.2);
        rates.put(user3, 9.5);
        System.out.println(rates);
//        System.out.println(user1.equals(user2));
    }

}
