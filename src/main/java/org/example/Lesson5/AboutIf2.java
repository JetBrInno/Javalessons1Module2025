package org.example.Lesson5;

import java.util.Scanner;

public class AboutIf2 {

    public static void main(String[] args) {
        String url = new Scanner(System.in).nextLine();

        //System.out.println(url.equals("https://ya.ru"));
        //System.out.println(url.contains("https"));
        System.out.println(url.startsWith("https"));

        if (url.startsWith("https")) {
            System.out.println("Соединение защищено");
        } else {
            System.out.println("Соединение не защищено. Не рекомендуется заходить на страницу");
        }
    }
}
