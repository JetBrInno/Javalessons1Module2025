package org.example.Lesson5;

public class Microsoft {
    public static void main(String[] args) {
        Employee mark = new Employee("Mark", "Scout", 40, "mark@google.com", 1000);
        mark.setSalary(1.5);
        mark.setSalary(1.5);

        double marksSalary = mark.getSalary();
        System.out.println(marksSalary);
    }
}
