package org.example.Lesson6;

public class PrimAndRef {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        x = y;
        x++;

        System.out.println(x);
        System.out.println(y);

        EmployeeL6 mark = new EmployeeL6("Mark", "Scout", 40, "mark@google.com", 1000);
        EmployeeL6 john = new EmployeeL6("John", "Johnson", 33, "jjj@google.com", 12345);
        mark = john;
        mark.setName("НеМарк");

        System.out.println(mark.getName());
        System.out.println(john.getName());
    }
}
