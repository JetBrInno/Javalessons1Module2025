package org.example.Lesson7;

public class AboutArray {

    public static void main(String[] args) {
//        int[] numbers = new int[10];
//        numbers[0] = 100;
//        numbers[1] = 150;
//        numbers[3] = 1000;
//        for (int n : numbers) {
//            System.out.println(n);
//        }
//
//        //System.out.println(numbers[0]);
//
//        System.out.println("Длина: " + numbers.length);

        String[] users = new String[10];
        users[0] = "Max";
        users[1] = "Alex";
        users[3] = "Jack";
        for (String u : users) {
            if (u != null) {
                System.out.println(u.length());
            }
            else {
                System.out.println("Это null");
            }
        }
    }
}
