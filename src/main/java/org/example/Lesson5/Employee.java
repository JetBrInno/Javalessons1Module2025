package org.example.Lesson5;

public class Employee {

    public String name;

    public String surname;

    public int age;

    public String email;

    private double salary;

    public Employee(String name, String surname, int age, String email, double salary) {
        this.name = name;
        this.surname = surname;

        if (age < 100 && age > 12) {
            this.age = age;
        }
        else {
            this.age = 0;
        }
        this.email = email;
        this.salary = salary;
    }

    public void setSalary(double coefficient) {
        if (coefficient > 1.1 && coefficient < 2) {
            salary = salary * coefficient;
        }
        else {
            System.out.println("Вы пытаетесь повысить зарплату на недопустимую сумму");
        }
    }

    public double getSalary() {
        return salary;
    }
}
