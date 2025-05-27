package org.example.Lesson9;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            try {
                System.out.println("Что делим");
                int input = new Scanner(System.in).nextInt();  //
                System.out.println("На что делим");
                int input2 = new Scanner(System.in).nextInt();  //
                int result = input/input2;
                System.out.println(result);
            }
            catch (InputMismatchException exception) {
                System.out.println("Вы ввели неверные данные");
            }
            catch (ArithmeticException exception) {
                System.out.println("Делить на ноль нельзя");
            }
            finally {
                System.out.println("всегда");
            }

            //InputMismatchException
            //ArithmeticException
        }
    }
}
