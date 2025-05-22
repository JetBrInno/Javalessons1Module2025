package org.example.Lesson8;

import java.util.*;

public class Lesson8 {
    public static void main(String[] args) {
//        List<String> phones = new ArrayList<>();
//        phones.add("+1 234 635 43");
//        phones.add("+7 35325 525 53");
//        phones.add("+4535325 525 53");
//
//        System.out.println("Первый тест");
//        sendKeys(phones.get(0));
//
//        System.out.println("Второй тест");
//        sendKeys(phones.get(1));
//
//        System.out.println("Третий тест");
//        sendKeys(phones.get(2));


//        Map<String, String> phones = new HashMap<>();
//        phones.put("USA","1 234 635 43");
//        phones.put("RU", "+7 35325 525 53");
//        phones.put("DN", "+4535325 525 53");
//
//        System.out.println("Первый тест");
//        sendKeys(phones.get("USA"));
//
//        System.out.println("Второй тест");
//        sendKeys(phones.get("RU"));
//
//        System.out.println("Третий тест");
//        sendKeys(phones.get("DN"));

        String maintownCode = "12345";
        String lincolnCode = "3214215";

        Map<String, String> codes = new HashMap<>();
        codes.put(maintownCode,"Maintown");
        codes.put(lincolnCode, "Lincoln");

        sendKeys(maintownCode);
        assertThatTextIsEqual(codes.get(maintownCode));

        sendKeys(lincolnCode);
        assertThatTextIsEqual(codes.get(lincolnCode));

        Set<String> setCodes = new HashSet<>();
        setCodes.add("abc");
        setCodes.add("abc");
        setCodes.add("abc");
        System.out.println(setCodes);
        System.out.println(setCodes.contains("abc"));


//        Map<String, String> films = new HashMap<>();
//        films.put("The Shawshank Redemption", new Film("Побег из Шоушенка", 1991, 9.5));
//        films.put("Avengers", new Film("Мстители", 2010, 9.2));
//        films.put("Spider Man", new Film("Человек Паук", 2000, 9.0));
//
//        System.out.println(films["Avengers"]);



    }

    private static void sendKeys(String phone) {
        System.out.println("Вводим данные в форму " + phone);
    }

    private static void assertThatTextIsEqual(String phone) {
        System.out.println("Вводим данные в форму " + phone);
    }
}
