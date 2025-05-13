package org.example.Lesson5;

import java.util.Scanner;

public class AboutIf {

    public static void main(String[] args) {
        int age = new Scanner(System.in).nextInt();

        if (age < 12) {
            System.out.println("Вы слишком молоды, чтобы регистрироваться на нашем сайте, приходите позже");
        }
        else {
            System.out.println("Вы успешно зарегистрировались на нашем сайте");
        }
    }
}
