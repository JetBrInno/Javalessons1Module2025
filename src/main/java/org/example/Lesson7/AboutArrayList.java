package org.example.Lesson7;

import org.example.Lesson6.EmailNotifier;
import org.example.Lesson6.Notifier;

import java.util.ArrayList;
import java.util.List;

public class AboutArrayList {

    public static void main(String[] args) {
        List<String> users = new ArrayList<>();
        users.add("Joe");
        users.add("Alex");
        users.add(0,"Michael");

       // System.out.println(users.get(0));

        users.remove("Joe");
        users.remove(0);

        for (String u : users) {
            System.out.println(u.length());
        }

        System.out.println("Длина: " + users.size());

//        Notifier notifier = new EmailNotifier();
    }
}
