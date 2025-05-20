package org.example.Lesson7;

import java.util.Objects;

public class User {

    public String name;

    public String surname;

    public int age;

    public String email;

    private double salary;

    public User(String name, String surname, int age, String email, double salary) {
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Double.compare(salary, user.salary) == 0 && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, email, salary);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }
}
