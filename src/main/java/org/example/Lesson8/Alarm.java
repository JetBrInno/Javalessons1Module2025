package org.example.Lesson8;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Alarm {

    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < 5; i++) {
            System.out.println("Во сколько вас разбудить?");
            String input = new Scanner(System.in).nextLine();  // 22:23

            Thread.sleep(1000);
            try {
                LocalTime alarm = LocalTime.parse(input);

                LocalTime now = LocalTime.now(); //22:23:01

                if (now.isAfter(alarm)) {
                    System.out.println("Будим");
                }
                else {
                    System.out.println("Не будим");
                }
            }
            catch (DateTimeParseException exception) {
                System.out.println("422");
                System.out.println("Unprocessable Entity");
            }
        }
    }
}
