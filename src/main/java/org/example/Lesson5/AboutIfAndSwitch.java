package org.example.Lesson5;

import java.util.Scanner;

public class AboutIfAndSwitch {

    public static void main(String[] args) {
        double price = 100;
        String promoCode = new Scanner(System.in).nextLine();

//        if (promoCode.equals("cyber-monday")) {
//            price = price * 0.85;
//        }
//        else if (promoCode.equals("black-friday")) {
//            price = price * 0.5;
//        }
//        else if (promoCode.equals("super")) {
//            price = price * 0.7;
//        }
//        else {
//            System.out.println("Такого промокода не существует");
//        }
        switch (promoCode) {
            case "cyber-monday":
                price = price * 0.85;
                break;
            case "black-friday":
                price = price * 0.5;
                break;
            case "super":
                price = price * 0.7;
                break;
            default:
                System.out.println("Такого промокода не существует");
        }

        System.out.println("Итоговая цена: " + price);
    }
}
