package org.example.Lesson5;

import java.util.Scanner;

public class AboutIfAndOr {

    public static void main(String[] args) {
        String login = new Scanner(System.in).nextLine();
        String password = new Scanner(System.in).nextLine();

        if (login.equals("superAdmin") && password.equals("pass123")) {
            System.out.println("Вы авторизованы");
        }
        else {
            System.out.println("Данные введены неверно");
        }
    }
}
